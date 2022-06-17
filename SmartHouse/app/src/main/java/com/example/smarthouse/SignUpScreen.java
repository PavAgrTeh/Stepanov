package com.example.smarthouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);
    }

    @Override
    public void onClick(@NonNull View view) {
        if (view.getId() == R.id.EnterYourHouse){
            Intent intent = new Intent(this,SignInScreen.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.NewResident){
            Intent intent = new Intent(this,MainScreen.class);
            startActivity(intent);
        }
    }
}