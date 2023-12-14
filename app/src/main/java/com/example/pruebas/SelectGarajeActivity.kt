package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebas.databinding.ActivitySelectGarajeBinding

class SelectGarajeActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySelectGarajeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectGarajeBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        binding.root.setOnClickListener{
            val intent = Intent(this, GarajeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}