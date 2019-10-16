package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val rollButton2: Button = findViewById(R.id.roll_button2)
        rollButton2.setOnClickListener { rollDice2() }

        val rollButton3: Button = findViewById(R.id.roll_button3)
        rollButton3.setOnClickListener { rollDice3() }

    }


    private fun rollDice() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

    }
    private fun rollDice2() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1

        val resultText2: TextView = findViewById(R.id.result_text2)
        resultText2.text = randomInt.toString()

    }
    private fun rollDice3() {
        // Toast.makeText(this, "button clicked",
        //  Toast.LENGTH_SHORT).show()
        val randomInt = Random().nextInt(6) + 1

        val resultText3: TextView = findViewById(R.id.result_text3)
        resultText3.text = randomInt.toString()

    }
}