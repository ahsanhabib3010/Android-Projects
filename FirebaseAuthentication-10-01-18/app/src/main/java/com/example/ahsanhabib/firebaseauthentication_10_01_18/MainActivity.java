package com.example.ahsanhabib.firebaseauthentication_10_01_18;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends AppCompatActivity {

    private EditText email, password ;
    private Button btnLogIn, btnReset, btnSignUp;
    private FirebaseAuth firebaseAuth;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        firebaseAuth = FirebaseAuth.getInstance();

        email = (EditText)findViewById(R.id.etEmail);
        password = (EditText)findViewById(R.id.etPassword);
        btnLogIn =(Button)findViewById(R.id.logInBtn);
        btnReset =(Button)findViewById(R.id.resetBtn);
        btnSignUp =(Button)findViewById(R.id.signUpBtn);
        progressBar = (ProgressBar)findViewById(R.id.progressBar);
        progressBar.setVisibility(View.GONE);
    }

    public void onSignUpBtnClick(View v){
        Intent signUpIntent = new Intent(MainActivity.this, SignUp.class);
        startActivity(signUpIntent);
    }

    public void onResetBtnClick(View v){
        Intent resetIntent = new Intent(MainActivity.this, ResetActivity.class);
        startActivity(resetIntent);
    }


    public void onLoginInBtnClick(View v){
        progressBar.setVisibility(View.VISIBLE);
      //  final ProgressDialog pd = new ProgressDialog.show(MainActivity.this, "Please! wait...!","Processing...!!!",true);
        (firebaseAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {

                if(task.isSuccessful()){
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,"Login Successfully...!!!", Toast.LENGTH_LONG).show();
                    Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                    homeIntent.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                    startActivity(homeIntent);
                }
                else {
                    progressBar.setVisibility(View.GONE);
                    Log.e("Error",task.getException().toString());
                    Toast.makeText(MainActivity.this,task.getException().getMessage(), Toast.LENGTH_LONG).show();
                }
            }
        });
    }



}
