package com.encoders.dependenciesinjection.Modules

import com.encoders.dependenciesinjection.Annotation.MessageQualifier
import com.encoders.dependenciesinjection.EmailServices
import com.encoders.dependenciesinjection.MessageSend
import com.encoders.dependenciesinjection.Notification
import dagger.Module
import dagger.Provides
import javax.inject.Inject
import javax.inject.Named

@Module
class NotifiacationServiceModule(val count: Int) {


    @Provides
    fun getMessageService(): Notification {
        return MessageSend(count)
    }


    @Named("Message")
    @Provides
    fun getEmailService(emailServices: EmailServices): Notification {
        return emailServices
    }


}