package com.example.lab7

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Confirm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirm)

        val SnameId = findViewById<TextView>(R.id.SnameId)
        val SaddressId = findViewById<TextView>(R.id.SaddressId)
        val ScityId = findViewById<TextView>(R.id.ScityId)
        val SstateId = findViewById<TextView>(R.id.SstateId)
        val SzipId = findViewById<TextView>(R.id.SzipId)
        val ScountryId = findViewById<TextView>(R.id.ScountryId)

        SnameId.text = intent.getStringExtra("name")
        SaddressId.text = intent.getStringExtra("address")
        ScityId.text = intent.getStringExtra("city")
        SstateId.text = intent.getStringExtra("state")
        SzipId.text = intent.getStringExtra("zipCode")
        ScountryId.text = intent.getStringExtra("country")
    }

    fun Accept(view: View) {
        var agree = Intent(this, ThankYou::class.java)
        startActivity(agree)
    }

    fun Edit(view: View) {
        onBackPressed()
    }
}
