package com.artesseum.circles.circles;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.animation.ObjectAnimator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

import static com.artesseum.circles.circles.R.color.butcolor;
import static com.artesseum.circles.circles.R.color.colorAccent;


public class PlayGame extends AppCompatActivity {


    TextView scoreLabel, timerText, scoreLabelFinal;
    ImageButton clickButton,clickButton1,clickButton2,clickButton3,clickButton4,clickButton5,clickButton6,clickButton7,clickButton8;
    Button Start_Button,Share_Button;
    CountDownTimer timer;
    int time = 10;
    int Score = 0;
    Random rand = new Random();
    int v = rand.nextInt(1000) +100;

    long animatorDuration = v;




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
        clickButton3 = (ImageButton) findViewById(R.id.clickButton3);
        clickButton4 = (ImageButton) findViewById(R.id.clickButton4);
        clickButton5 = (ImageButton) findViewById(R.id.clickButton5);
        clickButton6 = (ImageButton) findViewById(R.id.clickButton6);
        clickButton7 = (ImageButton) findViewById(R.id.clickButton7);
        clickButton8 = (ImageButton) findViewById(R.id.clickButton8);



        Start_Button = (Button) findViewById(R.id.Start_Button);
        Share_Button = (Button) findViewById(R.id.share_btn);
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
        scoreLabel.setVisibility(View.INVISIBLE);
        timerText.setVisibility(View.INVISIBLE);

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
        Share_Button.setEnabled(true);


        timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                time--;
                timerText.setText("Time: "+ time);
                scoreLabel.setText("Score: "+ Score);

            }

            @Override
            public void onFinish() {
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
                Start_Button.setVisibility(View.VISIBLE);
                Share_Button.setEnabled(true);
                Share_Button.setVisibility(View.VISIBLE);









//                clickButton.setVisibility(View.INVISIBLE);
//                clickButton1.setVisibility(View.INVISIBLE);
//                clickButton2.setVisibility(View.INVISIBLE);
//                clickButton3.setVisibility(View.INVISIBLE);
//                clickButton4.setVisibility(View.INVISIBLE);
//                clickButton5.setVisibility(View.INVISIBLE);
//                clickButton6.setVisibility(View.INVISIBLE);
//                clickButton7.setVisibility(View.INVISIBLE);
//                clickButton8.setVisibility(View.INVISIBLE);


//                clickButton.setBackgroundColor(getColor(butcolor));
//                clickButton.setClickable(false);
//
//                clickButton1.setBackgroundColor(getColor(butcolor));
//                clickButton1.setClickable(false);
//
//                clickButton2.setBackgroundColor(getColor(butcolor));
//                clickButton2.setClickable(false);
//
//                clickButton3.setBackgroundColor(getColor(butcolor));
//                clickButton3.setClickable(false);
//
//                clickButton4.setBackgroundColor(getColor(butcolor));
//                clickButton4.setClickable(false);
//
//                clickButton5.setBackgroundColor(getColor(butcolor));
//                clickButton5.setClickable(false);
//
//                clickButton6.setBackgroundColor(getColor(butcolor));
//                clickButton6.setClickable(false);
//
//                clickButton7.setBackgroundColor(getColor(butcolor));
//                clickButton7.setClickable(false);
//
//                clickButton8.setBackgroundColor(getColor(butcolor));
//                clickButton8.setClickable(false);













                timerText.setVisibility(View.INVISIBLE);
                scoreLabel.setVisibility(View.INVISIBLE);
                scoreLabelFinal.setVisibility(View.VISIBLE);
                scoreLabelFinal.setText("Score: " + Score);





              //  Intent sharingIntent = new Intent(Intent.ACTION_SEND);
              //  sharingIntent.setType("text/plain");
              //  sharingIntent.putExtra(Intent.EXTRA_TEXT,"I just Scored" + Score);
              // startActivity(Intent.createChooser(sharingIntent, "Share via"));


            }
        };

        clickButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton.setBackgroundColor(getColor(colorAccent));
                clickButton.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
                        }
        });
        clickButton1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton1.setBackgroundColor(getColor(colorAccent));
                clickButton1.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton2.setBackgroundColor(getColor(colorAccent));
                clickButton2.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton3.setBackgroundColor(getColor(colorAccent));
                clickButton3.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton4.setBackgroundColor(getColor(colorAccent));
                clickButton4.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton5.setBackgroundColor(getColor(colorAccent));
                clickButton5.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton6.setBackgroundColor(getColor(colorAccent));
                clickButton6.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton7.setBackgroundColor(getColor(colorAccent));
                clickButton7.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });
        clickButton8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                clickButton8.setBackgroundColor(getColor(colorAccent));
                clickButton8.setClickable(false);
                Score++;
                scoreLabel.setText("Score: "+ Score);
            }
        });


        Share_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                  sharingIntent.setType("text/plain");
                  sharingIntent.putExtra(Intent.EXTRA_TEXT,"I just Scored " + Score);
                 startActivity(Intent.createChooser(sharingIntent, "Share via"));
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
                Share_Button.setEnabled(false);

                Score = 0;
                time = 10;
                timerText.setText("Time: 0");
                scoreLabel.setText("Score "+ Score);

                Start_Button.setVisibility(View.INVISIBLE);
                Share_Button.setVisibility(View.INVISIBLE);

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


                //////////random numbers
                final int a = rand.nextInt(800) +500;

                final int b = rand.nextInt(800) +500;

                final int c = rand.nextInt(800) +500;

                final int d = rand.nextInt(800) +500;

                final int e= rand.nextInt(800) +500;

                final int f = rand.nextInt(800) +500;

                final int g = rand.nextInt(800) +500;

                final int h = rand.nextInt(800) +500;

                final int i = rand.nextInt(800) +500;

                final int j = rand.nextInt(800) +500;

                final int k = rand.nextInt(800) +500;

                final int l = rand.nextInt(800) +500;

                final int m = rand.nextInt(800) +500;

                final int n= rand.nextInt(800) +500;

                final int o = rand.nextInt(800) +500;

                final int p = rand.nextInt(800) +500;

                final int q = rand.nextInt(800) +500;

                final int r = rand.nextInt(800) +500;








                ///////////////////Animations/////////////////////////Button0
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

                        /////////////end game if not clicked
                        alphaAnimation2.setStartDelay(a);
                        alphaAnimation2.start();
                    }

                });
                    /////////fade in
                alphaAnimation2.addListener(new AnimatorListenerAdapter() {


                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation.setStartDelay(j);
                        alphaAnimation.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton.setBackgroundColor(getColor(butcolor));
                        clickButton.setClickable(true);


                        clickButton.setVisibility(clickButton.VISIBLE);
                    }

                });


                    ////animationbutton1/////////
                final ObjectAnimator alphaAnimation3 = ObjectAnimator.ofFloat(clickButton1, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation3.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation4 = ObjectAnimator.ofFloat(clickButton1, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation4.setDuration(animatorDuration);
                alphaAnimation3.start();

                alphaAnimation3.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton1.setVisibility(clickButton1.INVISIBLE);
                        alphaAnimation4.setStartDelay(b);
                        alphaAnimation4.start();
                    }

                });
                /////////fade in
                alphaAnimation4.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation3.setStartDelay(k);
                        alphaAnimation3.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton1.setBackgroundColor(getColor(butcolor));
                        clickButton1.setClickable(true);

                        clickButton1.setVisibility(clickButton1.VISIBLE);
                    }
                });





                final ObjectAnimator alphaAnimation5 = ObjectAnimator.ofFloat(clickButton2, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation5.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation6 = ObjectAnimator.ofFloat(clickButton2, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation6.setDuration(animatorDuration);
                alphaAnimation5.start();

                alphaAnimation5.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton2.setVisibility(clickButton.INVISIBLE);
                        alphaAnimation6.setStartDelay(c);
                        alphaAnimation6.start();
                    }

                });
                /////////fade in
                alphaAnimation6.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation5.setStartDelay(l);
                        alphaAnimation5.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton2.setBackgroundColor(getColor(butcolor));
                        clickButton2.setClickable(true);
                        clickButton2.setVisibility(clickButton2.VISIBLE);
                    }
                });

                    ///////button3
                final ObjectAnimator alphaAnimation7 = ObjectAnimator.ofFloat(clickButton3, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation7.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation8 = ObjectAnimator.ofFloat(clickButton3, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation8.setDuration(animatorDuration);
                alphaAnimation7.start();

                alphaAnimation7.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton3.setVisibility(clickButton.INVISIBLE);
                        alphaAnimation8.setStartDelay(d);
                        alphaAnimation8.start();
                    }

                });
                /////////fade in
                alphaAnimation8.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation7.setStartDelay(m);
                        alphaAnimation7.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton3.setBackgroundColor(getColor(butcolor));
                        clickButton3.setClickable(true);
                        clickButton3.setVisibility(clickButton3.VISIBLE);
                    }
                });
                        /////////////button 4
                final ObjectAnimator alphaAnimation9 = ObjectAnimator.ofFloat(clickButton4, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation9.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation10 = ObjectAnimator.ofFloat(clickButton4, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation10.setDuration(animatorDuration);
                alphaAnimation9.start();

                alphaAnimation9.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton4.setVisibility(clickButton4.INVISIBLE);
                        alphaAnimation10.setStartDelay(e);
                        alphaAnimation10.start();
                    }

                });
                /////////fade in
                alphaAnimation10.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation9.setStartDelay(n);
                        alphaAnimation9.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton4.setBackgroundColor(getColor(butcolor));
                        clickButton4.setClickable(true);
                        clickButton4.setVisibility(clickButton4.VISIBLE);
                    }
                });




                /////////////button 5
                final ObjectAnimator alphaAnimation11 = ObjectAnimator.ofFloat(clickButton5, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation11.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation12 = ObjectAnimator.ofFloat(clickButton5, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation12.setDuration(animatorDuration);
                alphaAnimation11.start();

                alphaAnimation11.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton5.setVisibility(clickButton5.INVISIBLE);
                        alphaAnimation12.setStartDelay(f);
                        alphaAnimation12.start();
                    }

                });
                /////////fade in
                alphaAnimation12.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation11.setStartDelay(o);
                        alphaAnimation11.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton5.setBackgroundColor(getColor(butcolor));
                        clickButton5.setClickable(true);
                        clickButton5.setVisibility(clickButton5.VISIBLE);
                    }
                });



                /////////////button 6
                final ObjectAnimator alphaAnimation13 = ObjectAnimator.ofFloat(clickButton6, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation13.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation14 = ObjectAnimator.ofFloat(clickButton6, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation14.setDuration(animatorDuration);
                alphaAnimation13.start();

                alphaAnimation13.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton6.setVisibility(clickButton6.INVISIBLE);
                        alphaAnimation14.setStartDelay(g);
                        alphaAnimation14.start();
                    }

                });
                /////////fade in
                alphaAnimation14.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation13.setStartDelay(p);
                        alphaAnimation13.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton6.setBackgroundColor(getColor(butcolor));
                        clickButton6.setClickable(true);
                        clickButton6.setVisibility(clickButton6.VISIBLE);
                    }
                });




                /////////////button 7
                final ObjectAnimator alphaAnimation15 = ObjectAnimator.ofFloat(clickButton7, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation15.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation16 = ObjectAnimator.ofFloat(clickButton7, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation16.setDuration(animatorDuration);
                alphaAnimation15.start();

                alphaAnimation15.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton7.setVisibility(clickButton7.INVISIBLE);
                        alphaAnimation16.setStartDelay(h);
                        alphaAnimation16.start();
                    }

                });
                /////////fade in
                alphaAnimation16.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation15.setStartDelay(q);
                        alphaAnimation15.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {

                        clickButton7.setBackgroundColor(getColor(butcolor));
                        clickButton7.setClickable(true);
                        clickButton7.setVisibility(clickButton7.VISIBLE);
                    }
                });



                /////////////button 8
                final ObjectAnimator alphaAnimation17 = ObjectAnimator.ofFloat(clickButton8, View.ALPHA, 1.0f, 0.0f);
                alphaAnimation17.setDuration(animatorDuration);
                final ObjectAnimator alphaAnimation18 = ObjectAnimator.ofFloat(clickButton8, View.ALPHA, 0.0f, 1.0f);
                alphaAnimation18.setDuration(animatorDuration);
                alphaAnimation17.start();

                alphaAnimation17.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        clickButton8.setVisibility(clickButton8.INVISIBLE);
                        alphaAnimation18.setStartDelay(i);
                        alphaAnimation18.start();
                    }

                });
                /////////fade in
                alphaAnimation18.addListener(new AnimatorListenerAdapter() {

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        super.onAnimationEnd(animation);
                        alphaAnimation17.setStartDelay(r);
                        alphaAnimation17.start();
                    }

                    @Override
                    public void onAnimationStart(Animator animation) {
                        super.onAnimationStart(animation);
                        clickButton8.setBackgroundColor(getColor(butcolor));
                        clickButton8.setClickable(true);
                        clickButton8.setVisibility(clickButton8.VISIBLE);
                    }
                });












            }


        });


    }


}



