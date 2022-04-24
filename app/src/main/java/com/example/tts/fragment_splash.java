package com.example.tts;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.widget.TextView;
import android.window.SplashScreen;

import com.airbnb.lottie.LottieAnimationView;

public class fragment_splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        LottieAnimationView lottieAnimationView;
        TextView textView = findViewById(R.id.textSplashScreen);
        lottieAnimationView = findViewById(R.id.lottie);
        lottieAnimationView.animate().translationX(1000).setDuration(1000).setStartDelay(2500);
        textView.animate().translationX(1000).setDuration(1000).setStartDelay(2500);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(fragment_splash.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
    }
}