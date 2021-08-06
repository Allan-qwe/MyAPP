package com.example.MyVHT;

import android.hardware.SensorManager;
import android.os.Bundle;
import android.util.Log;
import android.view.OrientationEventListener;

import androidx.appcompat.app.AppCompatActivity;

public class OrientationActivity extends AppCompatActivity {
    private static final String DEBUG_TAG ="";
    OrientationEventListener mOrientationListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orientation);

        mOrientationListener=new OrientationEventListener(this, SensorManager.SENSOR_DELAY_NORMAL) {
            @Override
            public void onOrientationChanged(int orientation) {
                Log.v(DEBUG_TAG,"Orientation changed to" + orientation);
            }
        };
        if(mOrientationListener.canDetectOrientation()==true){
            Log.v(DEBUG_TAG,"Can detect orientation");
            mOrientationListener.enable();
        }else{
            Log.v(DEBUG_TAG,"Cannot detect orientation");
            mOrientationListener.disable();
        }
    }
    @Override
    protected  void onDestroy(){
        super.onDestroy();
        mOrientationListener.disable();
    }
}