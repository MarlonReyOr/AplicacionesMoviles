package com.example.lab8

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Vincular vistas del XML con el código Kotlin
        val slider: SeekBar = findViewById(R.id.mySeekBar)
        val value: TextView = findViewById(R.id.miPizzaSize)
        val dateBtn: Button = findViewById(R.id.dateBtn)
        val dateText: TextView = findViewById(R.id.dateText)
        val scheduleBtn: Button = findViewById(R.id.scheduleBtn)
        val myFullName: TextView = findViewById(R.id.myFullName)
        val myPhoneNumber: TextView = findViewById(R.id.myPhoneNumber)
        val myPizzaSize: TextView = findViewById(R.id.miPizzaSize)

        val pizzaSize = arrayListOf("Please Select", "Small", "Medium", "Large", "Extra-Large")

        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text = pizzaSize[progress]
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {}
            override fun onStopTrackingTouch(seekBar: SeekBar?) {}
        })

        dateBtn.setOnClickListener {
            val c = Calendar.getInstance()
            val day = c.get(Calendar.DAY_OF_MONTH)
            val month = c.get(Calendar.MONTH)
            val year = c.get(Calendar.YEAR)

            val myDatePicker = DatePickerDialog(
                this,
                android.R.style.ThemeOverlay_Material_Dialog_Alert,
                DatePickerDialog.OnDateSetListener { _, selectedYear, selectedMonth, selectedDay ->
                    dateText.text = "$selectedDay/${selectedMonth + 1}/$selectedYear"
                },
                year, month, day
            )

            myDatePicker.show()
        }
        val timeBtn: Button = findViewById(R.id.timeBtn)
        val timeText: TextView = findViewById(R.id.timeText)

        timeBtn.setOnClickListener {
            val c = Calendar.getInstance()
            val hour = c.get(Calendar.HOUR_OF_DAY)
            val minutes = c.get(Calendar.MINUTE)

            val myTimePicker = TimePickerDialog(
                this,
                TimePickerDialog.OnTimeSetListener { _, hourOfDay, minute ->
                    timeText.text = "$hourOfDay : $minute"
                },
                hour, minutes, true
            )
            myTimePicker.show()
        }

        scheduleBtn.setOnClickListener {
            val intent = Intent(this, Thanks::class.java)
            intent.putExtra("name", myFullName.text.toString())
            intent.putExtra("phoneNumber", myPhoneNumber.text.toString())
            intent.putExtra("pizzaSize", myPizzaSize.text.toString())
            intent.putExtra("pickupDate", dateText.text.toString())
            intent.putExtra("pickupTime", timeText.text.toString())

            startActivity(intent)
        }
    }
}


