package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Difference_between_overloading_and_overriding_methods_unit_5_java extends AppCompatActivity {

    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difference_between_overloading_and_overriding_methods_unit5_java);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView lo = findViewById(R.id.lo);
        lo.setText("1. tatic int add(int a,int b){return a+b;}  \n" +
                "2. }  ");


        TextView l1 = findViewById(R.id.l1);
        l1.setText("1. void eat(){System.out.println(\"eating...\");}  \n" +
                "2. class Dog extends Animal{  \n" +
                "3. }  \n");

    }
}