package com.idat.foddieapp3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class restaurant_fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_restaurant_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val txtBuscarPlato = view.findViewById<EditText>(R.id.txtBuscarRest2)
        val btnPlatos = view.findViewById<Button>(R.id.btnCatPlatos)
        val btnSnacks = view.findViewById<Button>(R.id.btnCatSnacks)
        val btnBebidas = view.findViewById<Button>(R.id.btnCatBebidas)
        val btnPostres = view.findViewById<Button>(R.id.btnCatPostres)
        val btnEncontrar = view.findViewById<Button>(R.id.btnBuscarRest2)

        btnPlatos.setOnClickListener {
            val mensaje = "Mensaje: El listado de platos del restaurante estará disponible pronto...!"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duracion)
            toast.show()
        }

        btnSnacks.setOnClickListener {
            val mensaje = "Mensaje: El listado de snacks del restaurante estará disponible pronto...!"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duracion)
            toast.show()
        }

        btnBebidas.setOnClickListener {
            val mensaje = "Mensaje: El listado de bebidas del restaurante estará disponible pronto...!"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duracion)
            toast.show()
        }

        btnPostres.setOnClickListener {
            val mensaje = "Mensaje: El listado de postres del restaurante estará disponible pronto...!"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duracion)
            toast.show()
        }

        btnEncontrar.setOnClickListener {
            val buscar = txtBuscarPlato.text.toString()
            val mensaje = "Plato: $buscar"
            val duracion = Toast.LENGTH_SHORT
            val toast = Toast.makeText(requireContext(), mensaje, duracion)
            toast.show()
        }
    }
}