package com.example.parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {
        val parametros = Bundle()

        val intent = Intent(this, MainActivity2::class.java)

        /*parametros.putString("usuario", "Ivan")
        parametros.putInt("sesion", 12345)*/

        parametros.apply {
            putString("usuario", "ivan")
            putInt("sesion", 12345)
        }

        intent.putExtras(parametros)

        startActivity(intent)
    }
}