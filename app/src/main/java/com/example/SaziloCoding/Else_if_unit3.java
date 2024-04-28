package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Else_if_unit3 extends AppCompatActivity {
ImageView backbtn;
TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_else_if_unit3);
        backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ////**************************************************************************************************************//
        TextView text5 = findViewById(R.id.text5);
        text5.setText("if(expression)\n" +
                "{\n" +
                " //Statements\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                " //Statements\n" +
                "}");
        ////**************************************************************************************************************//
        TextView nk = findViewById(R.id.nk);
        nk.setText("If the test expression is evaluated to true,\n" +
                "\n" +
                "•statements inside the body of if are executed.\n" +
                "•statements inside the body of else are skipped from execution.\n" +
                "\n" +
                "If the test expression is evaluated to false,\n" +
                "\n" +
                "•statements inside the body of else are executed\n" +
                "•statements inside the body of if are skipped from execution.");
        ////**************************************************************************************************************//
        TextView hk = findViewById(R.id.hk);
        hk.setText("// Check whether an integer is odd or even\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main() {\n" +
                "    int number;\n" +
                "    printf(\"Enter an integer: \");\n" +
                "    scanf(\"%d\", &number);\n" +
                "\n" +
                "    // True if the remainder is 0\n" +
                "    if  (number%2 == 0) {\n" +
                "        printf(\"%d is an even integer.\",number);\n" +
                "    }\n" +
                "    else {\n" +
                "        printf(\"%d is an odd integer.\",number);\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}");
        ////**************************************************************************************************************//
        TextView sk = findViewById(R.id.sk);
        sk.setText("Enter an integer: 7\n" +
                "7 is an odd integer.");
        ////**************************************************************************************************************//
        TextView q = findViewById(R.id.q);
        q.setText(" When the user enters 7, the test expression number%2==0 is evaluated to false. Hence, the statement inside the body of else is executed.");





    }
}
