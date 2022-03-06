package com.encoders.dependenciesinjection

import com.encoders.dependenciesinjection.Modules.NotifiacationServiceModule
import com.encoders.dependenciesinjection.Modules.UserRepositoryModule
import dagger.Component


@Component(modules = [UserRepositoryModule::class, NotifiacationServiceModule::class])
interface UserRegistrationComponent {
//    fun getUserRegistrationService() : UserRegistrationService
//    fun emailservices(): EmailServices


    fun inject(mainActivity: MainActivity)


    @Component.Factory
    interface  factory{

    }

}