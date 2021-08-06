package com.example.MyVHT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void start (View view) {
        Intent intent = new Intent(
                MainActivity.this,login.class);
        startActivity(intent);
        finish();}
}

      // public void start(View view) {
       // Intent tr = new Intent(MainActivity.this,LOG_IN.class);
      //  startActivity(tr);
      //  finish();
   // }

