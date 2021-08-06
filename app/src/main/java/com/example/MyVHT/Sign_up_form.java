package com.example.MyVHT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Sign_up_form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_form);
    }
    public void SUBMIT (View view) {
        Intent intent = new Intent(
                Sign_up_form.this,activity_two.class);
        startActivity(intent);
        finish();}





}