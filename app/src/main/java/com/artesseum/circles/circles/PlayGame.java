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
    ImageButton clickButton,clickButton1,clickButton2;
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

        Start_Button = (Button) findViewById(R.id.Start_Button);
        clickButton.setVisibility(View.INVISIBLE);
        clickButton1.setVisibility(View.INVISIBLE);
        clickButton2.setVisibility(View.INVISIBLE);

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




                        }
        });

        clickButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Score++;
                scoreLabel.setText("Click "+ Score);
                /////Moves button on click
                Random r1 = new Random();


            }
        });

        clickButton2.setOnClickListener(new View.OnClickListener(){
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

              final ObjectAnimator alphaAnimation = ObjectAnimator.ofFloat(clickButton, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation2 = ObjectAnimator.ofFloat(clickButton, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation2.setDuration(animatorDuration);
                alphaAnimation.start();

                alphaAnimation.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        super.onAnimationCancel(animation);
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton.setVisibility(clickButton.INVISIBLE);
                        alphaAnimation2.setStartDelay(1000);
                        alphaAnimation2.start();
                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {
                        super.onAnimationRepeat(animation);
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                    }

                    @Override
                    public void onAnimationPause(Animator animation) {
                        super.onAnimationPause(animation);
                    }

                    @Override
                    public void onAnimationResume(Animator animation) {
                        super.onAnimationResume(animation);
                    }
                });

                alphaAnimation2.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationCancel(Animator animation) {
                        super.onAnimationCancel(animation);
                    }

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


          /*  clickButton.animate()
                    .alpha(0.0f)
                    .setDuration(1000)
                    .setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animation) {
                            super.onAnimationEnd(animation);
                            clickButton.setVisibility(clickButton.INVISIBLE);
                            animation.

                        }
                    });

*/





            }


        });


    }


}



