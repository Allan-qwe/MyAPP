package com.example.MyVHT;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Phonecall extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phonecall);
    }
    public void zaq(View view) {
        Intent intent = new Intent(
                Phonecall.this,activity_two.class);
        startActivity(intent);
        finish();}
}
