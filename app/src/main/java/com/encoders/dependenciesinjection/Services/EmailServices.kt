package com.encoders.dependenciesinjection

import android.util.Log
import javax.inject.Inject



interface Notification{
    fun send(to: String, from: String, body: String)
}


class EmailServices @Inject constructor() : Notification{

    override fun send(to: String, from: String, body: String){
        Log.e("Email Sent","Confirmation Email Send Successfully")
    }
}


class MessageSend(val count: Int) : Notification{
    override fun send(to: String, from: String, body: String) {
        Log.e("Message Sent",count.toString())
    }

}