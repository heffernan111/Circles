package com.artesseum.circles.circles;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.animation.ObjectAnimator;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;


public class PlayGame extends AppCompatActivity {


    TextView scoreLabel, timerText, scoreLabelFinal;
    ImageButton clickButton,clickButton1,clickButton2,clickButton3,clickButton4,clickButton5,clickButton6,clickButton7,clickButton8;
    Button Start_Button;
    CountDownTimer timer;
    int time = 10;
    int Score = 0;


    private ImageView imageView;
    private DisplayMetrics metrics;
    long animatorDuration = 1000;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playgame);
        metrics = new DisplayMetrics();


        scoreLabel =(TextView) findViewById(R.id.scoreLabel);
        scoreLabelFinal = (TextView) findViewById(R.id.scoreLabelFinal);
        timerText =(TextView) findViewById(R.id.timerText);
        clickButton = (ImageButton) findViewById(R.id.clickButton);
        clickButton1 = (ImageButton) findViewById(R.id.clickButton1);
        clickButton2 = (ImageButton) findViewById(R.id.clickButton2);
        clickButton3 = (ImageButton) findViewById(R.id.clickButton3);
        clickButton4 = (ImageButton) findViewById(R.id.clickButton4);
        clickButton5 = (ImageButton) findViewById(R.id.clickButton5);
        clickButton6 = (ImageButton) findViewById(R.id.clickButton6);
        clickButton7 = (ImageButton) findViewById(R.id.clickButton7);
        clickButton8 = (ImageButton) findViewById(R.id.clickButton8);



        Start_Button = (Button) findViewById(R.id.Start_Button);
        clickButton.setVisibility(View.INVISIBLE);
        clickButton1.setVisibility(View.INVISIBLE);
        clickButton2.setVisibility(View.INVISIBLE);
        clickButton3.setVisibility(View.INVISIBLE);
        clickButton4.setVisibility(View.INVISIBLE);
        clickButton5.setVisibility(View.INVISIBLE);
        clickButton6.setVisibility(View.INVISIBLE);
        clickButton7.setVisibility(View.INVISIBLE);
        clickButton8.setVisibility(View.INVISIBLE);

        scoreLabelFinal.setVisibility(View.INVISIBLE);
        clickButton.setEnabled(false);
        clickButton1.setEnabled(false);
        clickButton2.setEnabled(false);
        clickButton3.setEnabled(false);
        clickButton4.setEnabled(false);
        clickButton5.setEnabled(false);
        clickButton6.setEnabled(false);
        clickButton7.setEnabled(false);
        clickButton8.setEnabled(false);

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
                clickButton3.setVisibility(View.INVISIBLE);
                clickButton4.setVisibility(View.INVISIBLE);
                clickButton5.setVisibility(View.INVISIBLE);
                clickButton6.setVisibility(View.INVISIBLE);
                clickButton7.setVisibility(View.INVISIBLE);
                clickButton8.setVisibility(View.INVISIBLE);


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

                        }
        });
        clickButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });
        clickButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
            }
        });


        Start_Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                timer.start();
                clickButton.setEnabled(true);
                clickButton1.setEnabled(true);
                clickButton2.setEnabled(true);
                clickButton3.setEnabled(true);
                clickButton4.setEnabled(true);
                clickButton5.setEnabled(true);
                clickButton6.setEnabled(true);
                clickButton7.setEnabled(true);
                clickButton8.setEnabled(true);


                Start_Button.setEnabled(false);
                Score = 0;
                time = 10;
                timerText.setText("Time: 0");
                scoreLabel.setText("Click "+ Score);

                Start_Button.setVisibility(View.INVISIBLE);
                clickButton.setVisibility(View.VISIBLE);
                clickButton1.setVisibility(View.VISIBLE);
                clickButton2.setVisibility(View.VISIBLE);
                clickButton3.setVisibility(View.VISIBLE);
                clickButton4.setVisibility(View.VISIBLE);
                clickButton5.setVisibility(View.VISIBLE);
                clickButton6.setVisibility(View.VISIBLE);
                clickButton7.setVisibility(View.VISIBLE);
                clickButton8.setVisibility(View.VISIBLE);

                timerText.setVisibility(View.VISIBLE);
                scoreLabel.setVisibility(View.VISIBLE);
                scoreLabelFinal.setVisibility(View.GONE);


                ///////////////////Animations/////////////////////////Button1
                final ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(clickButton, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation2 = ObjectAnimator.ofFloat(clickButton, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation2.setDuration(animatorDuration);
                alphaAnimation.start();

                alphaAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton.setVisibility(clickButton.INVISIBLE);
                        alphaAnimation2.setStartDelay(1000);
                        alphaAnimation2.start();
                    }

                });
                    /////////fade in
                alphaAnimation2.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation.setStartDelay(1000);
                        alphaAnimation.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton.setVisibility(clickButton.VISIBLE);
                    }
                });



                final ObjectAnimator alphaAnimation3 = ObjectAnimator.ofFloat(clickButton1, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation4 = ObjectAnimator.ofFloat(clickButton1, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation4.setDuration(animatorDuration);
                alphaAnimation3.start();

                alphaAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton1.setVisibility(clickButton1.INVISIBLE);
                        alphaAnimation4.setStartDelay(1000);
                        alphaAnimation4.start();
                    }

                });
                /////////fade in
                alphaAnimation2.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation3.setStartDelay(1000);
                        alphaAnimation3.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton1.setVisibility(clickButton1.VISIBLE);
                    }
                });





                final ObjectAnimator alphaAnimation5 = ObjectAnimator.ofFloat(clickButton2, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation6 = ObjectAnimator.ofFloat(clickButton2, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation6.setDuration(animatorDuration);
                alphaAnimation5.start();

                alphaAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton2.setVisibility(clickButton.INVISIBLE);
                        alphaAnimation6.setStartDelay(1000);
                        alphaAnimation6.start();
                    }

                });
                /////////fade in
                alphaAnimation2.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation5.setStartDelay(1000);
                        alphaAnimation5.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton2.setVisibility(clickButton2.VISIBLE);
                    }
                });














            }


        });


    }


}



