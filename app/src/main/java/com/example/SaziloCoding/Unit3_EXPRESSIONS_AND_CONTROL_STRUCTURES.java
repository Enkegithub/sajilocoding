package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.github.barteksc.pdfviewer.PDFView;

public class Unit3_EXPRESSIONS_AND_CONTROL_STRUCTURES extends AppCompatActivity {
    ImageView backbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit3_expressions_and_control_structures);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        PDFView pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("C-Unit-1-Chapter-3.pdf").load();

    }
}