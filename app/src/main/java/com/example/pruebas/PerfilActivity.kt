package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebas.databinding.ActivityPerfilBinding

class PerfilActivity : AppCompatActivity() {
    
    private lateinit var binding : ActivityPerfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerfilBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)

        binding.btnEditPerfil.setOnClickListener {
            val intent = Intent(this, EditPerfilActivity::class.java)
            startActivity(intent)
            finish()
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}