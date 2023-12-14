package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebas.databinding.ActivityEditPerfilBinding

class EditPerfilActivity : AppCompatActivity() {

    private lateinit var binding : ActivityEditPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditPerfilBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}