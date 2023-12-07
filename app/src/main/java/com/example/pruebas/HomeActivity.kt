// HomeActivity.kt
package com.example.pruebas

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebas.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
        val nombre = sharedPreferences.getString("nombre", "")
        val apellido = sharedPreferences.getString("apellido", "")
        val email = sharedPreferences.getString("email", "")


        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        welcomeMessage.text = "Bienvenido, $nombre "
    }
}
