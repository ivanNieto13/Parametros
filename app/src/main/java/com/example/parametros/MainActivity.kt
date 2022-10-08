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

        val alumno1 = Alumno1("ivan", "311023659")
        val alumno2 = Alumno2("ivan 2", "2222222")
        val alumno3 = Alumno3("ivan 3", "3333333")

        val intent = Intent(this, MainActivity2::class.java)

        /*parametros.putString("usuario", "Ivan")
        parametros.putInt("sesion", 12345)*/

        parametros.apply {
            putString("usuario", "ivan")
            putInt("sesion", 12345)
            putSerializable("alumno1", alumno1)
            putParcelable("alumno2", alumno2)
            putParcelable("alumno3", alumno3)
        }

        intent.putExtras(parametros)

        startActivity(intent)
    }
}