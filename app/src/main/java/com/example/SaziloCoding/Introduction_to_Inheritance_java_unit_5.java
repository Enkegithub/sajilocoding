package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_to_Inheritance_java_unit_5 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_inheritance_java_unit5);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView s0 = findViewById(R.id.s0);
        s0.setText(Html.fromHtml("1. Inheritance<br>" +
                "2. Types of Inheritance<br>" +
                "3. Why multiple inheritance is not possible in Java in case of class?<br> <br>" +
                "<b>Inheritance in Java</b>  is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).<br>" +
                "<br>" +
                "The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also."));


        TextView s1 = findViewById(R.id.s1);
        s1.setText(Html.fromHtml("1. { <br> <br>" +
                "2. }<br>" +
                "The <b>extends keyword</b> indicates that you are making a new class that derives from an existing class. The meaning of \"extends\" is to increase the functionality.<br>" +
                "<br>" +
                "In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass."));

    }
}