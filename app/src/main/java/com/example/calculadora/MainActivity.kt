package com.example.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var numero1: EditText
    lateinit var numero2: EditText
    lateinit var btnCalcular: Button
    lateinit var result: TextView
    lateinit var operador: Spinner
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupView()
        setupListners()
    }

    fun setupView() {
        numero1 = findViewById(R.id.ed_numero1)
        numero2 = findViewById(R.id.ed_numero2)
        btnCalcular = findViewById(R.id.btn_calcular)
        result = findViewById(R.id.tv_resultado)
        operador = findViewById(R.id.sp_operador)
    }

    fun setupListners() {
        btnCalcular.setOnClickListener {
            val numero1 = numero1.text.toString().toFloat()
            val numero2 = numero2.text.toString().toFloat()
            var resultado: Float = 0.0F
            when (operador.selectedItem.toString()) {
                "Soma" -> resultado = numero1 + numero2
                "Subtração" -> resultado = numero1 - numero2
                "Multiplicação" -> resultado = numero1 * numero2
                "Divisão" -> resultado = numero1 / numero2

            }

            result.text = resultado.toString()


        }
    }
}