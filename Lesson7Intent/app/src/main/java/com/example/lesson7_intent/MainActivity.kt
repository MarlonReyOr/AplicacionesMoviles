package com.example.lesson7_intent

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun go2secondActivity(view: View) {
        val intent = Intent(this, SecondActivity::class.java)

        // Encuentra la vista por su ID
        val nameEditText = findViewById<EditText>(R.id.nameID) // Asumiendo que nameID es un EditText
        val nameFromEditText = nameEditText.text.toString()

        intent.putExtra("name", nameFromEditText)
        startActivity(intent)
    }
}
