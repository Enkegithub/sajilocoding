package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Default_Constructor_unit6 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_constructor_unit6);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText("// Cpp program to illustrate the\n" +
                "// concept of Constructors\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "class construct\n" +
                "{\n" +
                "public:\n" +
                "int a, b;\n" +
                "\n" +
                "// Default Constructor\n" +
                "construct()\n" +
                "{\n" +
                "a = 10;\n" +
                "b = 20;\n" +
                "}\n" +
                "};\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "// Default constructor called automatically\n" +
                "// when the object is created\n" +
                "construct c;\n" +
                "cout << \"a: \" << c.a << endl\n" +
                "<< \"b: \" << c.b;\n" +
                "return 1;\n" +
                "}");

    }
}