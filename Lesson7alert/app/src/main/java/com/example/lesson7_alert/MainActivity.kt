package com.example.lesson7_alert

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save(view: View) {
        val saveAlert = AlertDialog.Builder(this)
        saveAlert.setTitle("Save")
        saveAlert.setMessage("Are you sure you want to save your changes?")

        saveAlert.setPositiveButton("Yes") { dialogInterface: DialogInterface, _: Int ->
            Snackbar.make(findViewById(R.id.button), "Saved", Snackbar.LENGTH_LONG).show()
        }

        saveAlert.setNegativeButton("No") { dialogInterface: DialogInterface, _: Int ->
            Snackbar.make(findViewById(R.id.button), "Not Saved", Snackbar.LENGTH_LONG).show()
        }

        saveAlert.setNeutralButton("Remind me later", null)

        saveAlert.show()
    }
}
