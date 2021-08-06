package com.example.MyVHT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Activitythree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitythree);
    }
    public void All(View view) {
        Intent intent = new Intent(
                Activitythree.this,activity_two.class);
        startActivity(intent);
        finish();}
}