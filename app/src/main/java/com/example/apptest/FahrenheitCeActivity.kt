package com.example.apptest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.math.ceil
import kotlin.math.roundToInt


class FahrenheitCeActivity : AppCompatActivity() {

    private lateinit var btnInitial: ImageButton
    private lateinit var edtTxtFah: EditText
    private lateinit var txtResult: TextView
    private lateinit var btnCalc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fahrenheit_ce)

        edtTxtFah = findViewById(R.id.edt_txt_fahr)
        txtResult = findViewById(R.id.txt_result_fahr)
        btnCalc= findViewById(R.id.btn_conv_far)


        btnInitial = findViewById(R.id.btn_init)

        btnInitial.setOnClickListener {
            this.finish()
        }


        btnCalc.setOnClickListener {
        calculateFahr()
        }

    }

   private fun calculateFahr() {
       val result: Double

       val temp: Double = edtTxtFah.text.toString().toDouble()

       result = ((temp - 32) * 5 / 9).roundToInt().toDouble()


       txtResult.text = result.toString()
   }
}