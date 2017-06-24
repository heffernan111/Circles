package com.artesseum.circles.circles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainMenu extends AppCompatActivity {

    public Button playGameButton;

    public void init(){
        playGameButton = (Button) findViewById(R.id.playButton);
        playGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent gamePlay = new Intent(MainMenu.this, Game.class);
                startActivity(gamePlay);
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

