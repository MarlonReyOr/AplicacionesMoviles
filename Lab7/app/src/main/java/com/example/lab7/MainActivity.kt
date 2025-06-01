package com.example.lab7

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

    fun mySchedule(view: View){
        val nameId = findViewById<EditText>(R.id.nameId)
        val addressId = findViewById<EditText>(R.id.addressId)
        val cityId = findViewById<EditText>(R.id.cityId)
        val stateId = findViewById<EditText>(R.id.stateId)
        val zipId = findViewById<EditText>(R.id.zipId)
        val countryId = findViewById<EditText>(R.id.countryId)

        var intent = Intent(this, Confirm::class.java)
        intent.putExtra("name", nameId.text.toString())
        intent.putExtra("address", addressId.text.toString())
        intent.putExtra("city", cityId.text.toString())
        intent.putExtra("state", stateId.text.toString())
        intent.putExtra("zipCode", zipId.text.toString())
        intent.putExtra("country", countryId.text.toString())
        startActivity(intent)
    }
}
