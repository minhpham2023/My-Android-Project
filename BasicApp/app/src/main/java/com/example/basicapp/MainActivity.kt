package com.example.basicapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
// The main activity contains the Kotlin source code for the app's main Activity

// To change the text "Hello World!", ctrl+click on activity_main to view the activity_main.xml
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

}