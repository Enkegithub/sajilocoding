package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class Call_by_reference_Return_by_reference_Inline_function extends AppCompatActivity {
ImageView backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_by_reference_return_by_reference_inline_function);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        PDFView pdfView = findViewById(R.id.pdfView1);
        pdfView.fromAsset("Call by reference, Return by reference, Inline function._ Programming in C++.pdf").load();
    }
}