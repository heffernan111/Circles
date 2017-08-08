package com.artesseum.circles.circles;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    public Button playGameButton;
    public ImageButton tapButton;
    public ImageView tapHand;




    public void init(){
        playGameButton = (Button) findViewById(R.id.playButton);
        tapButton = (ImageButton) findViewById(R.id.buttonTapimage);
        tapHand = (ImageView) findViewById(R.id.handimage);

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
        Animation img = new TranslateAnimation(Animation.ABSOLUTE,-250,Animation.ABSOLUTE,150);
        img.setDuration(2000);
        img.setFillAfter(true);

        tapHand.startAnimation(img);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

         init();





            }
        }

