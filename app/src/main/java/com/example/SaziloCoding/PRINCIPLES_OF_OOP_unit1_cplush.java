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

public class PRINCIPLES_OF_OOP_unit1_cplush extends AppCompatActivity {

    ImageView backbtn;

    int[] images = {R.drawable.c_plus, R.drawable.c_plus, R.drawable.c_plus,
            R.drawable.c_plus, R.drawable.c_plus, R.drawable.c_plus,};

    String[] texts = {"Procedure-Oriented Programming.",
            "Object Oriented Programming paradigm.",
            "Basic concepts of Object Oriented Programming.",
            "Benefits of Object Oriented Programming.",
            "Object Oriented languages.",
            "Application of Object Oriented Programming.",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principles_of_oop_unit1_cplush);

        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });




        ListView listView = findViewById(R.id.listview);

        PRINCIPLES_OF_OOP_unit1_cplush.CustomAdapter customAdapter = new PRINCIPLES_OF_OOP_unit1_cplush.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(PRINCIPLES_OF_OOP_unit1_cplush.this,Procedure_Oriented_Programming_unit1_cplush.class);
                        startActivity(i);
                    }
                    if (position == 1){
                        Intent intent = new Intent(PRINCIPLES_OF_OOP_unit1_cplush.this,Object_Oriented_Programming_paradigm_cplush_unit1.class);
                        startActivity(intent);
                    }
                    if (position ==2){
                        Intent intent = new Intent(PRINCIPLES_OF_OOP_unit1_cplush.this,Basic_concepts_of_Object_Oriented_Programming_cplus.class);
                        startActivity(intent);
                    }
                    if (position ==3){
                        Intent intent = new Intent(PRINCIPLES_OF_OOP_unit1_cplush.this,Benefits_of_Object_Oriented_Programming_cplus.class);
                        startActivity(intent);
                    }

                    if (position ==4){
                        Intent intent = new Intent(PRINCIPLES_OF_OOP_unit1_cplush.this,Object_Oriented_languages_cplus.class);
                        startActivity(intent);
                    }
                    if (position == 5){
                        Intent intent = new Intent(PRINCIPLES_OF_OOP_unit1_cplush.this,Application_of_Object_Oriented_Programming.class);
                        startActivity(intent);
                    }
                }
            });

            return view;

        }
    }
}