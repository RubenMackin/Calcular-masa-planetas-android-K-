package com.teamtaller.masaplanetas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import android.widget.Toast
import java.text.DecimalFormat

class MasaMarte : AppCompatActivity() {

    lateinit var txv_pesoMarte: TextView
    lateinit var obtencionIntent : Intent
    lateinit var peso : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masa_marte)

        txv_pesoMarte = findViewById(R.id.txv_pesoMarte)

        obtencionIntent = intent
        peso = obtencionIntent.getStringExtra("peso")
        //peso marte
        txv_pesoMarte.text = obtenerDosDecimales((peso.toDouble()/9.81)*3.711)

    }

    fun btn_JupiterMarte(view: View){
        val intent = Intent(applicationContext, MasaJupiter::class.java)
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
