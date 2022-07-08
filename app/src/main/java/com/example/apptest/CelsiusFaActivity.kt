package com.example.apptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import kotlin.math.roundToInt

class CelsiusFaActivity : AppCompatActivity() {

    private lateinit var btnInitial: ImageButton
    private lateinit var edtTxtCelsius: EditText
    private lateinit var txtCelsius: TextView
    private lateinit var btnCelsius: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celsius_fa)

        edtTxtCelsius = findViewById(R.id.edt_txt_celsius)
        txtCelsius = findViewById(R.id.txt_result_celsius)
        btnCelsius = findViewById(R.id.btn_conv_celsius)

        btnInitial = findViewById(R.id.btn_init_celsius)
        btnInitial.setOnClickListener { this.finish() }

        btnCelsius.setOnClickListener { calculateCelsius() }

    }
    private fun calculateCelsius(){
        val result: Double

        val temp: Double = edtTxtCelsius.text.toString().toDouble()

        result = (temp * 9 / 5 + 32).roundToInt().toDouble()

        txtCelsius.text = result.toString()


    }
}