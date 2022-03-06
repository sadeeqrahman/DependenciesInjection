package com.encoders.dependenciesinjection

import android.util.Log
import javax.inject.Inject



interface UserRepository{
    fun saveUser(email: String, password: String)
}


class SQLRepository @Inject constructor() : UserRepository{

    override fun saveUser(email: String, password: String){
        Log.e("User Saved","User Saved in SQLite Database ")
    }
}


class  FirebaseRepository : UserRepository{
    override fun saveUser(email: String, password: String){
        Log.e("User Saved","User Saved in Firebase Database ")
    }
}