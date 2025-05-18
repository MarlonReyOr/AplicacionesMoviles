package com.example.lesson7

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun mgSnack(view: View){
        Snackbar.make(findViewById(R.id.sendMessage),"Tu correo ha sido enviado exitosamente",Snackbar.LENGTH_LONG).setAction("OK"){}.setActionTextColor(Color.RED).show()
    }
}
