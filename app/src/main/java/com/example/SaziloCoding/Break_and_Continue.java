package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.snapshot.Index;

public class Break_and_Continue extends AppCompatActivity {
    TextView textView;
  ImageView backbtn;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_break_and_continue);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView y = findViewById(R.id.y);
        y.setText(Html.fromHtml("The break statement is almost always used with <font color='#DC8E47'> if...else</font> statement inside the loop."));


        TextView d7 = findViewById(R.id.d7);
        d7.setText("// Program to calculate the sum of numbers (10 numbers max)\n" +
                "// If the user enters a negative number, the loop terminates\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "   int i;\n" +
                "   double number, sum = 0.0;\n" +
                "\n" +
                "   for (i = 1; i <= 10; ++i) {\n" +
                "      printf(\"Enter n%d: \", i);\n" +
                "      scanf(\"%lf\", &number);\n" +
                "\n" +
                "      // if the user enters a negative number, break the loop\n" +
                "      if (number < 0.0) {\n" +
                "         break;\n" +
                "      }\n" +
                "\n" +
                "      sum += number; // sum = sum + number;\n" +
                "   }\n" +
                "\n" +
                "   printf(\"Sum = %.2lf\", sum);\n" +
                "\n" +
                "   return 0;\n" +
                "}");

        TextView g1 = findViewById(R.id.g1);
        g1.setText("Enter n1: 2.4\n" +
                "Enter n2: 4.5\n" +
                "Enter n3: 3.4\n" +
                "Enter n4: -3\n" +
                "Sum = 10.30");


        TextView b1 = findViewById(R.id.b1);
        String text = "This program calculates the sum of a maximum of 10 numbers. Why a maximum of 10 numbers? It's because if the user enters a negative number, the break statement is executed. This will end the for loop, and the sum is displayed.\n\n" +
                "In C, break is also used with the switch statement. This will be discussed in the next tutorial.\n\n";

        SpannableString spannableString = new SpannableString(text);
        int breakIndex = text.indexOf("break");
        while (breakIndex >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), breakIndex, breakIndex + 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            breakIndex = text.indexOf("break", breakIndex + 5);
        }

        int forIndex = text.indexOf("for");
        while (forIndex >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), forIndex, forIndex + 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            forIndex = text.indexOf("for", forIndex + 3);
        }

        int switchIndex = text.indexOf("switch");
        while (switchIndex >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), switchIndex, switchIndex + 6, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            switchIndex = text.indexOf("switch", switchIndex + 6);
        }


        b1.setText(spannableString);


        TextView g2 = findViewById(R.id.g2);
        g2.setText(Html.fromHtml("The <font color='#DC8E47'>continue </font> statement is almost always used with the <font color='#DC8E47'> if...else</font>statement."));


        TextView g3 = findViewById(R.id.g3);
        g3.setText("// Program to calculate the sum of numbers (10 numbers max)\n" +
                "// If the user enters a negative number, it's not added to the result\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main() {\n" +
                "   int i;\n" +
                "   double number, sum = 0.0;\n" +
                "\n" +
                "   for (i = 1; i <= 10; ++i) {\n" +
                "      printf(\"Enter a n%d: \", i);\n" +
                "      scanf(\"%lf\", &number);\n" +
                "\n" +
                "      if (number < 0.0) {\n" +
                "         continue;\n" +
                "      }\n" +
                "\n" +
                "      sum += number; // sum = sum + number;\n" +
                "   }\n" +
                "\n" +
                "   printf(\"Sum = %.2lf\", sum);\n" +
                "\n" +
                "   return 0;\n" +
                "}");

        TextView g4 = findViewById(R.id.g4);
        g4.setText("Enter n1: 1.1\n" +
                "Enter n2: 2.2\n" +
                "Enter n3: 5.5\n" +
                "Enter n4: 4.4\n" +
                "Enter n5: -3.4\n" +
                "Enter n6: -45.5\n" +
                "Enter n7: 34.5\n" +
                "Enter n8: -4.2\n" +
                "Enter n9: -1000\n" +
                "Enter n10: 12\n" +
                "Sum = 59.70");

        TextView g5 = findViewById(R.id.g5);
        g5.setText(Html.fromHtml("In this program, when the user enters a positive number, the sum is calculated using  <font color='#DC8E47'>sum += number; </font> statement.<br><br>" +
                "When the user enters a negative number, the  <font color='#DC8E47'>continue</font> statement is executed and it skips the negative number from the calculation."));


        TextView g6 = findViewById(R.id.g6);
        g6.setText(Html.fromHtml("The <font color='#DC8E47'>continue</font> statement skips the current iteration of the loop and continues with the next iteration. Its syntax is:"));


    }
}

