package com.idat.foddieapp3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button

class User_HistorialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_historial)
        val btnIrAtrasHistorial = findViewById<Button>(R.id.btnIrAtras3)
        btnIrAtrasHistorial.setOnClickListener {
            val intent = Intent(this, account_fragment::class.java)
            startActivity(intent)
        }
    }
}