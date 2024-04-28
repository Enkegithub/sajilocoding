package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class C_Tutorial_3 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctutorial3);
         backbtn = findViewById(R.id.backbtn);
         backbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 onBackPressed();
             }
         });

        int[] images = {R.drawable.c,R.drawable.c,
                R.drawable.c,R.drawable.c,
                R.drawable.c,};




                String[] texts = {"1.Write a C program to print maximum number from given two numbers.",
                        "2.Write a C program to demonstrate the use of nested for loop.",
                        "3.Write a C program to print 1 to 10 using for loop.",
                        " 4.Write a C program to print event numbers between 1 to 50 using while loop.",
                        " 5.Write a C program to print multiplication table of given number.",
                };







        ListView listView = findViewById(R.id.listview);

        C_Tutorial_3.CustomAdapter customAdapter = new C_Tutorial_3.CustomAdapter(getApplicationContext(), images, texts);
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
//                   if (position == 0) {
//                      Intent i = new Intent(Python_tutorial.this, Introducrion_to_python.class);
//                       startActivity(i);
//                   }
                    }
                });


                return view;

            }

        }
}


