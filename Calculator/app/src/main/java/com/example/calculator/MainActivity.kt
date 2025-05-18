package com.example.calculator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val number1: EditText = findViewById(R.id.Number1)
        val number2: EditText = findViewById(R.id.Number2)
        val buttonPlus: Button = findViewById(R.id.button_plus)
        val buttonMinus: Button = findViewById(R.id.button_minus)
        val buttonMultiply: Button = findViewById(R.id.button_multiply)
        val buttonDivide: Button = findViewById(R.id.button_divide)
        val resultView: TextView = findViewById(R.id.result_view)

        buttonPlus.setOnClickListener {
            val n1 = number1.text.toString().toDouble()
            val n2 = number2.text.toString().toDouble()
            val sumResult = n1 + n2
            resultView.text = "Resultado= "+sumResult.toString()
        }

        buttonMinus.setOnClickListener {
            val n1 = number1.text.toString().toDouble()
            val n2 = number2.text.toString().toDouble()
            val sumResult = n1 - n2
            resultView.text = "Resultado= "+ sumResult.toString()
        }

        buttonMultiply.setOnClickListener {
            val n1 = number1.text.toString().toDouble()
            val n2 = number2.text.toString().toDouble()
            val sumResult = n1 * n2
            resultView.text ="Resultado= "+ sumResult.toString()
        }

        buttonDivide.setOnClickListener {
            val n1 = number1.text.toString().toDouble()
            val n2 = number2.text.toString().toDouble()
            val sumResult = n1 / n2
            resultView.text =  sumResult.toString()
        }
    }
}

