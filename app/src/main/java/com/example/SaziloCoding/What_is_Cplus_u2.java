package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class What_is_Cplus_u2 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_what_is_cplus_u2);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText("Bjarne Stroustrup developed C++ at Bell Labs in the early 1980s to merge the best advantages of several other languages. He wanted to put together the quickness of BCPL, the high-level of Simula, and the universality of Dennis Ritchie’s C. He took inspiration from other languages as well, such as Ada, ML, and ALGOL 68, to create a well-structured, general-purpose language that could compile nearly all C programs without changing their source code. C++ is so flexible that is often nicknamed the \"Swiss Pocket Knife of Programming Languages\" (although this nickname is shared by Python as well).");



        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText("When C++ was new, object-oriented programming was just coming on the scene. This revolutionary type of computer programming transformed the coding world with its promise of more sophisticated virtual data types and objects.\n" +
                "\n" +
                "In object-oriented programming, an object is a data type that has both data and functions inherent in its design. Prior to the advent of object-oriented programming, programmers typically saw a codebase as composed of individual command line instructions. The identification of objects with data and functions built in led to a new way of packaging and automating code work.");
   }
}