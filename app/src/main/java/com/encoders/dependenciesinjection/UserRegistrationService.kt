package com.encoders.dependenciesinjection

import com.encoders.dependenciesinjection.Annotation.MessageQualifier
import javax.inject.Inject
import javax.inject.Named

class UserRegistrationService @Inject constructor(
    private var userRepository: UserRepository,
   @Named("Message") private var notification: Notification
) {

    fun registerUser(email: String, password: String) {
        userRepository.saveUser(email,password)
        notification.send(email,"sadeeqrahman.encoders@gmail.com","User Registered Successfully")


    }

}