package com.artesseum.circles.circles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.Profile;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

public class MainActivity extends AppCompatActivity {

    LoginButton loginButton;
    TextView textView;
    CallbackManager callbackManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        AccessToken accessToken = AccessToken.getCurrentAccessToken();
        if (accessToken !=null){
            //Profile profile=Profile.getCurrentProfile();
            Intent mainMenuIntent = new Intent(this, MainMenu.class);
            startActivity(mainMenuIntent);

        }else
        loginButton = (LoginButton)findViewById(R.id.fb_login_button);
        textView = (TextView)findViewById(R.id.textView);
        callbackManager = CallbackManager.Factory.create();
        loginButton.registerCallback(callbackManager, new FacebookCallback<LoginResult>() {


            @Override
            public void onSuccess(LoginResult loginResult) {

               /* Log.d("Login_Success", "Success");
                loginButton.setVisibility(textView.INVISIBLE);*/

            }

            @Override
            public void onCancel() {

                    textView.setText("Login Cancelled");

            }

            @Override
            public void onError(FacebookException error) {

            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode,resultCode,data);
        if (resultCode == RESULT_OK){
            Intent mainMenuIntent = new Intent(this, MainMenu.class);
            startActivity(mainMenuIntent);

        }

    }


}
