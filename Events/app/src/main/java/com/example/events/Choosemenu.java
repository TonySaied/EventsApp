package com.example.events;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Choosemenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosemenu);
        photographer();
        videographer();
        hall();
    }
    public void photographer()
    {
        ImageButton photo=(ImageButton)findViewById(R.id.img_photo);
        photo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Choosemenu.this,Photographer.class));
            }
        });
    }
    public void videographer()
    {
        ImageButton vid=(ImageButton)findViewById(R.id.img_vid);
        vid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Choosemenu.this,Videographer.class));
            }
        });
    }
    public void hall()
    {
        ImageButton hall=(ImageButton)findViewById(R.id.img_hall);
        hall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Choosemenu.this,Hall.class));
            }
        });
    }
}