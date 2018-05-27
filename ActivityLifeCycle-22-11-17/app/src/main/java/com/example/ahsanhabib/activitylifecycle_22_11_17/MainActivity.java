package com.example.ahsanhabib.activitylifecycle_22_11_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {


    String msg = "Activity Status=====";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(msg,"Activity onStart() starts");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(msg,"Activity onPause() starts");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(msg,"Activity onResume() starts");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg,"Activity onRestart() starts");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(msg,"Activity onStop() starts");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(msg,"Activity onDestroy() starts");
    }

}
