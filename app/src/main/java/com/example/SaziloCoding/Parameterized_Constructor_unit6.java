package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Parameterized_Constructor_unit6 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parameterized_constructor_unit6);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView vp1 = findViewById(R.id.vp1);
        vp1.setText("It is possible to pass arguments to constructors. Typically, these arguments help initialize an object when it is created. To create a parameterized constructor, simply add parameters to it the way you would to any other function. When you define the constructor’s body, use the parameters to initialize the object. \n" +
                "\n" +
                " ");


        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText("// CPP program to illustrate\n" +
                "// parameterized constructors\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "class Point\n" +
                "{\n" +
                "private:\n" +
                "int x, y;\n" +
                "\n" +
                "public:\n" +
                "// Parameterized Constructor\n" +
                "Point(int x1, int y1)\n" +
                "{\n" +
                "x = x1;\n" +
                "y = y1;\n" +
                "}\n" +
                "\n" +
                "int getX()\n" +
                "{\n" +
                "return x;\n" +
                "}\n" +
                "int getY()\n" +
                "{\n" +
                "return y;\n" +
                "}\n" +
                "};\n" +
                "\n" +
                "int main()\n" +
                "{\n" +
                "// Constructor called\n" +
                "Point p1(10, 15);\n" +
                "\n" +
                "// Access values assigned by constructor\n" +
                "cout << \"p1.x = \" << p1.getX() << \", p1.y = \" << p1.getY();\n" +
                "\n" +
                "return 0;\n" +
                "}");

    }
}