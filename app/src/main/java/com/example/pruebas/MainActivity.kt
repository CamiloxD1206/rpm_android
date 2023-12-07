package com.example.pruebas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnlogin.setOnClickListener {
           val intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
       binding.btnregister.setOnClickListener {
         val intent = Intent(this,RegisterActivity::class.java)
           startActivity(intent)
            finish()
       }
    }
}
