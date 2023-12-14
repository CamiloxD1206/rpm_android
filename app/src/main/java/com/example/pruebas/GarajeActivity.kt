package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebas.databinding.ActivityGarageBinding

class GarajeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityGarageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGarageBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        managerfun()
    }

    private fun managerfun () {
        listenclicks()
    }

    private fun listenclicks () {
        binding.btnBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnEditGaraje.setOnClickListener{
            val intent = Intent(this, SelectGarajeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }


}