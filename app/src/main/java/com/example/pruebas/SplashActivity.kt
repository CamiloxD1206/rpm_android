package com.example.pruebas

import android.app.ActivityOptions
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Thread.sleep(1000)
        startActivity(Intent(this,MainActivity::class.java))
        finish()
        val opciones = ActivityOptions.makeCustomAnimation(
            this,
            R.anim.fade_custom,
            R.anim.fade_custom
        )

        startActivity(intent, opciones.toBundle())
        finish()

    }
}