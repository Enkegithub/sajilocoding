package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class While_Loop_C_unit_3 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_while_loop_cunit3);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

     TextView dd = findViewById(R.id.dd);
     dd.setText(Html.fromHtml("The syntax of the   <font color='#DC8E47'> while</font> loop is:"));


     TextView d5 = findViewById(R.id.d5);
     d5.setText("while (testExpression) \n" +
             "{\n" +
             "    // the body of the loop \n" +
             "}");

        TextView bn = findViewById(R.id.bn);
        bn.setText(Html.fromHtml("•The<font color='#DC8E47'> while</font> loop evaluates the test expression inside the parenthesis <font color='#DC8E47'>()</font><br> <br>" +
                "•If the test expression is true, statements inside the body of <font color='#DC8E47'>while</font> loop are executed. Then, the test expression is evaluated again.<br> <br>" +
                "•The process goes on until the test expression is evaluated to false.<br><br>" +
                "•If the test expression is false, the loop terminates (ends).<br>"));

        TextView d7 = findViewById(R.id.d7);
        d7.setText("// Print numbers from 1 to 5\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    int i = 1;\n" +
                "    \n" +
                "    while (i <= 5)\n" +
                "    {\n" +
                "        printf(\"%d\\n\", i);\n" +
                "        ++i;\n" +
                "    }\n" +
                "\n" +
                "    return 0;\n" +
                "}");

TextView g1 = findViewById(R.id.g1);
g1.setText("1\n" +
        "2\n" +
        "3\n" +
        "4\n" +
        "5");


        TextView g2 = findViewById(R.id.g2);
        String text = "1.When i is 1, the test expression i <= 5 is true. Hence, the body of the while loop is executed. This prints 1 on the screen and the value of i is increased to 2.\n \n" +
                "2.Now, i is 2, the test expression i <= 5 is again true. The body of the while loop is executed again. This prints 2 on the screen and the value of i is increased to 3.\n\n" +
                "3.This process goes on until i becomes 6. When i is 6, the test expression i <= 5 will be false and the loop terminates.";

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), text.indexOf("i <= 5"), text.indexOf("i <= 5") + 7, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), text.indexOf("while"), text.indexOf("while") + 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        g2.setText(spannableStringBuilder);





    }
    }
