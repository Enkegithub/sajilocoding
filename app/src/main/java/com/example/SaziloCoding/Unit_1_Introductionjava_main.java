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

public class Unit_1_Introductionjava_main extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.java,R.drawable.java,R.drawable.java,R.drawable.java,R.drawable.java};

    String[] texts = {
            "Introduction to Java Programming",
            "Features of Java", "First Java Program",
            " Java Variables"," Tutorial-01"};
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1_introductionjava_main);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listview);
        Unit_1_Introductionjava_main.CustomAdapter customAdapter = new Unit_1_Introductionjava_main.CustomAdapter(getApplicationContext(), images, texts);
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

                    if (position == 0) {
                        Intent i = new Intent(Unit_1_Introductionjava_main.this, Unit_1_Introduction_java.class);
                        startActivity(i);
                    }


                    if (position == 1){
                        Intent intent = new Intent(Unit_1_Introductionjava_main.this,unit_Features_of_Java.class);
                        startActivity(intent);
                    }


                    if (position == 2){
                        Intent intent = new Intent(Unit_1_Introductionjava_main.this,First_Java_Program_unit1.class);
                        startActivity(intent);
                    }

                    if(position==3){
                        Intent intent = new Intent(Unit_1_Introductionjava_main.this,Java_Variables_unit1.class);
                        startActivity(intent);
                    }

                    if (position == 4){
                        Intent intent = new Intent(Unit_1_Introductionjava_main.this,java_tutorial_01.class);
                        startActivity(intent);
                    }

                }
            });

            return view;

        }
        }
    }