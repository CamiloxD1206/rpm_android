// LoginActivity.kt
package com.example.pruebas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pruebas.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val registeredEmail = intent.getStringExtra("registered_email")
        val registeredPassword = intent.getStringExtra("registered_password")

        binding.editTextEmail  .setText(registeredEmail)
        binding.editTextPassword .setText(registeredPassword)

        binding.buttonIngreso .setOnClickListener {
            val enteredEmail = binding.editTextEmail .text.toString()
            val enteredPassword = binding.editTextPassword.text.toString()

            if (registeredEmail == enteredEmail && registeredPassword == enteredPassword) {

                startActivity(Intent(this, HomeActivity::class.java))
            } else {

                Toast.makeText(this, "Credenciales incorrectas", Toast.LENGTH_SHORT).show()
            }
        }

        binding.txtRegister.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
