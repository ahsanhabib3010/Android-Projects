package com.example.ahsanhabib.navigation_4_12_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button)findViewById(R.id.btnNext);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextIntent = new Intent(MainActivity.this, Websites.class);
                startActivity(nextIntent);
            }
        });
    }


//    public void onNextButtonClick(View view){
//        Intent nextIntent = new Intent(MainActivity.this, Websites.class);
//        startActivity(nextIntent);
//    }



}
