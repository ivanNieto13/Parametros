package com.example.parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        analytics = Firebase.analytics

        analytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT) {
            param(FirebaseAnalytics.Param.ITEM_ID, "id");
            param(FirebaseAnalytics.Param.ITEM_NAME, "pantalla principal");
            param(FirebaseAnalytics.Param.CONTENT_TYPE, "Pantalla");
        }
    }

    fun click(view: View) {
        val parametros = Bundle()

        val alumno1 = Alumno1("ivan", "311023659")
        val alumno2 = Alumno2("ivan 2", "2222222")
        val alumno3 = Alumno3("ivan 3", "3333333")

        val intent = Intent(this, MainActivity2::class.java)

        analytics.logEvent("clic-boton"){
            param("accion", "clic")
            param("texto-boton", "Ir a 2")
        }

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