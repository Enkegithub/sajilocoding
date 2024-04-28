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

import com.google.firebase.database.snapshot.Index;

import java.lang.reflect.Array;

public class Unit_5_Array extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,
            R.drawable.c,R.drawable.c};

    String[] texts = {
            " Introduction to Array",
            " Declaring, Initializing and Accessing an array element", "Examples",
            "Two Dimensional Array in C","Multi Dimensional Array","Tutorial-04"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit5_array);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listview);
        Unit_5_Array.CustomAdapter customAdapter = new Unit_5_Array.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent intent = new Intent(Unit_5_Array.this,Introduction_to_Array_c_unit_5.class);
                        startActivity(intent);

                    }

                    if (position ==1){
                        Intent intent = new Intent(Unit_5_Array.this,Declaring_Initializing_and_Accessing_an_array_element.class);
                        startActivity(intent);
                    }

                   if (position == 2){
                       Intent intent = new Intent(Unit_5_Array.this,Examples_c_arry.class);
                       startActivity(intent);
                   }
                    if (position == 3){
                        Intent intent = new Intent(Unit_5_Array.this,Two_Dimensional_Array_in_C.class);
                        startActivity(intent);
                    }
                    if (position == 4){
                        Intent intent = new Intent(Unit_5_Array.this,Multi_Dimensional_Array.class);
                        startActivity(intent);
                    }
                    if (position == 5){
                        Intent intent = new Intent(Unit_5_Array.this,Tutorial4_c_arry.class);
                        startActivity(intent);
                    }
                }
            });



            return view;

        }
    }
}