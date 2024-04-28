package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Python_tutorial extends AppCompatActivity {
    ImageView backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_tutorial);
        backbtn=findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        int[] images = {R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,R.drawable.python,
                R.drawable.python,};

        String[] texts = {" Write a Python program to print “Welcome”.",
                "Write a Python program to print any message using different variations of print ()method.",
                " Write a Python program to declare different types of variables, print their values,types, and Ids.",
                "Write a Python program to add, subtract, multiply and divide any two numbers.",
                " Write a Python program to demonstrate the scope of Variable.",
                "Write a Python program to scan any value from user and display the entered value.",
                "Write a Python program to typecast input value to Integer and Float.",
                "Write a Python program to perform all the arithmetic operations",
                "Write a Python program to print current date and time. ",
                "Write a Python program to find compound interest.",
                "Write a Python program to print even numbers from 1 to 100.",
                " Write a Python program to print odd numbers from 1 to 100.",
                "Write a Python program to find square root of a number.",
                "Write a Python program to find sum of first 20 even numbers.",
                "Write a Python program to count number of digits in entered number.",

                "Write a Python program to find factors of a given number.",
                "Write a Python program to check whether the entered number is palindrome or not.",
                "Write a Python program to concatenate two strings.",

                "Write a Python program to convert string into uppercase.",
                " Write a Python program to count Vowels in a given string.",
                " Write a Python program to reverse a given string.",

                "Write a Python program to generate a random string.",
                " Write a Python program to find length of a given string and convert int to string.",
                " Write a Python program to Calculate the sum of the series 1 +11 + 111 + 1111 + .. n terms.",

                "Write a Python program to check whether a given number is a perfect number or not.",
                "Write a Python program to check whether a given number is an armstrong number or not.",
                " Write a program in Python to display the pattern like a diamond.",
                "Write a Python program to check whether a number is a Strong Number or not.",
                " Write a program in Python to convert a binary number into a decimal,octal and hexadecimal number.",
                " Write a program in Python to convert a octal number into a binary,decimal and hexa decimal number.",
                "Write a program in Python to convert a hexadecimal number into a binary,octal and decimal number.",
                "Write a program in Python to convert a decimal number into binary, octal and hexadecimal.",
                "Write a Python program to find out the sum of an A.P. series.",
                " Write a program in Python to find the Sum of GP series.",
                " Write a program in Python to find the Abundant numbers (integers) between 1 to 1000.",
                "Write a program in Python to check whether a given number is a Kaprekar number or not.",
                " Write a Python program to find LCM and GCD of given numbers using user defined function.",
                "Write a Python program to find number entered by user is prime number or not using user defined function.",
                " Write a Python program to print Fibonacci series till user's choice using user defined function.",
                " Write a Python program to find factorial of a given number using user defined function.",
                " Write a Python program to check whether the entered number is Armstrong number or not using user defined function.",
                "Write a Python program to find total number of alphabets, digits and whitespace from the string entered by user with user defined function.",
                " Write a Python program that explain function call from another function.",
                " Write a Python program to explain concept of arbitrary arguments.",
                " Write a Python program to explain concept of default arguments.",
        };

        ListView listView = findViewById(R.id.listview);

        Python_tutorial.CustomAdapter customAdapter = new Python_tutorial.CustomAdapter(getApplicationContext(), images, texts);
        listView.setAdapter((ListAdapter) customAdapter);


    }
    class CustomAdapter extends BaseAdapter {

        Context context;
        int[] images;
        String[] texts;
        LayoutInflater inflater;

        public CustomAdapter(Context context, int[] images, String[] texts) {
            this.context = context;
            this.images = images;
            this.texts = texts;
            inflater = (LayoutInflater.from(getApplicationContext()));
        }


        @Override
        public int getCount() {
            return texts.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @SuppressLint({"ViewHolder", "InflateParams"})
        @Override
        public View getView(final int position, View view, ViewGroup parent) {
            view = inflater.inflate(R.layout.custom_list, null);

            ImageView imageView = view.findViewById(R.id.icon);
            TextView textView = view.findViewById(R.id.topic);

            imageView.setImageResource(images[position]);

            textView.setText(texts[position]);

          view.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
//                   if (position == 0) {
//                      Intent i = new Intent(Python_tutorial.this, Introducrion_to_python.class);
//                       startActivity(i);
//                   }
               }
           });


            return view;

        }



    }
}