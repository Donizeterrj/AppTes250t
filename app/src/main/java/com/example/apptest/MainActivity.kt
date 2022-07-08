package com.example.apptest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

        private lateinit var btnCelsius: LinearLayout

        private lateinit var btnFahrenheit: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCelsius = findViewById(R.id.btn_celsius)

        btnFahrenheit = findViewById(R.id.btn_fahrenheit)

        btnCelsius.setOnClickListener {
            val iCel = Intent(this, CelsiusFaActivity::class.java )
            startActivity(iCel)
        }

        btnFahrenheit.setOnClickListener{
            val iFa = Intent(this, FahrenheitCeActivity::class.java)
            startActivity(iFa)
        }

    }
}