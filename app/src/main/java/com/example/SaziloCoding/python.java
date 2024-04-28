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

public class python extends AppCompatActivity {

    ImageView backbtn;

    int[] images = { R.drawable.python,R.drawable.python,
            R.drawable.python,R.drawable.python,
            R.drawable.python, R.drawable.python, R.drawable.python,
            R.drawable.python, R.drawable.python,R.drawable.python,R.drawable.python};

    String[] texts = {"Tutorial", "Introduction to Python",
            "Dictionaries and Sets", "Conditional Execution & Loops", "Functions ",
            "Modules ","Scopes and Namespaces","File Handling ","Multithreading ","Python Variables & Data Types  "};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ListView listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(python.this, Python_tutorial.class);
                        startActivity(i);

                    }

                    if (position == 1){
                        Intent intent = new Intent(python.this,python_introduction.class);
                        startActivity(intent);
                    }

                    if (position == 2){
                        Intent intent = new Intent(python.this,python_Dictionaries_and_Sets.class);
                        startActivity(intent);
                    }

                    if (position == 3){
                        Intent intent = new Intent(python.this,Conditional_Execution_and_Loops_python.class);
                        startActivity(intent);
                    }

                    if (position == 4){
                        Intent intent = new Intent(python.this,Functions_in_python.class);
                        startActivity(intent);
                    }

                    if(position ==5){
                        Intent intent = new Intent(python.this,Modules_in_python.class);
                        startActivity(intent);
                    }

                    if(position == 6){
                        Intent intent = new Intent(python.this,Scopes_and_Namespaces_python.class);
                        startActivity(intent);
                    }

                    if (position == 7){
                        Intent intent = new Intent(python.this,File_Handling_python.class);
                        startActivity(intent);
                    }

                    if (position ==8){
                        Intent intent = new Intent(python.this,Multithreading_python.class);
                        startActivity(intent);
                    }

                    if (position ==9){
                        Intent intent = new Intent(python.this,Python_Variables_Data_Types.class);
                        startActivity(intent);
                    }

                }
            });



            return view;

        }
    }
}
