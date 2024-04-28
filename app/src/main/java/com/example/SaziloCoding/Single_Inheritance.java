package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Single_Inheritance extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_inheritance);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        TextView vp2 = findViewById(R.id.vp2);
        vp2.setText("When one class inherits another class, it is known as single level inheritance. Let's see the example of single level inheritance which inherits the fields only.\n" +
                "\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "class Account\n" +
                "\n" +
                "{\n" +
                "   public:\n" +
                "    float salary = 60000;\n" +
                "};\n" +
                "class Programmer: public Account\n" +
                "\n" +
                "{\n" +
                "   public:\n" +
                "     float bonus = 5000;\n" +
                "};\n" +
                "\n" +
                "int main(void)\n" +
                "\n" +
                "{\n" +
                "    Programmer p1;\n" +
                "    cout<<\"Salary: \"<<p1.salary<<endl;\n" +
                "    cout<<\"Bonus: \"<<p1.bonus<<endl;\n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                "In the above example, Employee is the base class and Programmer is the derived class.");

        TextView vp3 = findViewById(R.id.vp3);
        vp3.setText("Let's see another example of inheritance in C++ which inherits methods only.\n" +
                "\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "class Animal\n" +
                "\n" +
                "{\n" +
                "   public:\n" +
                "   void eat() {\n" +
                "       cout<<\"Eating...\"<<endl;\n" +
                "   }\n" +
                "};\n" +
                "class Dog: public Animal\n" +
                "{\n" +
                "   public:\n" +
                "   void bark()\n" +
                "\n" +
                "   {\n" +
                "    cout<<\"Barking...\";\n" +
                "    }\n" +
                "};\n" +
                "int main(void)\n" +
                "\n" +
                "{\n" +
                "   Dog d1;\n" +
                "   d1.eat();\n" +
                "   d1.bark();\n" +
                "   return 0;\n" +
                "}");

    }
}