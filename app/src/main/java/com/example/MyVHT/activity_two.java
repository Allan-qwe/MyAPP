package com.example.MyVHT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class activity_two extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
    }
    public void own(View view) {
        Intent intent = new Intent(
                activity_two.this,Activitythree.class);
        startActivity(intent);
        finish();}

    public void abort(View view) {
        Intent intent = new Intent(
                activity_two.this,Activityfive.class);
        startActivity(intent);
        finish();}
    public void kol(View view) {
        Intent intent = new Intent(
                activity_two.this,Activityfour.class);
        startActivity(intent);
        finish();}
    public void vop(View view) {
        Intent intent = new Intent(
                activity_two.this,Manu.class);
        startActivity(intent);
        finish();}


}


