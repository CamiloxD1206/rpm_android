// RegisterActivity.kt
package com.example.pruebas

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pruebas.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerButton.setOnClickListener {
            val nombre = binding.nombreuser.text.toString()
            val apellido = binding.apellidouser.text.toString()
            val email = binding.emailuser.text.toString()
            val password = binding.passworduser.text.toString()

            saveUserData(nombre, apellido, email, password)

            val intent = Intent(this, LoginActivity::class.java)
                .putExtra("registered_email", email)
                .putExtra("registered_password", password)
            startActivity(intent)
        }

        binding.txtLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun saveUserData(nombre: String, apellido: String, email: String, password: String) {
        val sharedPreferences = getSharedPreferences("user_data", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        editor.putString("nombre", nombre)
        editor.putString("apellido", apellido)
        editor.putString("email", email)
        editor.putString("password", password)

        editor.apply()
    }


}
