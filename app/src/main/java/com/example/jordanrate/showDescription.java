package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class showDescription extends AppCompatActivity {

    ImageView image_view;
    TextView text_view;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_description);


        image_view = findViewById(R.id.imageView);
        text_view = findViewById(R.id.DescView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");

        if(str.equals("image1")) {
            image_view.setBackgroundResource(R.drawable.air2);
            text_view.setText(R.string.air1);
        }
        else if(str.equals("image2"))
        {
            image_view.setBackgroundResource(R.drawable.air3);
            text_view.setText(R.string.air2);
        }
        else if(str.equals("image3"))
        {
            image_view.setBackgroundResource(R.drawable.air1);
            text_view.setText(R.string.Air_Jordan_13_Retro_1);
        }
        else if(str.equals("image4"))
        {
            image_view.setBackgroundResource(R.drawable.air4);
            text_view.setText(R.string.x_Dior_Air_Jordan_1);
        }else if(str.equals("image5"))
        {
            image_view.setBackgroundResource(R.drawable.air5);
            text_view.setText(R.string.air5);
        }else if(str.equals("image6"))
        {
            image_view.setBackgroundResource(R.drawable.air6);
            text_view.setText(R.string.Air_Jordan_1_Retro);
        }
    }
    public void onClick(View view) {
        String btn_txt;
        btn_txt = ((Button) view).getText().toString();
        if (btn_txt.equals("Add Review")) {
            Intent AddReview = new Intent(this, addReview.class);
            startActivity(AddReview);
        }
    }


}