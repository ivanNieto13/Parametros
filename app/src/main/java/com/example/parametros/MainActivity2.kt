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
        val alumno1 = bundle?.getSerializable("alumno1") as Alumno1
        val alumno2 = bundle.getParcelable<Alumno2>("alumno2")

        if (alumno1 != null) {
            Toast.makeText(
                this,
                "nombre del alumno serializable: ${alumno1.nombre}, num cuenta: ${alumno1.numCuenta}",
                Toast.LENGTH_LONG
            ).show()
        }

        Toast.makeText(
            this,
            "nombre del alumno parcelable: ${alumno2?.nombre}, num cuenta: ${alumno2?.numCuenta}",
            Toast.LENGTH_LONG
        ).show()

        // Toast.makeText(this, "Nombre: $usuario, Sesion: $sesion", Toast.LENGTH_LONG).show()
    }
}