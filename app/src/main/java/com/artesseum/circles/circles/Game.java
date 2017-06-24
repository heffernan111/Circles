package com.artesseum.circles.circles;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;


public class Game extends AppCompatActivity implements View.OnClickListener {

    TextView scoreLabel, timerText;
    ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    Button startButton;
    CountDownTimer timer;
    int time = 10;
    int Score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        scoreLabel =(TextView) findViewById(R.id.scoreCurrentText);
        timerText =(TextView) findViewById(R.id.timeCurrentText);
        startButton = (Button) findViewById(R.id.startButton);
        btn1 = (ImageButton) findViewById(R.id.imageButton1);
        btn2 = (ImageButton) findViewById(R.id.imageButton2);
        btn3 = (ImageButton) findViewById(R.id.imageButton3);
        btn4 = (ImageButton) findViewById(R.id.imageButton4);
        btn5 = (ImageButton) findViewById(R.id.imageButton5);
        btn6 = (ImageButton) findViewById(R.id.imageButton6);
        btn7 = (ImageButton) findViewById(R.id.imageButton7);
        btn8 = (ImageButton) findViewById(R.id.imageButton8);
        btn9 = (ImageButton) findViewById(R.id.imageButton9);
        btn10 = (ImageButton) findViewById(R.id.imageButton10);



        startButton.setEnabled(true);
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        btn10.setEnabled(false);

        btn1.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
        btn4.setVisibility(View.INVISIBLE);
        btn5.setVisibility(View.INVISIBLE);
        btn6.setVisibility(View.INVISIBLE);
        btn7.setVisibility(View.INVISIBLE);
        btn8.setVisibility(View.INVISIBLE);
        btn9.setVisibility(View.INVISIBLE);
        btn10.setVisibility(View.INVISIBLE);


        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time--;
                timerText.setText("Time: "+ time);
                scoreLabel.setText("Click "+ Score);
            }

            @Override
            public void onFinish() {
                btn1.setEnabled(false);
                btn2.setEnabled(false);
                btn3.setEnabled(false);
                btn4.setEnabled(false);
                btn5.setEnabled(false);
                btn6.setEnabled(false);
                btn7.setEnabled(false);
                btn8.setEnabled(false);
                btn9.setEnabled(false);
                btn10.setEnabled(false);

                startButton.setEnabled(true);
                startButton.setVisibility(View.VISIBLE);
                timerText.setText("Time: 0");
                scoreLabel.setText("Click "+ Score);
            }
        };


        startButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                timer.start();
                btn1.setOnClickListener(this);
                btn2.setOnClickListener(this);
                btn3.setOnClickListener(this);
                btn4.setOnClickListener(this);
                btn5.setOnClickListener(this);
                btn6.setOnClickListener(this);
                btn7.setOnClickListener(this);
                btn8.setOnClickListener(this);
                btn9.setOnClickListener(this);
                btn10.setOnClickListener(this);
                btn1.setEnabled(true);
                btn2.setEnabled(true);
                btn3.setEnabled(true);
                btn4.setEnabled(true);
                btn5.setEnabled(true);
                btn6.setEnabled(true);
                btn7.setEnabled(true);
                btn8.setEnabled(true);
                btn9.setEnabled(true);
                btn10.setEnabled(true);


                startButton.setEnabled(false);
                Score = 0;
                time = 10;
                timerText.setText("Time: 0");
                scoreLabel.setText("Click "+ Score);

                startButton.setVisibility(View.GONE);

            }


        });




    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageButton1:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton2:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton3:Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton4:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton5:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton6:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton7:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton8:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton9:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;
            case R.id.imageButton10:
                Score++;
                scoreLabel.setText("Click "+ Score);
                break;

        }


    }


}
