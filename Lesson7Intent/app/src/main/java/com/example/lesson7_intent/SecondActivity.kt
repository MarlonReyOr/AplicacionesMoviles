package com.example.lesson7_intent

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val message = intent.getStringExtra("name")

        // Encuentra la vista por su ID
        val helloMessageTextView = findViewById<TextView>(R.id.hello_message)
        helloMessageTextView.text = message
    }
}