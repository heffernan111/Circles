package com.artesseum.circles.circles;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class PlayGame extends AppCompatActivity {


    TextView scoreLabel, timerText;
    Button clickButton, Start_Button;
    CountDownTimer timer;
    int time = 10;
    int Score = 0;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playgame);


        scoreLabel =(TextView) findViewById(R.id.scoreLabel);
        timerText =(TextView) findViewById(R.id.timerText);
        clickButton = (Button) findViewById(R.id.clickButton);
        Start_Button = (Button) findViewById(R.id.Start_Button);
        clickButton.setEnabled(false);
        Start_Button.setEnabled(true);


        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time--;
                timerText.setText("Time: "+ time);
                scoreLabel.setText("Click "+ Score);

            }

            @Override
            public void onFinish() {
                clickButton.setEnabled(false);
                Start_Button.setEnabled(true);
                Start_Button.setVisibility(View.VISIBLE);
                timerText.setText("Time: 0");
                scoreLabel.setText("Click "+ Score);
            }
        };

        clickButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
                /////Moves button on click
                Random r = new Random();
                int buttonHeight;
                int buttonWidth;
                buttonHeight = clickButton.getHeight();
                buttonWidth = clickButton.getWidth();
                int xLeft = r.nextInt(480 - buttonHeight);
                int yUp = r.nextInt(800 - buttonWidth);
                int xRight = r.nextInt(480 + buttonHeight);
                int yDown = r.nextInt(800 + buttonHeight);

                clickButton.setX(xLeft);
                clickButton.setY(yUp);
                clickButton.setX(xRight);
                clickButton.setY(yDown);


            }
        });


        Start_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                timer.start();
                clickButton.setEnabled(true);
                Start_Button.setEnabled(false);
                Score = 0;
                time = 10;
                timerText.setText("Time: 0");
                scoreLabel.setText("Click "+ Score);

                Start_Button.setVisibility(View.INVISIBLE);

            }


        });

    }




}
