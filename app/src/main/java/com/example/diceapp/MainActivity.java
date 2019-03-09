package com.example.diceapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollbutButton;
        rollbutButton= findViewById(R.id.rollButton);
        final ImageView rightdice;
        rightdice = findViewById(R.id.rightdice);
        final ImageView leftdice;
      leftdice = findViewById(R.id.leftdice);
       final int [] diceArray ={
          R.drawable.dice1,
          R.drawable.dice2,
        R.drawable.dice3,
        R.drawable.dice4,
        R.drawable.dice5,
        R.drawable.dice6
        };
        rollbutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee", "the button has pressed");
                Random RandomNumberGenerator = new Random();
                int number1=RandomNumberGenerator.nextInt(6);
                int number2 = RandomNumberGenerator.nextInt(6);
                leftdice.setImageResource(diceArray[number1]);
                rightdice.setImageResource(diceArray[number2]);

            }
        });
    }
}
