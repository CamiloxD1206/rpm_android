// HomeActivity.kt
package com.example.pruebas

import android.content.Context
import android.content.Intent
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



        val welcomeMessage = findViewById<TextView>(R.id.welcomeMessage)
        welcomeMessage.text = "$nombre "


        binding.btnTrazarRuta.setOnClickListener{
            val intent = Intent(this, RutasActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnGaraje.setOnClickListener {
            val intent = Intent(this, GarajeActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnPresupuesto.setOnClickListener {
            val intent = Intent(this, PresupuestoActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnPerfilUser.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
