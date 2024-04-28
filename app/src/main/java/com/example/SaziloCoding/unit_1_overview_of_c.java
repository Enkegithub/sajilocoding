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

public class unit_1_overview_of_c extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,
            R.drawable.c,R.drawable.c,
    };

    String[] texts = {
            "Introduction to Programming", "Introduction to C Programming",
            "Structure of C Program", "Program compilation and running",
            "Sample C Program and Execution ","Tutorial-01"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.unit_1_overview_of_c);

        backbtn=findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listview);

        unit_1_overview_of_c.CustomAdapter customAdapter = new unit_1_overview_of_c.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(unit_1_overview_of_c.this, Introduction_to_Programming_c.class);
                        startActivity(i);
                    }

                  if(position == 1){
                     Intent intent = new Intent(unit_1_overview_of_c.this,Introduction_to_C_Programming.class);
                     startActivity(intent);
                  }

                  if(position == 2){
                      Intent intent= new Intent(unit_1_overview_of_c.this,Structure_of_C_Program.class);
                      startActivity(intent);
                  }

                  if(position ==3){
                      Intent intent= new Intent(unit_1_overview_of_c.this,Program_compilation_and_running.class);
                      startActivity(intent);
                  }
                  if(position == 4){
                      Intent intent = new Intent(unit_1_overview_of_c.this,Sample_C_Program_and_Execution.class);
                      startActivity(intent);
                  }

                  if (position == 5){
                      Intent intent =new Intent(unit_1_overview_of_c.this,cprogramTutorial_01.class);
                      startActivity(intent);
                  }
                }
            });



            return view;

        }
    }
    }