package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Hierarchical_Inheritance extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hierarchical_inheritance);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        TextView he = findViewById(R.id.he);
        he.setText("In this type of inheritance, more than one sub class is inherited from a single base class. i.e. more than one derived class is created from a single base class.\n" +
                "\n" +
                "// C++ program to implement\n" +
                "// Hierarchical Inheritance\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "// base class\n" +
                "class Vehicle\n" +
                "{\n" +
                "    public:\n" +
                "    Vehicle()\n" +
                "    {\n" +
                "        cout << \"This is a Vehicle\" << endl;\n" +
                "    }\n" +
                "};\n" +
                "\n" +
                "// first sub class\n" +
                "class Car: public Vehicle\n" +
                "{\n" +
                "\n" +
                "};\n" +
                "\n" +
                "// second sub class\n" +
                "class Bus: public Vehicle\n" +
                "{\n" +
                "\n" +
                "};\n" +
                "\n" +
                "// main function\n" +
                "int main()\n" +
                "{\n" +
                "    // creating object of sub class will\n" +
                "   // invoke the constructor of base class\n" +
                "   Car obj1;\n" +
                "   Bus obj2;\n" +
                "  return 0;\n" +
                "}");
    }
}