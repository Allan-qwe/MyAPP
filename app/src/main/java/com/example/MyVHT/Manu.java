package com.example.MyVHT;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Manu extends AppCompatActivity {
    Button btn;
    EditText numTxt;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu ){
        getMenuInflater().inflate(R.menu.my_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
         switch (item.getItemId()){
             case R.id.vht:
                 Toast.makeText(this,"VHT choosen",Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.details:
                 Toast.makeText(this,"Details choosen",Toast.LENGTH_SHORT).show();
                 return true;
             case R.id.settings:
                 Toast.makeText(this," Settings choosen",Toast.LENGTH_SHORT).show();
                 return true;
             default:
                 return super.onOptionsItemSelected(item);
         }
    }
}