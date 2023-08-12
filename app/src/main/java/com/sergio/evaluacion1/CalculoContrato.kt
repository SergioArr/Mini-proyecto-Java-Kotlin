package com.sergio.evaluacion1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculoContrato : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculo_contrato)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickListener {
            val resultado = findViewById<TextView>(R.id.tvResultado)
            val bruto = findViewById<EditText>(R.id.etBruto)
            val valorBruto = bruto.text.toString().toDoubleOrNull() ?: 0.0
            val sueldo = EmpleadoRegular(valorBruto)
            val sueldoliquido = sueldo.calcularLiquido()
            resultado.text = "El sueldo líquido es $: ${sueldoliquido} .-"
        }
    }

    fun volverAtras(view: View) {
        finish()
    }
}

