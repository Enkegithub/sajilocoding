package com.example.SaziloCoding;

import static androidx.core.text.HtmlCompat.*;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class For_Loop_c_unit_3 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_for_loop_cunit3);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ////**************************************************************************************************************//
        TextView dd = findViewById(R.id.dd);
        dd.setText(Html.fromHtml("The syntax of the <font color='#DC8E47'> for</font> loop is:"));


////////////////////************************************************************************************************////////
        TextView d5 = findViewById(R.id.d5);
        d5.setText("for (initializationStatement; testExpression; updateStatement)\n" +
                "{\n" +
                "    // statements inside the body of loop\n" +
                "}");



///////////////////********************************************************************************//////////////////////
        TextView d6 = findViewById(R.id.d6);
        d6.setText("•The initialization statement is executed only once.\n \n" +
                "•Then, the test expression is evaluated. If the test expression is evaluated to false, the for loop is terminated.\n \n" +
                "•However, if the test expression is evaluated to true, statements inside the body of for loop are executed, and the update expression is updated.\n \n" +
                "•Again the test expression is evaluated.\n ");

///////////////////********************************************************************************//////////////////////
        TextView d7 = findViewById(R.id.d7);
        d7.setText("// Print numbers from 1 to 10\n" +
                "#include <stdio.h>\n" +
                "\n" +
                "int main() {\n" +
                "  int i;\n" +
                "\n" +
                "  for (i = 1; i < 11; ++i)\n" +
                "  {\n" +
                "    printf(\"%d \", i);\n" +
                "  }\n" +
                "  return 0;\n" +
                "}");
///////////////////********************************************************************************//////////////////////
        TextView d8 = findViewById(R.id.d8);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            d8.setText(fromHtml("1. i is initialized to 1.<br/><br/>" +
                    "2. The test expression <font color='#DC8E47'> i &lt; 11</font> is evaluated. Since 1 is less than 11, it's true, and the body of <font color='#DC8E47'>for</font> loop is executed. This will print 1 (the value of i) on the screen.<br/><br/>" +
                    "3. The update statement <font color='#DC8E47'>++i</font> is executed. Now, the value of i will be 2. Again, the test expression is evaluated to true, and the body of the <font color='#DC8E47'>for</font> loop is executed. This will print 2 (the value of i) on the screen.<br/> <br/>" +
                    "4. Again, the update statement <font color='#DC8E47'>++i</font> is executed, and the test expression <font color='#DC8E47'>i &lt; 11</font> is evaluated. This process goes on until i becomes 11.<br/> <br/>" +
                    "5. When i becomes 11, <font color='#DC8E47'>i &lt; 11</font> will be false, and the <font color='#DC8E47'>for</font> loop terminates.", FROM_HTML_MODE_LEGACY));
        } else {
            d8.setText(Html.fromHtml("1. i is initialized to 1.<br/><br/>" +
                    "2. The test expression <font color='#DC8E47'> i &lt; 11</font> is evaluated. Since 1 is less than 11, it's true, and the body of <font color='#DC8E47'>for</font> loop is executed. This will print 1 (the value of i) on the screen.<br/><br/>" +
                    "3. The update statement <font color='#DC8E47'>++i</font> is executed. Now, the value of i will be 2. Again, the test expression is evaluated to true, and the body of the <font color='#DC8E47'>for</font> loop is executed. This will print 2 (the value of i) on the screen.<br/> <br/>" +
                    "4. Again, the update statement <font color='#DC8E47'>++i</font> is executed, and the test expression <font color='#DC8E47'>i &lt; 11</font> is evaluated. This process goes on until i becomes 11.<br/> <br/>" +
                    "5. When i becomes 11, <font color='#DC8E47'>i &lt; 11</font> will be false, and the <font color='#DC8E47'>for</font> loop terminates."));
        }



        ///////////////////********************************************************************************//////////////////////
        TextView d9 = findViewById(R.id.d9);
        d9.setText("// Program to calculate the sum of first n natural numbers\n" +
                "// Positive integers 1,2,3...n are known as natural numbers\n" +
                "\n" +
                "#include <stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    int num, count, sum = 0;\n" +
                "\n" +
                "    printf(\"Enter a positive integer: \");\n" +
                "    scanf(\"%d\", &num);\n" +
                "\n" +
                "    // for loop terminates when num is less than count\n" +
                "    for(count = 1; count <= num; ++count)\n" +
                "    {\n" +
                "        sum += count;\n" +
                "    }\n" +
                "\n" +
                "    printf(\"Sum = %d\", sum);\n" +
                "\n" +
                "    return 0;\n" +
                "}");

        ////////////////********************************************************************************************///////////
        TextView d = findViewById(R.id.d);
        d.setText("Enter a positive integer: 10\n" +
                "Sum = 55");

        ////////////////********************************************************************************************///////////
        TextView d0 = findViewById(R.id.d0);
        String text = "The value entered by the user is stored in the variable num. Suppose, the user entered 10.\n" +
                "\n" +
                "The count is initialized to 1 and the test expression is evaluated. Since the test expression count<=num < 11 (1 less than or equal to 10) is true, the body of for loop is executed and the value of sum will equal to 1.\n" +
                "\n" +
                "Then, the update statement ++count is executed and the count will equal to 2. Again, the test expression is evaluated. Since 2 is also less than 10, the test expression is evaluated to true and the body of for loop is executed. Now, the sum will equal 3.\n" +
                "\n" +
                "This process goes on and the sum is calculated until the count reaches 11.\n" +
                "\n" +
                "When the count is 11, the test expression is evaluated to 0 (false), and the loop terminates.\n" +
                "\n" +
                "Then, the value of sum is printed on the screen.";

        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), text.indexOf("count<=num < 11"), text.indexOf("count<=num < 11") + 14, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), text.indexOf("++count"), text.indexOf("++count") + 9, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor("#DC8E47")), text.indexOf("sum"), text.indexOf("sum") + 3, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        d0.setText(spannableStringBuilder);







    }
}