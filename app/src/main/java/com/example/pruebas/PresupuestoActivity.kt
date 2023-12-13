package com.example.pruebas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.pruebas.databinding.ActivityPresupuestoBinding

class PresupuestoActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPresupuestoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPresupuestoBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }
}