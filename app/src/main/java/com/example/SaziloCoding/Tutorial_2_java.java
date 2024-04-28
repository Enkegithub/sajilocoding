package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Tutorial_2_java extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial2_java);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView c0 = findViewById(R.id.c0);
        c0.setText("1.Write a java program to create a class student having following data members roll no, name, sub1, sub2, sub3. Display the roll no and total marks of student using the concept of class and object.\n \n" +
                "2.Create a class rectangle that uses variables length and width and a method area() that counts the area of a rectangle and displays its value.\n\n" +
                "3.Write a java program that defines the class circle with two constructors.\n\n" +
                "4.Accept the value of radius of circle.\n\n" +
                "5.(ii)Accept two value of a coordinate point of circle and display their value.\n\n" +
                "6.Create a java program that uses “this”\n\n" +
                "7.Create a java program that shows the concept of argument pass by value.\n\n" +
                "8.Create a java program that shows the concept of argument pass by reference.\n\n" +
                "9.Write a java program to create Wrapper of long and char class and implement its method.\n\n" );

    }
}