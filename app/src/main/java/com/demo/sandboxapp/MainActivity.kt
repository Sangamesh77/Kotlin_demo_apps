package com.demo.sandboxapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.demo.sandboxapp.Dice

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        var resultText: TextView = findViewById(R.id.textView)
        val image: ImageView = findViewById(R.id.imageView)
        val dice = Dice(6)

        rollButton.setOnClickListener {
            var value = dice.roll()
            resultText.text = value.toString()

            var diceRollImage = when (value){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }

            image.setImageResource(diceRollImage)
            image.contentDescription = "Dice image = $value"
        }
    }

}