package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class addReview extends AppCompatActivity {

    Button buttonShow;
    TextView viewResult;
    RatingBar ratingBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_review);
        viewResult = findViewById(R.id.viewResult);
        ratingBar = findViewById(R.id.ratingBar);
        buttonShow = findViewById(R.id.submitReview);
        buttonShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String totalValue = ratingBar.getNumStars()+"";
                String rating = ratingBar.getRating()+"";
                viewResult.setText("Your rating: "+rating+"*");
            }
        });
    }
}