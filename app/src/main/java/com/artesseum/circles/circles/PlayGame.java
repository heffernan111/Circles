package com.artesseum.circles.circles;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;



public class PlayGame extends AppCompatActivity {


    TextView scoreLabel, timerText;
    Button clickButton, Start_Button;
    CountDownTimer timer;
    int time = 10;
    int clicks = 0;




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


        timer = new CountDownTimer(30000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time--;
                timerText.setText("Time: "+ time);

            }

            @Override
            public void onFinish() {
                clickButton.setEnabled(false);
                Start_Button.setEnabled(true);
            }
        };

        clickButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clicks++;
                scoreLabel.setText("Click "+ clicks);


            }
        });


        Start_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                timer.start();
                clickButton.setEnabled(true);
                Start_Button.setEnabled(false);
            }


        });

    }




}
