package com.hummingmoon.studentcalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(3000)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        iniciarComponentes()
    }


    private fun iniciarComponentes() {
        val miboton1: Button = findViewById(R.id.btn_Registro)
        val miboton2: Button = findViewById(R.id.btn_Estadisticas)
        val miboton3: Button = findViewById(R.id.btn_Ayuda)

        miboton1.setOnClickListener{ onClick(1)}
        miboton2.setOnClickListener { onClick(2) }
        miboton3.setOnClickListener { onClick(3) }
    }

    private fun onClick(boton: Int) {

    }
}