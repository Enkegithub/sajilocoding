package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_to_Branching_unit3 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_branching_unit3);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        textView = findViewById(R.id.m2);
        textView.setText("1. Simple if statement\n" +
                "\n" +
                "2. if… else statement\n" +
                "\n" +
                "3. Nested if…else statement\n" +
                "\n" +
                "4. else…if ladder\n" +
                "\n" +
                "5. Switch Statement\n" +
                "\n" +
                "6. Conditional or Ternary operator\n" +
                "\n" +
                "6. Goto Statement");



    }
}