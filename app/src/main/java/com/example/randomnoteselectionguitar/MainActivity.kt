package com.example.randomnoteselectionguitar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val x = when((1..12).random()) {
            1 -> "A"
            2 -> "A sharp/B flat"
            3 -> "B"
            4 -> "C"
            5 -> "C Sharp/D Flat"
            6 -> "D"
            7 -> "D sharp/E Flat"
            8 -> "E"
            9 -> "F"
            10 -> "F sharp/G Flat"
            11 -> "G"
            else -> "G Sharp/A Flat"
        }
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = x + " on fret " + (1..6).random().toString()
    }


}