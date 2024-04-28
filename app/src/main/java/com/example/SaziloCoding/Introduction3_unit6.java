package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction3_unit6 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction3_unit6);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView vp1 = findViewById(R.id.vp1);
        vp1.setText("In C++, inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such way, you can reuse, extend or modify the attributes and behaviors which are defined in other class.\n" +
                "\n" +
                "In C++, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. The derived class is the specialized class for the base class.");



        TextView vp2 = findViewById(R.id.vp2);
        vp2.setText(Html.fromHtml("<b>Code reusability:</b> Now you can reuse the members of your parent class. So, there is no need to define the member again. So less code is required in the class."));



        TextView vp3 = findViewById(R.id.vp3);
        vp3.setText("C++ supports five types of inheritance:\n" +
                "\n" +
                "➤Single inheritance\n" +
                "➤Multiple inheritance\n" +
                "➤Hierarchical inheritance\n" +
                "➤Multilevel inheritance\n" +
                "➤Hybrid inheritance");

        TextView vp4 = findViewById(R.id.vp4);
        vp4.setText("A Derived class is defined as the class derived from the base class.\n" +
                "\n" +
                "The Syntax of Derived class:\n" +
                "\n" +
                "class derived_class_name :: visibility-mode base_class_name  \n" +
                "\n" +
                "{  \n" +
                "\n" +
                "    // body of the derived class.  \n" +
                "\n" +
                "}\n" +
                "\n" +
                "Where,\n" +
                "\n" +
                "derived_class_name: It is the name of the derived class.\n" +
                "\n" +
                "visibility mode: The visibility mode specifies whether the features of the base class are publicly inherited or privately inherited. It can be public or private.\n" +
                "\n" +
                "base_class_name: It is the name of the base class.\n" +
                "\n" +
                "➤When the base class is privately inherited by the derived class, public members of the base class becomes the private members of the derived class. Therefore, the public members of the base class are not accessible by the objects of the derived class only by the member functions of the derived class.\n" +
                "➤When the base class is publicly inherited by the derived class, public members of the base class also become the public members of the derived class. Therefore, the public members of the base class are accessible by the objects of the derived class as well as by the member functions of the base class.\n" +
                "Note:\n" +
                "➤In C++, the default mode of visibility is private.\n" +
                "➤The private members of the base class are never inherited.");



    }
}