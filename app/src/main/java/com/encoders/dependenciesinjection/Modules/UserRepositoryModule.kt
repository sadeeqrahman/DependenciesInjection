package com.encoders.dependenciesinjection.Modules

import com.encoders.dependenciesinjection.FirebaseRepository
import com.encoders.dependenciesinjection.SQLRepository
import com.encoders.dependenciesinjection.UserRepository
import dagger.Binds
import dagger.Module
import dagger.Provides


@Module
abstract class UserRepositoryModule {

//    @Provides
//    fun getSQliteRepository(sqlRepository: SQLRepository): UserRepository {
//        return sqlRepository
//    }


    @Binds
    abstract fun getSQliteRepository(sqlRepository: SQLRepository): UserRepository

}