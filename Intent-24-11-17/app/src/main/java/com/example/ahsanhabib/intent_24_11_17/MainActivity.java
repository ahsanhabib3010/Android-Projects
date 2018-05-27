package com.example.ahsanhabib.intent_24_11_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//    Button btnAbout = (Button)findViewById(R.id.btnAbout);
//    Button btnProduct = (Button)findViewById(R.id.btnProduct);
//    Button btnServices = (Button)findViewById(R.id.btnServices);
//    Button btnGallery = (Button)findViewById(R.id.btnGallery);
//    Button btnContact = (Button)findViewById(R.id.btnContact);


    public void onHomeButtonClick(View view){
//        Button btnHome = (Button)findViewById(R.id.btnHome);
        Intent home = new Intent(this, Home.class);
        startActivity(home);

    }

    public void onAboutButtonClick(View view){
        Intent about = new Intent(this, About.class);
        startActivity(about);
    }

    public void onProductButtonClick(View view){
        Intent products = new Intent(this, Products.class);
        startActivity(products);
    }


    public void onServicesButtonClick(View view){
        Intent services = new Intent(this, Services.class);
        startActivity(services);
    }

    public void onGalleryButtonClick(View view){
        Intent gallery = new Intent(this, Gallery.class);
        startActivity(gallery);
    }

    public void onContactButtonClick(View view){
        Intent contact = new Intent(this, Contact.class);
        startActivity(contact);
    }


}
