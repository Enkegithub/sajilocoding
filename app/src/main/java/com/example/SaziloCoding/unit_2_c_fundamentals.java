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

public class unit_2_c_fundamentals extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,R.drawable.c,};

    String[] texts = {
            "2.1 - Character Set of C",
            "2.2 - Tokens", "2.3 - C Variable and Datatypes",
            "2.4 - Structure of a C program"};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit2_cfundamentals);

        backbtn=findViewById(R.id.backbtn);
         backbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 onBackPressed();
             }
         });

        ListView listView = findViewById(R.id.listview);
        unit_2_c_fundamentals.CustomAdapter customAdapter = new unit_2_c_fundamentals.CustomAdapter(getApplicationContext(), images, texts);
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
                       Intent i = new Intent(unit_2_c_fundamentals.this, Character_Set_of_C.class);
                        startActivity(i);

                    }

                    if (position == 1){
                        Intent intent = new Intent(unit_2_c_fundamentals.this,c_Tokens.class);
                        startActivity(intent);
                    }

                    if (position == 2 ){
                        Intent n = new Intent(unit_2_c_fundamentals.this,C_variable_and_datatypes.class);
                        startActivity(n);
                    }

                    if(position ==3){
                        Intent m = new Intent(unit_2_c_fundamentals.this,Structure_of_a_C_program.class);
                        startActivity(m);
                    }

                }
            });



            return view;

        }
    }
}