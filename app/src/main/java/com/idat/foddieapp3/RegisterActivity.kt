package com.idat.foddieapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val txtEmailRegister = findViewById<EditText>(R.id.txtEmailRegister)
        val txtPasswordRegister = findViewById<EditText>(R.id.txtPasswordRegister)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {
            val email = txtEmailRegister.text.toString()
            val password = txtPasswordRegister.text.toString()

            // Crear un mensaje Toast con el email y la contraseña
            val mensaje = "Email: $email\nContraseña: $password"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, mensaje, duracion)

            // Mostrar el mensaje Toast
            toast.show()
        }
    }
}