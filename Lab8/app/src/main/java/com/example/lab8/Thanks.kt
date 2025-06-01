package com.example.lab8

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Thanks : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thanks)

        val nameId: TextView = findViewById(R.id.nameId)
        val phoneId: TextView = findViewById(R.id.phoneId)
        val sizeId: TextView = findViewById(R.id.sizeId)
        val dateId: TextView = findViewById(R.id.dateId)
        val timeId: TextView = findViewById(R.id.timeId)
        val sendBtn: Button = findViewById(R.id.sendBtn)
        val rateText: TextView = findViewById(R.id.rateText)
        val myratingBar: RatingBar = findViewById(R.id.myratingBar)

        nameId.text = intent.getStringExtra("name")
        phoneId.text = intent.getStringExtra("phoneNumber")
        sizeId.text = intent.getStringExtra("pizzaSize")
        dateId.text = intent.getStringExtra("pickupDate")
        timeId.text = intent.getStringExtra("pickupTime")

        sendBtn.setOnClickListener {
            rateText.text = myratingBar.rating.toString()
        }
    }
}
