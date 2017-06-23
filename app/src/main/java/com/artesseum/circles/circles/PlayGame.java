package com.artesseum.circles.circles;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;


public class PlayGame extends AppCompatActivity {


    TextView scoreLabel, timerText, scoreLabelFinal;
    ImageButton clickButton,clickButton1,clickButton2;
    Button Start_Button;
    CountDownTimer timer;
    int time = 10;
    int Score = 0;







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playgame);


        scoreLabel =(TextView) findViewById(R.id.scoreLabel);
        scoreLabelFinal = (TextView) findViewById(R.id.scoreLabelFinal);
        timerText =(TextView) findViewById(R.id.timerText);
        clickButton = (ImageButton) findViewById(R.id.clickButton);
        clickButton1 = (ImageButton) findViewById(R.id.clickButton1);
        clickButton2 = (ImageButton) findViewById(R.id.clickButton2);

        Start_Button = (Button) findViewById(R.id.Start_Button);
        clickButton.setVisibility(View.INVISIBLE);
        clickButton1.setVisibility(View.INVISIBLE);
        clickButton2.setVisibility(View.INVISIBLE);

/// set random start for  buttons
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

        Random r2 = new Random();
        int buttonHeight2;
        int buttonWidth2;
        buttonHeight2 = clickButton2.getHeight();
        buttonWidth2 = clickButton2.getWidth();
        int xLeft2 = r2.nextInt(480 - buttonHeight2);
        int yUp2 = r2.nextInt(800 - buttonWidth2);
        int xRight2 = r2.nextInt(480 + buttonHeight2);
        int yDown2 = r2.nextInt(800 + buttonHeight2);

        clickButton2.setX(xLeft2);
        clickButton2.setY(yUp2);
        clickButton2.setX(xRight2);
        clickButton2.setY(yDown2);

        Random r1 = new Random();
        int buttonHeight1;
        int buttonWidth1;
        buttonHeight1 = clickButton1.getHeight();
        buttonWidth1 = clickButton1.getWidth();
        int xLeft1 = r1.nextInt(480 - buttonHeight1);
        int yUp1 = r1.nextInt(800 - buttonWidth1);
        int xRight1 = r1.nextInt(480 + buttonHeight1);
        int yDown1 = r1.nextInt(800 + buttonHeight1);

        clickButton1.setX(xLeft1);
        clickButton1.setY(yUp1);
        clickButton1.setX(xRight1);
        clickButton1.setY(yDown1);




        scoreLabelFinal.setVisibility(View.INVISIBLE);
        clickButton.setEnabled(false);
        clickButton1.setEnabled(false);
        clickButton2.setEnabled(false);

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
                clickButton.setVisibility(View.INVISIBLE);
                clickButton1.setVisibility(View.INVISIBLE);
                clickButton2.setVisibility(View.INVISIBLE);
                timerText.setVisibility(View.INVISIBLE);
                scoreLabel.setVisibility(View.INVISIBLE);
                scoreLabelFinal.setVisibility(View.VISIBLE);
                scoreLabelFinal.setText("Score: " + Score);
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

        clickButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
                /////Moves button on click
                Random r1 = new Random();
                int buttonHeight;
                int buttonWidth;
                buttonHeight = clickButton1.getHeight();
                buttonWidth = clickButton1.getWidth();
                int xLeft = r1.nextInt(480 - buttonHeight);
                int yUp = r1.nextInt(800 - buttonWidth);
                int xRight = r1.nextInt(480 + buttonHeight);
                int yDown = r1.nextInt(800 + buttonHeight);

                clickButton1.setX(xLeft);
                clickButton1.setY(yUp);
                clickButton1.setX(xRight);
                clickButton1.setY(yDown);


            }
        });

        clickButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
                /////Moves button on click
                Random r2 = new Random();
                int buttonHeight;
                int buttonWidth;
                buttonHeight = clickButton2.getHeight();
                buttonWidth = clickButton2.getWidth();
                int xLeft = r2.nextInt(480 - buttonHeight);
                int yUp = r2.nextInt(800 - buttonWidth);
                int xRight = r2.nextInt(480 + buttonHeight);
                int yDown = r2.nextInt(800 + buttonHeight);

                clickButton2.setX(xLeft);
                clickButton2.setY(yUp);
                clickButton2.setX(xRight);
                clickButton2.setY(yDown);


            }
        });


        Start_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                timer.start();
                clickButton.setEnabled(true);
                clickButton1.setEnabled(true);
                clickButton2.setEnabled(true);

                Start_Button.setEnabled(false);
                Score = 0;
                time = 10;
                timerText.setText("Time: 0");
                scoreLabel.setText("Click "+ Score);

                Start_Button.setVisibility(View.INVISIBLE);
                clickButton.setVisibility(View.VISIBLE);
                clickButton1.setVisibility(View.VISIBLE);
                clickButton2.setVisibility(View.VISIBLE);
                timerText.setVisibility(View.VISIBLE);
                scoreLabel.setVisibility(View.VISIBLE);
                scoreLabelFinal.setVisibility(View.GONE);

            }


        });

    }




}
