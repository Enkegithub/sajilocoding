package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class Default_arguments_Const_arguments_Function_overloading extends AppCompatActivity {
ImageView backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_arguments_const_arguments_function_overloading);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        PDFView pdfView = findViewById(R.id.pdfView1);
        pdfView.fromAsset("Default arguments, Const arguments, Function overloading._ Programming in C++.pdf").load();
    }
}