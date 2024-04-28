package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Copy_Constructor extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_copy_constructor);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView vp1 = findViewById(R.id.vp1);
        vp1.setText("A copy constructor is a member function which initializes an object using another object of the same class. Detailed article on Copy Constructor .\n" +
                "\n" +
                "Whenever we define one or more non-default constructors( with parameters ) for a class, a default constructor( without parameters ) should also be explicitly defined as the compiler will not provide a default constructor in this case. However, it is not necessary but it’s considered to be the best practice to always define a default constructor. ");



        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText("// Illustration\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "class point\n" +
                "{\n" +
                "private:\n" +
                "double x, y;\n" +
                "\n" +
                "public:\n" +
                "\n" +
                "// Non-default Constructor &\n" +
                "// default Constructor\n" +
                "point (double px, double py)\n" +
                "{\n" +
                "x = px, y = py;\n" +
                "}\n" +
                "};\n" +
                "\n" +
                "int main(void)\n" +
                "{\n" +
                "\n" +
                "// Define an array of size\n" +
                "// 10 & of type point\n" +
                "// This line will cause error\n" +
                "point a[10];\n" +
                "\n" +
                "// Remove above line and program\n" +
                "// will compile without error\n" +
                "point b = point(5, 6);\n" +
                "}");

    }
}