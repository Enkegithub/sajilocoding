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

public class Android extends AppCompatActivity {
    ImageView backbtn;

    int[] images = {R.drawable.documents, R.drawable.documents, R.drawable.documents,
            R.drawable.documents, R.drawable.documents, R.drawable.documents,
            R.drawable.documents, R.drawable.documents,R.drawable.documents,
            R.drawable.documents,R.drawable.documents};

    String[] texts = {"Unit-1:Tutorials",
            " Unit-2: Examples",
            "Unit-3:  Android UI Widgets",
            "Unit-4: Interview Q/A",
            "Unit-5:Android Toast",
            "Unit-6:Android Intent",
            "Unit-7:Android Fragment",
            "Unit-8:Android Containers",
            "Unit-9:Android Menu",
            "Unit-10:Android Date and Time",
            "Unit-11:Android Notification",};

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.android);

         backbtn = findViewById(R.id.backbtn);

         backbtn.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 onBackPressed();
             }
         });






        ListView listView = findViewById(R.id.listview);

        Android.CustomAdapter customAdapter = new Android.CustomAdapter(getApplicationContext(), images, texts);
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
//                        Intent i = new Intent(Android.this, demo.class);
//                        startActivity(i);
                    }
                }
            });

            return view;

        }


    }
}