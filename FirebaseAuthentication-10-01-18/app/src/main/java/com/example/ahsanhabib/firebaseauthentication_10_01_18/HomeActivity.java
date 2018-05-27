package com.example.ahsanhabib.firebaseauthentication_10_01_18;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    private TextView email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        email = (TextView)findViewById(R.id.tvEmail);
        email.setText(getIntent().getExtras().getString("Email"));
    }
}
