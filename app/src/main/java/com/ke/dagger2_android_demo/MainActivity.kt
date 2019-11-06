package com.ke.dagger2_android_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.android.AndroidInjection
import javax.inject.Inject

class MainActivity : AppCompatActivity() {


    @Inject
    lateinit var user: User

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        user.toString().log()
    }
}
