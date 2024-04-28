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

public class Unit_3_branching_and_looping extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,
            R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,
            R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c};

    String[] texts = {
            "Introduction to Branching",
            "Simple If", "Else if",
            " Nested If","Else If Ladder","Switch Statement","Ternary Operator","Goto Statement","Introduction to Looping",
            " For Loop","While Loop","Do... While Loop","Break and Continue"," Tutorial-03"};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3_branching_and_looping);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listview);
        Unit_3_branching_and_looping.CustomAdapter customAdapter = new Unit_3_branching_and_looping.CustomAdapter(getApplicationContext(), images, texts);
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
                     Intent i = new Intent(Unit_3_branching_and_looping.this, Introduction_to_Branching_unit3.class);
                       startActivity(i);

                    }

                    if (position == 1)
                    {
                        Intent n = new Intent(Unit_3_branching_and_looping.this,Simple_If_unit_3.class);
                        startActivity(n);
                    }

                    if (position == 2){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Else_if_unit3.class);
                        startActivity(intent);
                    }

                    if (position == 3) {
                        Intent b = new Intent(Unit_3_branching_and_looping.this,Nested_If_c_unit3.class);
                        startActivity(b);
                    }

                    if (position ==4 ){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Else_If_Ladder_unit3_c.class);
                        startActivity(intent);
                    }

                    if(position ==5){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Switch_Statement_unit3_c.class);
                        startActivity(intent);
                    }
                    if(position ==6){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Ternary_Operator_unit3_c.class);
                        startActivity(intent);
                    }
                    if(position ==7){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Goto_Statement_unit3_c.class);
                        startActivity(intent);
                    }

                    if(position ==8){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Introduction_to_Looping_c_unit_3.class);
                        startActivity(intent);
                    }
                    if(position ==9){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,For_Loop_c_unit_3.class);
                        startActivity(intent);
                    }
                    if(position ==10){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,While_Loop_C_unit_3.class);
                        startActivity(intent);
                    }
                    if(position ==11){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Do_While_Loop.class);
                        startActivity(intent);
                    }
                    if(position ==12){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,Break_and_Continue.class);
                        startActivity(intent);
                    }
                    if(position ==13){
                        Intent intent = new Intent(Unit_3_branching_and_looping.this,C_Tutorial_3.class);
                        startActivity(intent);
                    }
                }

            });



            return view;

        }
    }
    }