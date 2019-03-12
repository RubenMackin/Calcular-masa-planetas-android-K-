package com.teamtaller.masaplanetas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MasaMarte : AppCompatActivity() {

    lateinit var txv_pesoMarte: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masa_marte)

        txv_pesoMarte = findViewById(R.id.txv_pesoMarte)

        val  obtencionIntent = intent
        val pesoMarte = obtencionIntent.getStringExtra("pesoMarte")
        txv_pesoMarte.text = pesoMarte

    }

    fun btn_Regresar(view: View){
        val intent = Intent(applicationContext, MasaTierra::class.java)
        startActivity(intent)
    }
}
