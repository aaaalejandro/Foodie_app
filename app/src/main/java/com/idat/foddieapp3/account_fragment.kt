package com.idat.foddieapp3

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup




class account_fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_account_fragment, container, false)

        // Obtén una referencia al botón btnHistorial
        val btnHistorial = view.findViewById<View>(R.id.btnHistorial)
        val btnAyuda = view.findViewById<View>(R.id.btnAyuda)
        val btnFAQ = view.findViewById<View>(R.id.btnFAQ2)

        btnHistorial.setOnClickListener {
            // Crea una instancia de Intent para iniciar la Activity de destino
            val intent = Intent(activity, User_HistorialActivity::class.java)

            // Inicia la Activity
            startActivity(intent)
        }
        btnAyuda.setOnClickListener {
            // Crea una instancia de Intent para iniciar la Activity de destino
            val intent = Intent(activity, User_AyudaActivity::class.java)

            // Inicia la Activity
            startActivity(intent)
        }
        btnFAQ.setOnClickListener {
            // Crea una instancia de Intent para iniciar la Activity de destino
            val intent = Intent(activity, User_FAQActivity::class.java)

            // Inicia la Activity
            startActivity(intent)
        }

        return view
    }
}