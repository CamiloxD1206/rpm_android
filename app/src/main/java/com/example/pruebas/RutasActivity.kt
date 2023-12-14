package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebas.databinding.ActivityRutasBinding

class RutasActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRutasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRutasBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnBack.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}