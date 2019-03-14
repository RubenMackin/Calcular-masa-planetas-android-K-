package com.teamtaller.masaplanetas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.text.DecimalFormat

class MasaJupiter : AppCompatActivity() {

    lateinit var txv_pesoJupiter : TextView
    lateinit var obtencionIntent : Intent
    lateinit var peso : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masa_jupiter)

        txv_pesoJupiter = findViewById(R.id.txv_pesoJupiter)

        obtencionIntent = intent
        peso = obtencionIntent.getStringExtra("peso")
        //peso jupiter
        txv_pesoJupiter.text = obtenerDosDecimales((peso.toDouble()/9.81)*24.79)
    }

    fun btn_MarteJupiter(view: View){
        val intent = Intent(applicationContext, MasaMarte::class.java)
        intent.putExtra("peso", peso)
        startActivity(intent)
        finish()
    }

    fun btn_Regresar(view: View){
        val intent = Intent(applicationContext, MasaTierra::class.java)
        startActivity(intent)
        finish()
    }

    private fun obtenerDosDecimales(valor: Double): String {
        val format = DecimalFormat()
        //Numero de decimales
        format.setMaximumFractionDigits(2)
        return format.format(valor)
    }
}
