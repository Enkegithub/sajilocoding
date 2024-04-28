package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_to_Looping_c_unit_3 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_looping_cunit3);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView nh = findViewById(R.id.nh);
        nh.setText("There are two types of loops:\n" +
                "\n" +
                "1. Entry controlled loop\n" +
                "\n" +
                "2. Exit controlled loop");

        TextView n = findViewById(R.id.n);
        n.setText(Html.fromHtml("In an <b>  entry controlled loop</b>, a condition is checked before executing the body of a loop. It is also called as a pre-checking loop."));

        TextView na = findViewById(R.id.na);
        na.setText("In an exit controlled loop, a condition is checked after executing the body of a loop. It is also called as a post-checking loop.");

        TextView l = findViewById(R.id.l);
        l.setText(Html.fromHtml("The control conditions must be well defined and specified otherwise the loop will execute an infinite number of times. The loop that does not stop executing and processes the statements number of times is called as an <b> infinite loop </b>. An infinite loop is also called as an <b> \"Endless loop\"</b>. Following are some characteristics of an infinite loop:"));

        TextView m2 = findViewById(R.id.m2);
        m2.setText("1. No termination condition is specified.\n" +
                "\n" +
                "2. The specified conditions never meet.");

        TextView o = findViewById(R.id.o);
        o.setText("The specified condition determines whether to execute the loop body or not.\n" +
                "\n" +
                "'C' programming language provides us with three types of loop constructs:\n" +
                "\n" +
                "1. The while loop\n" +
                "\n" +
                "2. The do-while loop\n" +
                "\n" +
                "3. The for loop\n" +
                "\n" +
                " \n" +
                "\n" +
                "Note: While and for are examples of entry controlled loops whereas Do-while is an example .of exit controlled loop.");


    }

}
