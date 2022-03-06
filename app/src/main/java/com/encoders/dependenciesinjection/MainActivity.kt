package com.encoders.dependenciesinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.encoders.dependenciesinjection.Modules.NotifiacationServiceModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService: UserRegistrationService

    @Inject
    lateinit var notification: Notification

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component = DaggerUserRegistrationComponent.builder()
            .notifiacationServiceModule(NotifiacationServiceModule(4))
            .build()
        component.inject(this)
       // userRegistrationService.registerUser("sadeeqrahman1@gmail.com","sadeeq123")

        userRegistrationService.registerUser("MAINACTIVITY","Send From MainActivity")

     }
}