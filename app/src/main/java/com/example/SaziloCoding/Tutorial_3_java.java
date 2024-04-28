package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Tutorial_3_java extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial3_java);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView c0 = findViewById(R.id.c0);
        c0.setText("1. Write a java application that implements the concept of method overloading.\n\n" +
                "2. Write a java application that implements the concept of method overriding.\n\n" +
                "3. Create a java application to count factorial of a number entered through command line argument.\n\n" +
                "4. Write a java program that takes numbers from the user using command line argument and display the maximum number amongst them.");
    }
}