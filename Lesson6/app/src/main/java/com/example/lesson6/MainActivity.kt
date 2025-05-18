package com.example.lesson6

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun display(view: View) {
        val infoTextView = findViewById<TextView>(R.id.info)
        infoTextView.text = "Android Application Development ,Android Security Essentials and Monetize Android Applications"
    }
}

