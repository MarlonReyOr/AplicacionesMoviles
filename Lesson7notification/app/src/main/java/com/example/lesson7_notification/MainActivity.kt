package com.example.lesson7_notification

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Intent
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.NotificationCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun courseupdate(view: View) {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {

            // Crear el canal de notificación
            val channel_id = "channel_01"
            val channel_Name = "notification"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val mChannel = NotificationChannel(channel_id, channel_Name, importance)
            mChannel.description = "test description"
            mChannel.enableLights(true)
            mChannel.lightColor = Color.RED
            mChannel.enableVibration(true)

            val Intent=Intent(this,ResultActivity::class.java).apply{ flags=Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK}
            val pendingIntent:PendingIntent= PendingIntent.getActivity(this,0,Intent,
                PendingIntent.FLAG_IMMUTABLE)

            // Crear la notificación
            val notification = Notification.Builder(this, channel_id)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Android ATC Notification")
                .setContentText("Check Android ATC New Course !!")
                .setContentIntent(pendingIntent)
                .build()
            val mNotificationManager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager

            if (mNotificationManager != null) {
                mNotificationManager.createNotificationChannel(mChannel)
                mNotificationManager.notify(1, notification)
            } else {
                // When SDK version is less than 26
                val notification: Notification = NotificationCompat.Builder(this, channel_id)
                    .setSmallIcon(R.drawable.ic_launcher_background)
                    .setContentTitle("Android ATC Notification")
                    .setContentText("Check Android ATC New Course !!")
                    .build()
                mNotificationManager.notify(1, notification)
            }

        }
    }
}
