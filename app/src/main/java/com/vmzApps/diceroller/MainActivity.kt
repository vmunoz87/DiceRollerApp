package com.vmzApps.diceroller

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random
import kotlin.random.nextInt


class MainActivity : AppCompatActivity() {

    //Added line
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
        val diceResult : TextView = findViewById(R.id.dice_result_text)
        diceImage = findViewById(R.id.dice_Image)

        diceResult.text = "Dice rolling Game"
        rollButton.text= "Let's roll babe"

        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val drawableRessource = when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_Image.setImageResource(drawableRessource)
    }

}