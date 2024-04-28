package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Do_While_Loop extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_do_while_loop);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

TextView dd = findViewById(R.id.dd);
dd.setText(Html.fromHtml("The <font color='#DC8E47'> do..while</font> loop is similar to the <font color='#DC8E47'> while</font> loop with one important difference. The body of <font color='#DC8E47'> do..while</font> loop is executed at least once. Only then, the test expression is evaluated. <font color='#DC8E47'> do..while</font> is an exit controlled loop."));



   TextView ji = findViewById(R.id.ji);
   ji.setText(Html.fromHtml("The syntax of the <font color='#DC8E47'> do..while</font> loop is:"));


  TextView d5 = findViewById(R.id.d5);
  d5.setText("do\n" +
          "{\n" +
          "   // the body of the loop\n" +
          "}\n" +
          "while (testExpression);");


        TextView bn = findViewById(R.id.bn);
        bn.setText("•The body of do...while loop is executed once. Only then, the test expression is evaluated.\n \n" +
                "•If the test expression is true, the body of the loop is executed again and the test expression is evaluated.\n \n" +
                "•This process goes on until the test expression becomes false.\n \n" +
                "•If the test expression is false, the loop ends.\n");


        TextView d7 = findViewById(R.id.d7);
        d7.setText("// Program to add numbers until the user enters zero\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    double number, sum = 0;\n" +
                "\n" +
                "    // the body of the loop is executed at least once\n" +
                "    do\n" +
                "    {\n" +
                "        printf(\"Enter a number: \");\n" +
                "        scanf(\"%lf\", &number);\n" +
                "        sum += number;\n" +
                "    }\n" +
                "    while(number != 0.0);\n" +
                "\n" +
                "    printf(\"Sum = %.2lf\",sum);\n" +
                "\n" +
                "    return 0;\n" +
                "}");


        TextView g1 = findViewById(R.id.g1);
        g1.setText("Enter a number: 1.5\n" +
                "Enter a number: 2.4\n" +
                "Enter a number: -3.4\n" +
                "Enter a number: 4.2\n" +
                "Enter a number: 0\n" +
                "Sum = 4.70");

    }
}