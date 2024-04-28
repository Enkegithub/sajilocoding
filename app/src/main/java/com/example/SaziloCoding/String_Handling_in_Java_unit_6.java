package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class String_Handling_in_Java_unit_6 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_string_handling_in_java_unit6);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView i8 = findViewById(R.id.i8);
        i8.setText("Strings, which are widely used in Java programming, are a sequence of characters. In Java programming language, strings are treated as objects.\n" +
                "\n" +
                "The Java platform provides the String class to create and manipulate strings.\n" +
                "\n" +
                "The most direct way to create a string is to write −");


        TextView u0 = findViewById(R.id.u0);
        u0.setText("android:text=\"String greeting = \"Hello world!\";\"\n");

        TextView k = findViewById(R.id.k);
        k.setText("Whenever it encounters a string literal in your code, the compiler creates a String object with its value in this case, \"Hello world!'.");



        TextView d7 = findViewById(R.id.d7);
        d7.setText("public class StringDemo {\n" +
                "   public static void main(String args[]) {\n" +
                "      char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };\n" +
                "      String helloString = new String(helloArray);\n" +
                "      System.out.println( helloString );\n" +
                "   }\n" +
                "}\n" +
                "Output\n" +
                "hello.");



    }
}