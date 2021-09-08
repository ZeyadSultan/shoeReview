package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        progressBar =findViewById(R.id.ProgressPar);
        textView = findViewById(R.id.SplashText);

        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnimation();

    }
    public void progressAnimation(){
        ProgressBarAnimation Amin = new ProgressBarAnimation(this,progressBar,textView,0f,100f);
        Amin.setDuration(6000);
        progressBar.setAnimation(Amin);
    }
}