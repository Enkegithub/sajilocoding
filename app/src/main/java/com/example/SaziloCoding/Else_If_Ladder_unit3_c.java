package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Else_If_Ladder_unit3_c extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_else_if_ladder_unit3_c);
        backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ////**************************************************************************************************************//
        TextView Text5 = findViewById(R.id.text5);
        Text5.setText("if(condition1)\n" +
                "{\n" +
                " //statements\n" +
                "} \n" +
                "else if(condition2)\n" +
                "{\n" +
                " //statements\n" +
                "}\n" +
                "else if(condition3)\n" +
                "{\n" +
                " //statements\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                " //statements\n" +
                "}");
        ////**************************************************************************************************************//
        TextView hk = findViewById(R.id.hk);
        hk.setText("// Program to relate two integers using =, > or < symbol\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main() {\n" +
                "    int number1, number2;\n" +
                "    printf(\"Enter two integers: \");\n" +
                "    scanf(\"%d %d\", &number1, &number2);\n" +
                "\n" +
                "    //checks if the two integers are equal.\n" +
                "    if(number1 == number2) {\n" +
                "        printf(\"Result: %d = %d\",number1,number2);\n" +
                "    }\n" +
                "\n" +
                "    //checks if number1 is greater than number2.\n" +
                "    else if (number1 > number2) {\n" +
                "        printf(\"Result: %d > %d\", number1, number2);\n" +
                "    }\n" +
                "\n" +
                "    //checks if both test expressions are false\n" +
                "    else {\n" +
                "        printf(\"Result: %d < %d\",number1, number2);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}");
        ////**************************************************************************************************************//
        TextView sk = findViewById(R.id.sk);
        sk.setText("Enter two integers: 12\n" +
                "23\n" +
                "Result: 12 < 23");


    }
}