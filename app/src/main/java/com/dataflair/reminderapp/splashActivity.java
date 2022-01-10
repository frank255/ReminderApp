package com.dataflair.reminderapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class splashActivity extends AppCompatActivity {
    ImageView img,app_name;
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        img = findViewById(R.id.img);
        app_name= findViewById(R.id.app_name);
        lottieAnimationView=findViewById(R.id.lottie);

        img.animate().translationY(-1600).setDuration(1000).setStartDelay(4000);
        app_name.animate().translationY(1400).setDuration(1000).setStartDelay(4000);
        lottieAnimationView.animate().translationY(1400).setDuration(1000).setStartDelay(4000);


        int secondsDelayed = 11;
        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));             //after 500 milliseconds this block calls the mainActivity
                finish();
            }
        }, secondsDelayed * 500);
    }
}