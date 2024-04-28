package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Multiple_Inheritance extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiple_inheritance);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        TextView vp2 =findViewById(R.id.vp2);
        vp2.setText("// C++ program to explain\n" +
                "// multiple inheritance\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "// first base class\n" +
                "class Vehicle {\n" +
                "public:\n" +
                " Vehicle()\n" +
                " {\n" +
                " cout << \"This is a Vehicle\" << endl;\n" +
                " }\n" +
                "};\n" +
                "\n" +
                "// second base class\n" +
                "class FourWheeler {\n" +
                "public:\n" +
                " FourWheeler()\n" +
                " {\n" +
                " cout << \"This is a 4 wheeler Vehicle\" << endl;\n" +
                " }\n" +
                "};\n" +
                "\n" +
                "// sub class derived from two base classes\n" +
                "class Car: public Vehicle, public FourWheeler {\n" +
                "\n" +
                "};\n" +
                "\n" +
                "// main function\n" +
                "int main()\n" +
                "{\n" +
                " // creating object of sub class will\n" +
                " // invoke the constructor of base classes\n" +
                " Car obj;\n" +
                " return 0;\n" +
                "}");
    }
}