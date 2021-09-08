package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allShoes extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_shoes);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);
        button4 = findViewById(R.id.button_4);
        button5 = findViewById(R.id.button_5);
        button6 = findViewById(R.id.button_6);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "image1";
                Intent intent = new Intent(allShoes.this,showDescription.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "image2";
                Intent intent = new Intent(allShoes.this,showDescription.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "image3";
                Intent intent = new Intent(allShoes.this,showDescription.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "image4";
                Intent intent = new Intent(allShoes.this,showDescription.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "image5";
                Intent intent = new Intent(allShoes.this,showDescription.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str = "image6";
                Intent intent = new Intent(allShoes.this,showDescription.class);
                intent.putExtra("message_key", str);
                startActivity(intent);
            }
        });
    }
}