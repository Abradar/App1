package com.example.app1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
//import android.widget.Toast
//import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById<Button>(R.id.roll_dice_button)

        rollButton.setOnClickListener{
            rollDice()
        }
    }
    private fun rollDice(){
        //Toast.makeText(this, "@string/dice_rolled",
        //    Toast.LENGTH_SHORT).show()

        val resultText = findViewById<TextView>(R.id.number_tv)
        resultText.text = getString(R.string.dice_rolled)
        val randomInt = (1..6).random()
        resultText.text=randomInt.toString()
    }
}