package com.example.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Random myrandom = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.dice);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int myRannumber1  = myrandom.nextInt(6) +1;

                switch (myRannumber1){
                    case 1:
                        imageView.setImageResource(R.drawable.one);
                        break;

                    case 2:
                        imageView.setImageResource(R.drawable.two);
                        break;

                    case 3:
                        imageView.setImageResource(R.drawable.three);
                         break;

                    case 4:
                        imageView.setImageResource(R.drawable.four);
                       break;

                    case 5:
                        imageView.setImageResource(R.drawable.five);
                         break;

                    case 6:
                        imageView.setImageResource(R.drawable.six);
                         break;
                }
            }
        });
    }
}