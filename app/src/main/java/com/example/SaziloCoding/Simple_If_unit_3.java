package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Simple_If_unit_3 extends AppCompatActivity {
  ImageView backbtn;
  TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_if_unit3);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ////**************************************************************************************************************//
       TextView text5 = findViewById(R.id.text5);
        text5.setText("if (test expression)\n" +
                "        {\n" +
                "        // code\n" +
                "        }");
        ////**************************************************************************************************************//
        TextView nk = findViewById(R.id.nk);
        nk.setText("The if statement evaluates the test expression inside the parenthesis ().\n" +
                "\n" +
                "•If the test expression is evaluated to true, statements inside the body of if are executed.\n" +
                "•If the test expression is evaluated to false, statements inside the body of if are not executed.");

////**************************************************************************************************************//
        TextView hk = findViewById(R.id.hk);
        hk.setText("// Program to display a number if it is negative\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main() {\n" +
                "    int number;\n" +
                "\n" +
                "    printf(\"Enter an integer: \");\n" +
                "    scanf(\"%d\", &number);\n" +
                "\n" +
                "    // true if number is less than 0\n" +
                "    if (number < 0) {\n" +
                "        printf(\"You entered %d.\\n\", number);\n" +
                "    }\n" +
                "\n" +
                "    printf(\"The if statement is easy.\");\n" +
                "\n" +
                "    return 0;\n" +
                "}");

        ////**************************************************************************************************************//
        TextView sk = findViewById(R.id.sk);
        sk.setText("Enter an integer: -2\n" +
                "You entered -2.\n" +
                "The if statement is easy.");
        ////**************************************************************************************************************//
        TextView sm = findViewById(R.id.sm);
        sm.setText("Enter an integer: 5\n" +
                "The if statement is easy.\n");
        ////**************************************************************************************************************//
        TextView q = findViewById(R.id.q);
        q.setText("When the user enters -2, the test expression number<0 is evaluated to true. Hence, You entered -2 is displayed on the screen.");

        ////**************************************************************************************************************//
        TextView w = findViewById(R.id.w);
        w.setText("When the user enters 5, the test expression number<0 is evaluated to false and the statement inside the body of if is not executed");
    }
}


