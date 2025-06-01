package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import com.example.calculadorabien.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1 = Number1.text
        val n2 = Number2.text

        button_plus.setOnClickListener {
            val sumResult = n1.toString().toDouble() + n2.toString().toDouble()
            result_view.text = sumResult.toString()
        }

        button_minus.setOnClickListener {
            val sumResult = n1.toString().toDouble() - n2.toString().toDouble()
            result_view.text = sumResult.toString()
        }

        button_multiply.setOnClickListener {
            val sumResult = n1.toString().toDouble() * n2.toString().toDouble()
            result_view.text = sumResult.toString()
        }

        button_divide.setOnClickListener {
            val sumResult = n1.toString().toDouble() / n2.toString().toDouble()
            result_view.text = sumResult.toString()
        }
    }
}

