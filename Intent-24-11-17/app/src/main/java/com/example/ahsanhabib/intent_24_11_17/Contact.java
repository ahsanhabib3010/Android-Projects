package com.example.ahsanhabib.intent_24_11_17;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }


    public void onWebBtnClick(View view){
        Intent web = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bitashware.com"));
        startActivity(web);
    }

    public void onCallBtnClick(View view){
        Intent call = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:3452303030"));
        startActivity(call);
    }

    public void onEmailBtnClick(View view){
        Intent intentEmail = new Intent(Intent.ACTION_SEND);
        intentEmail.setType("*/*");
        intentEmail.setData(Uri.parse("mailto: abc@abc.com"));
        intentEmail.putExtra(Intent.EXTRA_SUBJECT, "Job Application");
        intentEmail.putExtra(Intent.EXTRA_TEXT, "This application to submit job proposal");
        startActivity(intentEmail);
    }


}
