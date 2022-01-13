package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRoll = findViewById<Button>(R.id.btnRoll)
        var imgDice = findViewById<ImageView>(R.id.imgDice)

        btnRoll.setOnClickListener {
            var diceRoll = Random.nextInt(6)+1
            when(diceRoll){
                1 -> imgDice.setImageResource(R.drawable.dice_1)
                2 -> imgDice.setImageResource(R.drawable.dice_2)
                3 -> imgDice.setImageResource(R.drawable.dice_3)
                4 -> imgDice.setImageResource(R.drawable.dice_4)
                5 -> imgDice.setImageResource(R.drawable.dice_5)
                6 -> imgDice.setImageResource(R.drawable.dice_6)
            }
        }
    }

}