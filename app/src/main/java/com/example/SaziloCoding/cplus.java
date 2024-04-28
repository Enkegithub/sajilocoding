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
import android.widget.Toast;

public class cplus extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c_plus, R.drawable.c_plus, R.drawable.c_plus,
            R.drawable.c_plus, R.drawable.c_plus, R.drawable.c_plus,
            R.drawable.c_plus, };

    String[] texts = {"Unit-1:PRINCIPLES OF OOP",
            " Unit-2: BEGINNING WITH C++",
            "Unit-3:EXPRESSIONS AND CONTROL STRUCTURES",
            "Unit-4: FUNCTIONS IN C++",
            "Unit-5: CLASSES AND OBJECTS"," Unit-6: Constructor",
            "Unit-7: Inheritance",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cplus);

        backbtn = findViewById(R.id.backbtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                onBackPressed();

            }
        });




        ListView listView = findViewById(R.id.listview);

        cplus.CustomAdapter customAdapter = new cplus.CustomAdapter(getApplicationContext(), images, texts);
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
                        Intent i = new Intent(cplus.this, PRINCIPLES_OF_OOP_unit1_cplush.class);
                        startActivity(i);
                    }

                    if(position == 1){
                        Intent intent = new Intent(cplus.this,Unit_2_BEGINNING_WITH_Cpush.class);
                        startActivity(intent);
                    }

                    if (position ==2){
                        Intent intent = new Intent(cplus.this,Unit3_EXPRESSIONS_AND_CONTROL_STRUCTURES.class);
                        startActivity(intent);
                    }

                    if (position == 3){
                        Intent intent = new Intent(cplus.this,Unit4_FUNCTIONS_IN_Cplush.class);
                        startActivity(intent);
                    }

                    if (position ==4){
                        Toast.makeText(context, "Try again", Toast.LENGTH_SHORT).show();
                    }

                    if(position ==5){
                        Intent intent = new Intent(cplus.this,Unit_6_Constructor.class);
                        startActivity(intent);
                    }

                    if (position ==6){
                        Intent intent = new Intent(cplus.this,Unit_7_Inheritance.class);
                        startActivity(intent);
                    }

                }
            });

            return view;

        }

    }
}