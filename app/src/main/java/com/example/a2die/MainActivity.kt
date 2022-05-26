package com.example.a2die

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buoon: Button = findViewById(R.id.Roll1)
        buoon.setOnClickListener {
            RollDice1()
            toast("Clicked 1!!")
        }
        val buoon2: Button = findViewById(R.id.Roll2)
        buoon2.setOnClickListener {
            RollDice2()
            toast("Clicked 2!!")
        }
        val Bigbutton:Button = findViewById(R.id.RollBoth)
        Bigbutton.setOnClickListener{
            RollBothDice()
            toast("Clicked Both!!")
        }
    }

    private fun RollDice1() {
        var X: IntRange = 1..6
        var Res: TextView = findViewById(R.id.Result1)
        val Y = X.random()
        Res.text = Y.toString()
        var DiceImage: ImageView = findViewById(R.id.dice1)

        when (Y) {
            1 -> DiceImage.setImageResource(R.drawable.dice_1)
            2 -> DiceImage.setImageResource(R.drawable.dice_2)
            3 -> DiceImage.setImageResource(R.drawable.dice_3)
            4 -> DiceImage.setImageResource(R.drawable.dice_4)
            5 -> DiceImage.setImageResource(R.drawable.dice_5)
            6 -> DiceImage.setImageResource(R.drawable.dice_6)
        }

        DiceImage.contentDescription = Y.toString()
    }

    private fun RollDice2() {
        var X: IntRange = 1..6
        var Res: TextView = findViewById(R.id.Result2)
        val Y = X.random()
        Res.text = Y.toString()
        var DiceImage: ImageView = findViewById(R.id.dice2)

        when (Y) {
            1 -> DiceImage.setImageResource(R.drawable.dice_1)
            2 -> DiceImage.setImageResource(R.drawable.dice_2)
            3 -> DiceImage.setImageResource(R.drawable.dice_3)
            4 -> DiceImage.setImageResource(R.drawable.dice_4)
            5 -> DiceImage.setImageResource(R.drawable.dice_5)
            6 -> DiceImage.setImageResource(R.drawable.dice_6)
        }

        DiceImage.contentDescription = Y.toString()
    }

    fun RollBothDice(){
        var a: IntRange = 1..6
        var b: IntRange = 1..6
        var Res1 : TextView = findViewById(R.id.Result1)
        var Res2 : TextView = findViewById(R.id.Result2)
        val DiceImage:ImageView = findViewById(R.id.dice1)
        val DiceImage2:ImageView = findViewById(R.id.dice2)

        val s = a.random()
        val t = b.random()

        Res1.text = s.toString()
        Res2.text = t.toString()

        when(s){
            1 -> DiceImage.setImageResource(R.drawable.dice_1)
            2 -> DiceImage.setImageResource(R.drawable.dice_2)
            3 -> DiceImage.setImageResource(R.drawable.dice_3)
            4 -> DiceImage.setImageResource(R.drawable.dice_4)
            5 -> DiceImage.setImageResource(R.drawable.dice_5)
            6 -> DiceImage.setImageResource(R.drawable.dice_6)
        }

        when(t){
            1 -> DiceImage2.setImageResource(R.drawable.dice_1)
            2 -> DiceImage2.setImageResource(R.drawable.dice_2)
            3 -> DiceImage2.setImageResource(R.drawable.dice_3)
            4 -> DiceImage2.setImageResource(R.drawable.dice_4)
            5 -> DiceImage2.setImageResource(R.drawable.dice_5)
            6 -> DiceImage2.setImageResource(R.drawable.dice_6)
        }

    }

    fun Context.toast(message: CharSequence) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

}