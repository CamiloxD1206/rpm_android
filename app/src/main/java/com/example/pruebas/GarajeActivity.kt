package com.example.pruebas

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pruebas.databinding.ActivityGarajeBinding

class GarajeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGarajeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGarajeBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
