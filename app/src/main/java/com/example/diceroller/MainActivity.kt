package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {



        private lateinit var binding: ActivityMainBinding

        lateinit var diceImage: ImageView//Inialize and never null

        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding= ActivityMainBinding.inflate(layoutInflater)
         val view=binding.root
        setContentView(view)
        binding.rollButton.setText("Let's Roll")
        binding.rollButton.setOnClickListener {
            //Toast.makeText(this,"button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
            diceImage =binding.diceImage//bind diceImage only once
         }

    private fun rollDice() {
        val randomInt= Random().nextInt(6)+1
        val drawableResource=when(randomInt){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
        //val diceImage: ImageView =binding.diceImage
        diceImage.setImageResource(drawableResource)

    }
}

