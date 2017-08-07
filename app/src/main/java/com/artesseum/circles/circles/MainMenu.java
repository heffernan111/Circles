package com.artesseum.circles.circles;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    public Button playGameButton,exitButton;

    public void init(){
        playGameButton = (Button) findViewById(R.id.playButton);
        exitButton = (Button) findViewById(R.id.exitButton);


        playGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gamePlay = new Intent(MainMenu.this, PlayGame.class);
                startActivity(gamePlay);
            }
        });

        exitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);

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

