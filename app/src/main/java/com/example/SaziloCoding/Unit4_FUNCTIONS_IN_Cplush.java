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

public class Unit4_FUNCTIONS_IN_Cplush extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c_plus, R.drawable.c_plus, R.drawable.c_plus,
            R.drawable.c_plus, R.drawable.c_plus,};

    String[] texts = {"The main function.",
            "Function prototype.",
            "Call by reference, Return by reference, Inline function.",
            "Default arguments, Const arguments, Function overloading.",
            "Friend and virtual functions.",};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit4_functions_in_cplush);
        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });




        ListView listView = findViewById(R.id.listview);

        Unit4_FUNCTIONS_IN_Cplush.CustomAdapter customAdapter = new Unit4_FUNCTIONS_IN_Cplush.CustomAdapter(getApplicationContext(), images, texts);
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

                    if (position == 0){
                        Intent i = new Intent(Unit4_FUNCTIONS_IN_Cplush.this, The_main_function.class);
                        startActivity(i);
                    }

                    if(position == 4){
                        Intent intent = new Intent(Unit4_FUNCTIONS_IN_Cplush.this,Friend_and_virtual_functions.class);
                        startActivity(intent);
                    }

                    if (position ==3){
                        Intent intent = new Intent(Unit4_FUNCTIONS_IN_Cplush.this,Default_arguments_Const_arguments_Function_overloading.class);
                        startActivity(intent);
                    }

                    if (position == 2){
                        Intent intent = new Intent(Unit4_FUNCTIONS_IN_Cplush.this,Call_by_reference_Return_by_reference_Inline_function.class);
                        startActivity(intent);
                    }

                    if (position == 1){
                        Intent intent = new Intent(Unit4_FUNCTIONS_IN_Cplush.this,Function_prototype_cplush.class);
                        startActivity(intent);
                    }
                }
            });

            return view;

        }
    }
}