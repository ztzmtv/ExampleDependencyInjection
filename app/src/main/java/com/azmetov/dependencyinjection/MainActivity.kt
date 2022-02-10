package com.azmetov.dependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.azmetov.dependencyinjection.example.Activity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val activity = Activity()
        activity.keyboard.toString()
        activity.monitor.toString()
        activity.mouse.toString()
    }
}