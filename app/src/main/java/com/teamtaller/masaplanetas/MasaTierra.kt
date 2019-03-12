package com.teamtaller.masaplanetas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.EditText
import android.widget.Toast
import java.text.DecimalFormat

class MasaTierra : AppCompatActivity() {

    lateinit var edt_pesoTierra : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masa_tierra)

        edt_pesoTierra = findViewById(R.id.edt_pesoTierra)
    }

    fun btn_marte(view: View){
        val pesoPersona = edt_pesoTierra.text.toString()

        if (TextUtils.isEmpty(pesoPersona)) {
            Toast.makeText(applicationContext, "Ingresa el peso",Toast.LENGTH_SHORT).show()
        }else{
            val pesoMarte = (pesoPersona.toDouble()/9.81)*3.711
            val intent = Intent(applicationContext, MasaMarte::class.java)
            intent.putExtra("pesoMarte", obtenerDosDecimales(pesoMarte))
            startActivity(intent)
        }
    }

    fun btn_jupiter(view: View){
        val pesoPersona = edt_pesoTierra.text.toString()

        if (TextUtils.isEmpty(pesoPersona)) {
            Toast.makeText(applicationContext, "Ingresa el peso",Toast.LENGTH_SHORT).show()
        }else{
            val pesoJupiter = (pesoPersona.toDouble()/9.81)*24.79
            val intent = Intent(applicationContext, MasaJupiter::class.java)
            intent.putExtra("pesoJupiter", obtenerDosDecimales(pesoJupiter))
            startActivity(intent)
        }
    }

    private fun obtenerDosDecimales(valor: Double): String {
        val format = DecimalFormat()
        //Numero de decimales
        format.setMaximumFractionDigits(2)
        return format.format(valor)
    }
}
