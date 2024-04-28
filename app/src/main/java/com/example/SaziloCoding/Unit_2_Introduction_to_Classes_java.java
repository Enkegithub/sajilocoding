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

public class Unit_2_Introduction_to_Classes_java extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.java,R.drawable.java,R.drawable.java,R.drawable.java,
            R.drawable.java,};

    String[] texts = {
            "Object and Classes in Java",
            "Introducing methods in Java", "Introduction to Constructors and \"this\" keyword",
            " Introduction to wrapper class","Tutorial-2"};
    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2_introduction_to_classes_java);
        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listview);
        Unit_2_Introduction_to_Classes_java.CustomAdapter customAdapter = new Unit_2_Introduction_to_Classes_java.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(Unit_2_Introduction_to_Classes_java.this, Object_and_Classes_in_Java_unit_2.class);
                        startActivity(i);
                    }

                   if(position == 1){
                       Intent intent = new Intent(Unit_2_Introduction_to_Classes_java.this,Introducing_methods_in_Java_unit_2.class);
                       startActivity(intent);
                   }

                   if (position == 2){
                       Intent intent = new Intent(Unit_2_Introduction_to_Classes_java.this,Introduction_to_Constructors_and_this_keyword_uniht_2java.class);
                       startActivity(intent);
                   }


                   if(position == 3){
                       Intent intent = new Intent(Unit_2_Introduction_to_Classes_java.this,Introduction_to_wrapper_class_unit2java.class);
                       startActivity(intent);
                   }

                   if (position == 4 ){
                       Intent intent = new Intent(Unit_2_Introduction_to_Classes_java.this,Tutorial_2_java.class);
                       startActivity(intent);
                   }

                }
            });

            return view;

        }
    }
}