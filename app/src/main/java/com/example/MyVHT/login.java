package com.example.MyVHT;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class login extends AppCompatActivity {
    Button editOke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);



            }
    public void OK (View view) {
        Intent intent = new Intent(
                login.this,activity_two.class);
        startActivity(intent);
        finish();}
    public void lot(View view) {
        Intent intent = new Intent(
                login.this,Sign_up_form.class);
        startActivity(intent);
        finish();}



              /*public void onClick(View view) {
        Intent  startIntent=new Intent(
        getApplicationContext(),ActivityTwo.class);
        startActivity(startIntent);*/
}