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

public class java_tutorial_01 extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.java, R.drawable.java, R.drawable.java,R.drawable.java,
            R.drawable.java, R.drawable.java, R.drawable.java,R.drawable.java,
            R.drawable.java, R.drawable.java,R.drawable.java,R.drawable.java,R.drawable.java,
            R.drawable.java,R.drawable.java,R.drawable.java,};

    String[] texts = {"1)Write a java program to display a string “Hello World”.", " 2)Create a java program that takes four variable like integer, double, float and character and also display their values.",
            "3)Create a java program that uses narrowing conversion.","4)Write a java program that uses a scope of variables.",
            "5)Write a java program that checks the result of the student whether he is pass or fail using ternary operator.","6)Write a java program that counts the number of days of the mentioned month in specified year using switch case statement.",
            " 7)Write a java program that counts the length of an array.","8)Create a java program to find GCD and LCM of given numbers.","9)Write a java program to count no of words from a given string.",
   "10)Write a java program to find the smallest and second smallest number from a given array and add both those numbers.",
    "11)Write a java program to find the biggest difference from a given array.",
    "12)Write a java program that counts how many numbers are bigger than given number.",
    "13)Write a java program that count specific number from the given numbers.",
    "14)Write a java program that takes two integer numbers, find factorial of both these numbers and multiply it.",
    "15)  Write a java program to make conversion from Binary to Decimal.",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_tutorial01);
        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });

        ListView listView = findViewById(R.id.listview);

        java_tutorial_01.CustomAdapter customAdapter = new java_tutorial_01.CustomAdapter(getApplicationContext(), images, texts);
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

                    switch (position) {
                        case 0:
                      //      Intent i = new Intent(java_tutorial_01.this, Unit_1_Introductionjava_main.class);
                        //    startActivity(i);
                    }
                }
            });

            return view;

        }
    }
}