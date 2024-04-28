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

public class Unit_6_Constructor extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c_plus, R.drawable.c_plus, R.drawable.c_plus,
            R.drawable.c_plus, R.drawable.c_plus,R.drawable.c_plus,};

    String[] texts = {"Introduction",
            "Default Constructo",
            "Parameterized Constructor",
            "Copy Constructor",
            "Dynamic Constructor","Destructor",};
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit6_constructor);
        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });




        ListView listView = findViewById(R.id.listview);

        Unit_6_Constructor.CustomAdapter customAdapter = new Unit_6_Constructor.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(Unit_6_Constructor.this, Introduction_unit6.class);
                       startActivity(i);
                    }

                    if(position == 1){
                       Intent intent = new Intent(Unit_6_Constructor.this,Default_Constructor_unit6.class);
                       startActivity(intent);
                    }

                    if (position ==2){
                        Intent intent = new Intent(Unit_6_Constructor.this,Parameterized_Constructor_unit6.class);
                        startActivity(intent);
                    }

                    if (position == 3){
                        Intent intent = new Intent(Unit_6_Constructor.this,Copy_Constructor.class);
                        startActivity(intent);
                    }

                    if (position == 4){
                        Intent intent = new Intent(Unit_6_Constructor.this,Dynamic_Constructor.class);
                        startActivity(intent);
                    }

                    if (position == 5){
                        Intent intent = new Intent(Unit_6_Constructor.this,Destructor.class);
                        startActivity(intent);
                    }


                }
            });

            return view;

        }
    }
}