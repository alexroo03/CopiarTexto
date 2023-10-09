package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiartexto.R.*
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener{
            binding.saludo.text = "Hola," + binding.nombre.text.toString()
            Toast.makeText(this,binding.nombre.text.toString(), Toast.LENGTH_LONG).show()
        }

        binding.limpiar.setOnClickListener{
            binding.nombre.text.clear()
            binding.saludo.text =binding.nombre.text.toString()
        }
        /*
        setContentView(layout.activity_main)

        //Referencia al boton
        var btn = findViewById<Button>(R.id.boton)

        //Referencia al cuadro de texto
        var texto = findViewById<EditText>(id.nombre)

        //Referencia al cuadro de saludo
        var saludo = findViewById<TextView>(id.saludo)

        //Referencia al cuadro de saludo
        var limpiar = findViewById<Button>(R.id.limpiar)


        btn.setOnClickListener{
            saludo.setText("Hola " + texto.text.toString())
        }
        limpiar.setOnClickListener {
            texto.text.clear()
            saludo.setText(texto.text.toString())
        }
    */

    }
}