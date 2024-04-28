package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Multilevel_Inheritance extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;
    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multilevel_inheritance);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });



        TextView vp2 = findViewById(R.id.vp2);
        vp2.setText("When one class inherits another class which is further inherited by another class, it is known as multi level inheritance in C++. Inheritance is transitive so the last derived class acquires all the members of all its base classes.\n" +
                "\n" +
                "Let's see the example of multi level inheritance in C++.\n" +
                "\n" +
                "#include <iostream>\n" +
                "using namespace std;\n" +
                "class Animal {\n" +
                "    public:\n" +
                "     void eat() {\n" +
                "        cout<<\"Eating...\"<<endl;\n" +
                "     }\n" +
                "};\n" +
                "class Dog: public Animal\n" +
                "{\n" +
                "    public:\n" +
                "    void bark(){\n" +
                "      cout<<\"Barking...\"<<endl;\n" +
                "    }\n" +
                "};\n" +
                "class BabyDog: public Dog\n" +
                "{\n" +
                "public:\n" +
                "    void weep() {\n" +
                "     cout<<\"Weeping...\";\n" +
                "   }\n" +
                "};\n" +
                "int main(void) {\n" +
                "  BabyDog d1;\n" +
                "    d1.eat();\n" +
                "    d1.bark();\n" +
                "    d1.weep();\n" +
                "    return 0;\n" +
                "}\n" +
                "\n" +
                " \n" +
                "\n" +
                " ");
    }
}