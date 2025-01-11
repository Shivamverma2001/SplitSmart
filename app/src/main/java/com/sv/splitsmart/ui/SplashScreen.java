package com.sv.splitsmart.ui;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.sv.splitsmart.MainActivity;
import com.sv.splitsmart.R;

@SuppressLint("CustomSplashScreen")
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_splash_screen);
        // Delay for 2 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Navigate to Main Activity
                Intent intent = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(intent);
                finish(); // Close SplashActivity
            }
        }, 2000); // Adjust time as needed (2000ms = 2 seconds)
    }
}