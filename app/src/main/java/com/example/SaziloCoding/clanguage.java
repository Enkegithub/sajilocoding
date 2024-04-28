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

public class clanguage extends AppCompatActivity {

    ImageView backbtn;

    int[] images = {R.drawable.c, R.drawable.c, R.drawable.c,
            R.drawable.c,};

    String[] texts = {" Unit-1: Overview of C",
            "  Unit-2: C Fundamentals",
            " Unit-3: Branching and Looping",
            " Unit-4: Array"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.clanguage);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });




        ListView listView = findViewById(R.id.listview);

        clanguage.CustomAdapter customAdapter = new clanguage.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(clanguage.this, unit_1_overview_of_c.class);
                        startActivity(i);
                    }

                    if (position == 1) {
                        Intent n = new Intent(clanguage.this, unit_2_c_fundamentals.class);
                        startActivity(n);
                    }

                    if (position == 2) {
                        Intent b = new Intent(clanguage.this, Unit_3_branching_and_looping.class);
                        startActivity(b);
                    }

                    if (position == 3 ){
                        Intent c = new Intent(clanguage.this,Unit_5_Array.class);
                        startActivity(c);
                    }
                }
            });

            return view;

        }
    }
}