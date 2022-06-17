package com.example.smarthouse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignInScreen extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_screen);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.NewResident){
            Intent intent = new Intent(this,SignUpScreen.class);
            startActivity(intent);
        }
        if (view.getId() == R.id.EnterYourHouse){
            Intent intent = new Intent(this,MainScreen.class);
            startActivity(intent);
        }
    }


}