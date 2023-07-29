package com.abhi_devo.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {   //handler handle the simultaneous programming to ensure that our UI doesn't hang up
            @Override
            public void run() {
                Intent iHome = new Intent(SplashActivity.this,Activity_Videos.class);
                startActivity(iHome);
                finish();  //our splash screen has been removed from the backstack
            }
        },3000);

    }
}