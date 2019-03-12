package com.teamtaller.masaplanetas

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MasaJupiter : AppCompatActivity() {

    lateinit var txv_pesoJupiter : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masa_jupiter)

        txv_pesoJupiter = findViewById(R.id.txv_pesoJupiter)

        val  obtencionIntent = intent
        val pesoJupiter = obtencionIntent.getStringExtra("pesoJupiter")
        txv_pesoJupiter.text = pesoJupiter
    }

    fun btn_Regresar(view: View){
        val intent = Intent(applicationContext, MasaTierra::class.java)
        startActivity(intent)
    }
}
