package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Cplus_statements_unit2 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cplus_statements_unit2);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText(Html.fromHtml("C++ is a high-level programming language that is used to create a wide range of software applications, including games, operating systems, and productivity tools. C++ is an object-oriented language that allows you to create classes, objects, and methods, and it also provides a range of built-in data types and functions that you can use in your programs.<br>" +
                "<br>" +
                "In C++, a statement is a complete instruction that performs a specific action. A statement can be a single line of code or multiple lines of code that are grouped together. Here are some common types of statements in C++:<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>1.Assignment statements:</b></font>  These statements assign a value to a variable. For example:<br>" +
                "<br>" +
                "int x = 10;<br>" +
                "float y = 3.14;<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>2.Control flow statements:</b></font>  These statements allow you to control the flow of execution in your program. They include:<br>" +
                "<br>" +
                "⎆ if/else statements: These statements allow you to execute code based on a condition. For example:<br>" +
                "<br>" +
                "if (x > y) {<br>" +
                "    cout << \"x is greater than y\";<br>" +
                "} else {<br>" +
                "    cout << \"y is greater than or equal to x\";<br>" +
                "}<br>" +
                "⎆ switch statements: These statements allow you to select one of several code blocks to execute based on the value of an expression. For example:<br>" +
                "<br>" +
                "switch (dayOfWeek) {<br>" +
                "    case 1:<br>" +
                "        cout << \"Monday\";<br>" +
                "        break;<br>" +
                "    case 2:<br>" +
                "        cout << \"Tuesday\";<br>" +
                "        break;<br>" +
                "    // and so on...<br>" +
                "}<br>" +
                "⎆ while/do-while statements: These statements allow you to execute a block of code repeatedly while a condition is true. For example:<br>" +
                "<br>" +
                "int i = 0;<br>" +
                "while (i < 10) {<br>" +
                "    cout << i << endl;<br>" +
                "    i++;<br>" +
                "}<br>" +
                "<br>" +
                "int j = 0;<br>" +
                "do {<br>" +
                "    cout << j << endl;<br>" +
                "    j++;<br>" +
                "} while (j < 10);<br>" +
                "⎆ for statements: These statements allow you to execute a block of code repeatedly for a specified number of times. For example:<br>" +
                "<br>" +
                "for (int i = 0; i < 10; i++) {<br>" +
                "    cout << i << endl;<br>" +
                "}<br>" +
                "<b><font color='#DC8E47'>3. Function calls:</b></font>  These statements call a function and pass in any required arguments. For example:<br>" +
                "<br>" +
                "<br>" +
                "int sum = addNumbers(5, 7);<br>" +
                "<b><font color='#DC8E47'>4. Declaration statements:</b></font>  These statements declare variables or functions. For example:<br>" +
                "<br>" +
                "<br>" +
                "int x;<br>" +
                "float calculateArea(float radius);"));

    }
}