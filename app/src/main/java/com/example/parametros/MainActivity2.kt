package com.example.parametros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        val usuario = bundle?.getString("usuario")
        val sesion = bundle?.getInt("sesion")

        Toast.makeText(this, "Nombre: $usuario, Sesion: $sesion", Toast.LENGTH_LONG).show()
    }
}