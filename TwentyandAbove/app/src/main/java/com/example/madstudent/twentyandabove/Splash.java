package com.example.madstudent.twentyandabove;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splash extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 3000;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splashscreen);

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                startActivity(new Intent(Splash.this, MainActivity.class));
                Splash.this.finish();
            }
        }, SPLASH_TIME_OUT);
    }

    @Override
    public void onBackPressed() {
        Splash.this.finish();
        super.onBackPressed();
    }}