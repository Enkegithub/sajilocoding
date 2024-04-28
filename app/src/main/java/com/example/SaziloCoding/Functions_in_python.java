package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Functions_in_python extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_functions_in_python);

        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView t1 = findViewById(R.id.t1);
        t1.setText("In Python, a function is a block of code that performs a specific task. It can accept arguments (input) and return a value (output), or it can perform actions without returning anything.\n" +
                "\n" +
                "Here's an example of a simple function in Python:");

        TextView text5 = findViewById(R.id.text5);
        text5.setText("def greet(name):\n" +
                "    print(\"Hello, \" + name + \"!\")\n");

        TextView t3 = findViewById(R.id.t3);
        t3.setText("This function is called \"greet\", and it accepts one argument called \"name\". When the function is called, it prints a greeting message with the name that was passed in as an argument.\n" +
                "\n" +
                "To call this function, you would simply write:");

        TextView text7 = findViewById(R.id.text7);
        text7.setText("greet(\"John\")\n");


        TextView t4 = findViewById(R.id.t4);
        t4.setText("This would output:");

        TextView text8 = findViewById(R.id.text8);
        text8.setText("Hello, John!\n");


        TextView r0 = findViewById(R.id.r0);
        t4.setText("This would output:");

        TextView n0 = findViewById(R.id.n0);
        n0.setText("def add_numbers(x, y):\n" +
                "    return x + y\n");



        TextView r2 = findViewById(R.id.r2);
        r2.setText("This function is called \"add_numbers\", and it accepts two arguments called \"x\" and \"y\". When the function is called, it returns the sum of these two values.\n" +
                "\n" +
                "To call this function and store the result in a variable, you would write:");

        TextView n2 = findViewById(R.id.n2);
        n2.setText("result = add_numbers(3, 5)\n");


        TextView r3 = findViewById(R.id.r3);
        r3.setText("This would set the variable \"result\" to 8.\n" +
                "\n" +
                "Functions can also have optional arguments with default values, which means that the argument can be omitted and the default value will be used. Here's an example:");

        TextView n3 = findViewById(R.id.n3);
        n3.setText("def say_hello(name=\"World\"):\n" +
                "    print(\"Hello, \" + name + \"!\")\n");


        TextView r4 = findViewById(R.id.r4);
        r4.setText("This function is called \"say_hello\", and it accepts one optional argument called \"name\". If the argument is omitted, it will default to \"World\". When the function is called, it prints a greeting message with the name that was passed in as an argument or the default value if no argument was provided.\n" +
                "\n" +
                "To call this function, you can either provide an argument:");

        TextView n4 = findViewById(R.id.n4);
        n4.setText("say_hello(\"John\")\n");



        TextView r5 = findViewById(R.id.r5);
        r5.setText("This would output:");

        TextView n5 = findViewById(R.id.n5);
        n5.setText("Hello, John!\n");

        TextView r8 = findViewById(R.id.r8);
        r8.setText("Or call it without an argument:");

        TextView n8 = findViewById(R.id.n8);
        n8.setText("say_hello()\n");


        TextView r9 = findViewById(R.id.r9);
        r9.setText("This would output:");

        TextView n9 = findViewById(R.id.n9);
        n9.setText("Hello, World!\n");

        TextView n10 =findViewById(R.id.n10);
        n10.setText("These are just a few examples of the many ways functions can be used in Python. Functions are a powerful tool for organizing code, making it more reusable, and reducing repetition.");




    }
}