package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {
    DBHelper DB;
    EditText email , password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        email = findViewById(R.id.editTextTextEmailAddress);
        password = findViewById(R.id.editTextTextPassword2);
        DB = new DBHelper(this);
    }
    public void onClick(View view) {
        String btn_txt;
        btn_txt = ((Button) view).getText().toString();
        if (btn_txt.equals("LogIn")) {
            if(email.getText().toString().trim().isEmpty() || password.getText().toString().trim().isEmpty()) {
                Toast.makeText(LogIn.this, " please enter your data ", Toast.LENGTH_SHORT).show();
            }
            else {
                Boolean checkUserPass=DB.checkusernamepassword(email.getText().toString(),password.getText().toString());
                if (checkUserPass==true){
                    Intent allshoes = new Intent(this, allShoes.class);
                    startActivity(allshoes);
                }
                else {
                    Toast.makeText(LogIn.this, " invalid data please try again", Toast.LENGTH_SHORT).show();
                    password.setText("");
                }
            }
        }
    }
}