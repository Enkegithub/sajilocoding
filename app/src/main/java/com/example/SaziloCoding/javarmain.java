package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.autofill.ImageTransformation;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class javarmain extends AppCompatActivity  {
    ImageView backbtn;

    int[] images = {R.drawable.java, R.drawable.java, R.drawable.java,
            R.drawable.java, R.drawable.java, R.drawable.java,
            R.drawable.java,};

    String[] texts = {"Unit-1: Introduction", " Unit-2: Introduction to Classes",
            "Unit-3: More about classes and Methods","Unit-4: PACKAGES AND INTERFACES",
            "Unit-5: Concepts of Inheritance","Unit-6: String handling ",
            " Unit-7: Applet and its Applications",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java);

        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });




        ListView listView = findViewById(R.id.listview);

        javarmain.CustomAdapter customAdapter = new javarmain.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(javarmain.this, Unit_1_Introductionjava_main.class);
                        startActivity(i);
                    }

                    if (position == 1){
                        Intent intent = new Intent(javarmain.this,Unit_2_Introduction_to_Classes_java.class);
                        startActivity(intent);
                    }

                    if (position ==2){
                        Intent intent = new Intent(javarmain.this,Unit_3_More_about_classes_and_Methods_java.class);
                        startActivity(intent);
                    }



                    if (position == 3){
                        Intent intent = new Intent(javarmain.this,Packages_and_Interfaces_in_Java_unit_4.class);
                        startActivity(intent);
                    }

                    if (position == 4){
                        Intent intent = new Intent(javarmain.this,Unit_5_Concepts_of_Inheritance_java.class);
                        startActivity(intent);
                    }

                    if (position==5){
                        Intent intent = new Intent(javarmain.this,String_Handling_in_Java_unit_6.class);
                        startActivity(intent);
                    }

                    if(position == 6){
                        Toast.makeText(context, "Not Publish", Toast.LENGTH_SHORT).show();

                    }

                }
            });

            return view;

        }


    }


}