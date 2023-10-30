package com.idat.foddieapp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast




class home_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtBuscar = view.findViewById<EditText>(R.id.txtBuscarRest)
        val btnPollos = view.findViewById<Button>(R.id.btnCatPollos)
        val btnMariscos = view.findViewById<Button>(R.id.btnCatMariscos)
        val btnChifa = view.findViewById<Button>(R.id.btnCatChifa)
        val btnParrillas = view.findViewById<Button>(R.id.btnCatParrillas)
        val btnEncontrar = view.findViewById<Button>(R.id.btnBuscarRest)

        btnPollos.setOnClickListener {
            val mensaje = "Mensaje: El listado de los restaurantes especializados en pollos estará disponible pronto...!"
            val duración = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duración)
            toast.show()
        }

        btnMariscos.setOnClickListener {
            val mensaje = "Mensaje: El listado de los restaurantes especializados en mariscos estará disponible pronto...!"
            val duración = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duración)
            toast.show()
        }

        btnChifa.setOnClickListener {
            val mensaje = "Mensaje: El listado de los restaurantes especializados en comida chifa estará disponible pronto...!"
            val duración = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duración)
            toast.show()
        }

        btnParrillas.setOnClickListener {
            val mensaje = "Mensaje: El listado de los restaurantes especializados en parrillas estará disponible pronto...!"
            val duración = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duración)
            toast.show()
        }

        btnEncontrar.setOnClickListener {
            val buscar = txtBuscar.text.toString()
            val mensaje = "Restaurante: $buscar"
            val duración = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duración)
            toast.show()
        }
    }
}