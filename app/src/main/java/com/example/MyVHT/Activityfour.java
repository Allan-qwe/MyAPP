package com.example.MyVHT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Activityfour extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfour);
    }
    public void zaq(View view) {
        Intent intent = new Intent(
                Activityfour.this,gmap.class);
        startActivity(intent);
        finish();}
    public void ter(View view) {
        Intent intent = new Intent(
                Activityfour.this,Phonecall.class);
        startActivity(intent);
        finish();}
}