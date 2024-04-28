package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Switch_Statement_unit3_c extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_statement_unit3_c);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ////**************************************************************************************************************//
        TextView kj = findViewById(R.id.kj);
        kj.setText("The switch statement allows us to execute one code block among many alternatives.\n" +
                "\n" +
                "You can do the same thing with the if...else..if ladder. However, the syntax of the switch statement is much easier to read and write.");
////**************************************************************************************************************//
        TextView text5 = findViewById(R.id.text5);
        text5.setText("switch (expression)\n" +
                "\u200B{\n" +
                "    case constant1:\n" +
                "      // statements\n" +
                "      break;\n" +
                "\n" +
                "    case constant2:\n" +
                "      // statements\n" +
                "      break;\n" +
                "    .\n" +
                "    .\n" +
                "    .\n" +
                "    default:\n" +
                "      // default statements\n" +
                "}");

        ////**************************************************************************************************************//
        TextView da = findViewById(R.id.da);
        da.setText("\tThe expression is evaluated once and compared with the values of each case label.\n" +
                "\n" +
                "•If there is a match, the corresponding statements after the matching label are executed. For example, if the value of the expression is equal to constant2, statements after case constant2: are executed until break is encountered.\n" +

                "•If there is no match, the default statements are executed.\n" +
                "\n" +
                " If we do not use break, all statements after the matching label are executed.\n" +
                "\n" +
                "By the way, the default clause inside the switch statement is optional.");

        ////**************************************************************************************************************//
        TextView hk = findViewById(R.id.hk);
        hk.setText("// Program to create a simple calculator\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "    char operator;\n" +
                "    double n1, n2;\n" +
                "\n" +
                "    printf(\"Enter an operator (+, -, *, /): \");\n" +
                "    scanf(\"%c\", &operator);\n" +
                "    printf(\"Enter two operands: \");\n" +
                "    scanf(\"%lf %lf\",&n1, &n2);\n" +
                "\n" +
                "    switch(operator)\n" +
                "    {\n" +
                "        case '+':\n" +
                "            printf(\"%.1lf + %.1lf = %.1lf\",n1, n2, n1+n2);\n" +
                "            break;\n" +
                "\n" +
                "        case '-':\n" +
                "            printf(\"%.1lf - %.1lf = %.1lf\",n1, n2, n1-n2);\n" +
                "            break;\n" +
                "\n" +
                "        case '*':\n" +
                "            printf(\"%.1lf * %.1lf = %.1lf\",n1, n2, n1*n2);\n" +
                "            break;\n" +
                "\n" +
                "        case '/':\n" +
                "            printf(\"%.1lf / %.1lf = %.1lf\",n1, n2, n1/n2);\n" +
                "            break;\n" +
                "\n" +
                "        // operator doesn't match any case constant +, -, *, /\n" +
                "        default:\n" +
                "            printf(\"Error! operator is not correct\");\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}");
        ////**************************************************************************************************************//
        TextView sk = findViewById(R.id.sk);
        sk.setText("Enter an operator (+, -, *,): -\n" +
                "Enter two operands: 32.5\n" +
                "12.4\n" +
                "32.5 - 12.4 = 20.1");
        ////**************************************************************************************************************//
        TextView q = findViewById(R.id.q);
        q.setText("The - operator entered by the user is stored in the operator variable. And, two operands 32.5 and 12.4 are stored in variables n1 and n2 respectively.\n" +
                "\n" +
                "Since the operator is -, the control of the program jumps to");

        /////*****************************************************************************///////////////////////////
        TextView t = findViewById(R.id.t);
        t.setText("printf(\"%.1lf - %.1lf = %.1lf\", n1, n2, n1-n2);");
    }
}