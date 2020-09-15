package com.example.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
        signup();
    }
    public void login()
    {
        Button logn=(Button)findViewById(R.id.login);
        logn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,LoginACT.class));
            }
        });
    }
    public void signup()
    {
        Button sgup=(Button)findViewById(R.id.sign_up);
        sgup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,SignupACT.class));
            }
        });
    }
}