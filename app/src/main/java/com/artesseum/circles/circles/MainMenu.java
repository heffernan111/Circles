package com.artesseum.circles.circles;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.artesseum.circles.circles.R.color.butcolor;
import static com.artesseum.circles.circles.R.color.colorAccent;
import static com.artesseum.circles.circles.R.color.colorPrimary;
import static com.artesseum.circles.circles.R.color.textwhite;

public class MainMenu extends AppCompatActivity {

    public Button playGameButton;
    public ImageButton tapButton;
    public ImageView tapHand;
    public TextView score;




    public void init(){
        playGameButton = (Button) findViewById(R.id.playButton);
        tapButton = (ImageButton) findViewById(R.id.buttonTapimage);
        tapHand = (ImageView) findViewById(R.id.handimage);
        score = (TextView) findViewById(R.id.scoreText);
        moveAnimation();





        //////////////////// tutorial animation ///////////////

        playGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gamePlay = new Intent(MainMenu.this, PlayGame.class);
                startActivity(gamePlay);
            }
        });



    }


    public void moveAnimation(){
       final Animation img = new TranslateAnimation(Animation.ABSOLUTE,-250,Animation.ABSOLUTE,150);
        img.setDuration(3000);
        final Animation text = new ScaleAnimation(100, 100, 100, 100, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 1.0f);
        text.setDuration(2000);
       // img.setFillAfter(true);

        tapHand.startAnimation(img);





        text.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                tapButton.setBackgroundColor(getColor(butcolor));
                score.setTextColor(getColor(colorPrimary));
                img.start();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



        img.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                tapButton.setBackgroundColor(getColor(butcolor));
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                tapButton.setBackgroundColor(getColor(colorAccent));
                score.setTextColor(getColor(textwhite));
                score.setText("Score +1");
                text.start();


            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

         init();





            }
        }

