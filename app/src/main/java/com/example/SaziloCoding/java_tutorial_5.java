package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class java_tutorial_5 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_tutorial5);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView c0 = findViewById(R.id.c0);
        c0.setText(Html.fromHtml("<b>1.</b> Write a java application that demonstrates the concept of inheritance.  Class w is a super class and has one instance variable of type float. Class x extends w and has one instance variable of type string. Class y extends x and has one instance variable of type integer. Initialize all the variables and display their values. <br> <br>" +
                "<b>2.</b> Write a java application that demonstrates the use of “super” keyword in constructor. Class s2 is a super class and s2 constructor accepts one argument. Class t2 extends s2 and t2 constructor accepts two arguments. First statement in this constructor calls super to invoke the s2 constructor. Class u2 extends t2 and u2 constructor accepts three arguments. First statement in this constructor calls super to invoke the t2 constructor.<br> <br>" +
                "<b>3.</b> Write a java program that demonstrates how a method can invoke super class methods. Class l1 is extends by class j1 and class j1 is extends by class k1 each of these classes defines a void hello () method.<br> <br>" +
                "<b>4.</b> The abstract class shape has two subclasses circle and rectangle. Write a java application that displays the area of circle and rectangle respectively."));
    }
}