package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class python_Dictionaries_and_Sets extends AppCompatActivity {
 TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_dictionaries_and_sets);

        TextView b5 = findViewById(R.id.b5);
        b5.setText("set1 = {1, 2, 3}\n" +
                " set2 = {2, 3, 4}\n" +
                "set3 = set1 &amp; set2  # intersection of set1 and set2\n" +
                "set4 = set1 | set2  # union of set1 and set2\n" +
                "set5 = set1 - set2  # difference of set1 and set2");
    }
}