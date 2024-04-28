package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Object_and_Classes_in_Java_unit_2 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_and_classes_in_java_unit2);
        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView n1 = findViewById(R.id.n1);
        n1.setText("In this page, we will learn about Java objects and classes. In object-oriented programming technique, we design a program using objects and classes.\n" +
                "\n" +
                "An object in Java is the physical as well as a logical entity, whereas, a class in Java is a logical entity only.");

        TextView n2 = findViewById(R.id.n2);
        n2.setText(Html.fromHtml("<b>•State:</b> represents the data (value) of an object.<br><br>" +
                "<b>•Behavior:</b> represents the behavior (functionality) of an object such as deposit, withdraw, etc.<br><br>" +
                "<b>•Identity:</b> An object identity is typically implemented via a unique ID. The value of the ID is not visible to the external user. However, it is used internally by the JVM to identify each object uniquely."));


        TextView n3 = findViewById(R.id.n3);
        n3.setText(Html.fromHtml("<b><font color='#DC8E47'> An object is an instance of a class.</font></b> A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class."));


        TextView n4 = findViewById(R.id.n4);
        n4.setText("① An object is a real-world entity.\n" +
                "②An object is a runtime entity.\n" +
                "③The object is an entity which has state and behavior.\n" +
                "④The object is an instance of a class.");


        TextView n5 = findViewById(R.id.n5);
        n5.setText("➊Fields\n" +
                "➋Methods\n" +
                "➌Constructors\n" +
                "➍Blocks\n" +
                "➎Nested class and interface");

        TextView hk = findViewById(R.id.hk);
        hk.setText("class <class_name>{  \n" +
                "\n" +
                "    field;  \n" +
                "\n" +
                "    method;  \n" +
                "\n" +
                "}  ");

        TextView q = findViewById(R.id.q);
        q.setText("  There are 3 ways to initialize object in Java.\n" +
                "\n" +
                "➊ By reference variable\n" +
                "➋ By method\n" +
                "➌ By constructor");
    }
}