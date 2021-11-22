package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button_1).setOnClickListener {
            findViewById<EditText>(R.id.wyswietlacz_tekstu).setText("To \n jest \n napis")
            findViewById<EditText>(R.id.wyswietlacz_dolny).setText("To \n jest \n dolny \n tekst")
        }
        findViewById<Button>(R.id.button_2).setOnClickListener {
            findViewById<EditText>(R.id.wyswietlacz_tekstu).setText(R.string.Wpisz_napis)
            findViewById<EditText>(R.id.wyswietlacz_dolny).setText(R.string.Wpisz_napis)
        }
    }
}