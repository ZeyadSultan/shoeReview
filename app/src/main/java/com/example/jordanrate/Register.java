package com.example.jordanrate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    DBHelper DB;
    EditText name , phone , email , password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        name = findViewById(R.id.editTextTextPersonName);
        phone = findViewById(R.id.editTextPhone);
        email = findViewById(R.id.editTextTextEmailAddress2);
        password = findViewById(R.id.editTextTextPassword);
        DB=new DBHelper(this);
    }
    public void onClick(View view) {
        String btn_txt;
        btn_txt = ((Button) view).getText().toString();
        if(btn_txt.equals("Register")) {
            if(name.getText().toString().trim().isEmpty() || phone.getText().toString().trim().isEmpty() || email.getText().toString().trim().isEmpty() || password.getText().toString().trim().isEmpty()){
                Toast.makeText(Register.this, " please Enter your data ", Toast.LENGTH_SHORT).show();
            }
            else {
                if(passwordValidation(password.getText().toString().trim())){
                    DB.insertData(email.getText().toString(),password.getText().toString());
                    Intent allshoes = new Intent(this, MainActivity.class);
                    allshoes.putExtra("email", email.getText().toString().trim());
                    allshoes.putExtra("password", password.getText().toString().trim());
                    startActivity(allshoes);
                }else {
                    password.setText("");
                    Toast.makeText(Register.this, " your password should contain a number and capital letter ", Toast.LENGTH_SHORT).show();
                }

            }
        }
    }
    public boolean passwordValidation(String password){
        char[] chars = password.toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean isNumber = false, isLowerCase = false, isUpperCase = false;
        for(char c : chars){
            if(Character.isDigit(c)){
                isNumber = true;
            }
        }
        for(char c : chars){
            if(Character.isLowerCase(c)){
                isLowerCase = true;
            }
        }
        for(char c : chars){
            if(Character.isUpperCase(c)){
                isUpperCase = true;
            }
        }
        return isNumber && isLowerCase && isUpperCase;
    }
}
