package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Referencia al boton
        var btn = findViewById<Button>(R.id.boton)

        //Referencia al cuadro de texto
        var texto = findViewById<EditText>(R.id.nombre)

        //Referencia al cuadro de saludo
    }
}