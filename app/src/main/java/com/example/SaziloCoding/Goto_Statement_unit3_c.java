package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Goto_Statement_unit3_c extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goto_statement_unit3_c);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView gotto = findViewById(R.id.gotto);
        gotto.setText(Html.fromHtml("The <font color='#DC8E47'>goto </font> statement allows us to transfer control of the program to the specified label."));

        TextView t5 = findViewById(R.id.t5);
        t5.setText("goto label;\n" +
                "... .. ...\n" +
                "... .. ...\n" +
                "label: \n" +
                "statement;");

        TextView mg = findViewById(R.id.mg);
        mg.setText(Html.fromHtml("The label is an identifier. When the The <font color='#DC8E47'>goto </font> statement is encountered, the control of the program jumps to The <font color='#DC8E47'>label </font>: and starts executing the code."));


        TextView ak = findViewById(R.id.ak);
        ak.setText("// Program to calculate the sum and average of positive numbers\n" +
                "// If the user enters a negative number, the sum and average are displayed.\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "\n" +
                "   const int maxInput = 100;\n" +
                "   int i;\n" +
                "   double number, average, sum = 0.0;\n" +
                "\n" +
                "   for (i = 1; i <= maxInput; ++i) {\n" +
                "      printf(\"%d. Enter a number: \", i);\n" +
                "      scanf(\"%lf\", &number);\n" +
                "      \n" +
                "      // go to jump if the user enters a negative number\n" +
                "      if (number < 0.0) {\n" +
                "         goto jump;\n" +
                "      }\n" +
                "      sum += number;\n" +
                "   }\n" +
                "\n" +
                "jump:\n" +
                "   average = sum / (i - 1);\n" +
                "   printf(\"Sum = %.2f\\n\", sum);\n" +
                "   printf(\"Average = %.2f\", average);\n" +
                "\n" +
                "   return 0;\n" +
                "}");


        TextView an = findViewById(R.id.an);
        an.setText("1. Enter a number: 3\n" +
                "2. Enter a number: 4.3\n" +
                "3. Enter a number: 9.3\n" +
                "4. Enter a number: -2.9\n" +
                "Sum = 16.60\n" +
                "Average = 5.53");

        TextView q = findViewById(R.id.q);
        q.setText((Html.fromHtml(" The use of<font color='#DC8E47'>goto </font>statement may lead to code that is buggy and hard to follow. For example,")));

        TextView sk = findViewById(R.id.sk);
        sk.setText("one:\n" +
                "for (i = 0; i < number; ++i)\n" +
                "{\n" +
                "    test += i;\n" +
                "    goto two;\n" +
                "}\n" +
                "two: \n" +
                "if (test > 5) {\n" +
                "  goto three;\n" +
                "}\n" +
                "... .. ...");
        TextView nep = findViewById(R.id.nep);
        nep.setText(Html.fromHtml("Also, the<font color='#DC8E47'>goto </font>statement allows you to do bad stuff such as jump out of the scope.\n" +
                "\n" +
                "\n" +
                "That being said, <font color='#DC8E47'>goto </font> can be useful sometimes. For example: to break from nested loops."));

    }
}
