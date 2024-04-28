package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Hybrid_nheritance extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hybrid_nheritance);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView he = findViewById(R.id.he);
        he.setText("Hybrid Inheritance is implemented by combining more than one type of inheritance. For example: Combining Hierarchical inheritance and Multiple Inheritance. \n" +
                "Below image shows the combination of hierarchical and multiple inheritance:\n" +
                "\n" +
                "// C++ program for Hybrid Inheritance\n" +
                "\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "\n" +
                "// base class\n" +
                "class Vehicle\n" +
                "{\n" +
                "   public:\n" +
                "   Vehicle()\n" +
                "   {\n" +
                "        cout << \"This is a Vehicle\" << endl;\n" +
                "   }\n" +
                "};\n" +
                "\n" +
                "//base class\n" +
                "class Fare\n" +
                "{\n" +
                "    public:\n" +
                "    Fare()\n" +
                "    {\n" +
                "        cout<<\"Fare of Vehicle\\n\";\n" +
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
                "class Bus: public Vehicle, public Fare\n" +
                "{\n" +
                "\n" +
                "};\n" +
                "\n" +
                "// main function\n" +
                "int main()\n" +
                "{\n" +
                "    // creating object of sub class will\n" +
                "    // invoke the constructor of base class\n" +
                "    Bus obj2;\n" +
                "   return 0;\n" +
                "}");
    }
}