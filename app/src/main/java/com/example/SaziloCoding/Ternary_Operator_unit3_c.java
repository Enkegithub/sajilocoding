package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Ternary_Operator_unit3_c extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternary_operator_unit3_c);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        ////**************************************************************************************************************//
        TextView kj = findViewById(R.id.kj);
        kj.setText("Programmers use the ternary operator for decision making in place of longer if and else conditional statements.\n" +
                "\n" +
                "The ternary operator take three arguments:\n" +
                "\n" +
                "1.The first is a comparison argument\n" +
                "2.The second is the result upon a true comparison\n" +
                "3.The third is the result upon a false comparison\n");
        ////**************************************************************************************************************//
        TextView text5 = findViewById(R.id.text5);
        text5.setText("int a = 10, b = 20, c;\n" +
                "\n" +
                "if (a < b) {\n" +
                "    c = a;\n" +
                "}\n" +
                "else {\n" +
                "    c = b;\n" +
                "}\n" +
                "\n" +
                "printf(\"%d\", c);");

        TextView da = findViewById(R.id.da);
        da.setText(Html.fromHtml("<font color='#DC8E47'>condition ? value_if_true : value_if_false\n </font>"));


        TextView db = findViewById(R.id.db);
        db.setText(Html.fromHtml("The statement evaluates to <font color='#DC8E47'>value_if_true</font> if<font color='#DC8E47'> condition</font> is met, and <font color='#DC8E47'>value_if_false</font>  otherwise.\n"));

        TextView ds = findViewById(R.id.ds);
        ds.setText(Html.fromHtml("Here’s the above example rewritten to use the ternary operator:"));


        ////**************************************************************************************************************//
        TextView hk = findViewById(R.id.hk);
        hk.setText("int a = 10, b = 20, c;\n" +
                "\n" +
                "c = (a < b) ? a : b;\n" +
                "\n" +
                "printf(\"%d\", c);");

        TextView y = findViewById(R.id.y);
        y.setText(Html.fromHtml("<font color='#DC8E47'>c</font> is set equal to <font color='#DC8E47'>a</font>, because the condition <font color='#DC8E47'>a < b</font> was true."));


        TextView u = findViewById(R.id.u);
        u.setText(Html.fromHtml("Remember that the arguments<font color='#DC8E47'> value_if_true</font> and <font color='#DC8E47'> value_if_false</font> must be of the same type, and they must be simple expressions rather than full statements."));

        TextView p = findViewById(R.id.p);
        p.setText(Html.fromHtml("Ternary operators can be nested just like if-else statements. Consider the following code:"));

        TextView maka = findViewById(R.id.maka);
        maka.setText("int a = 1, b = 2, ans;\n" +
                "if (a == 1) {\n" +
                "    if (b == 2) {\n" +
                "        ans = 3;\n" +
                "    } else {\n" +
                "        ans = 5;\n" +
                "    }\n" +
                "} else {\n" +
                "    ans = 0;\n" +
                "}\n" +
                "printf (\"%d\\n\", ans);");

        TextView ha = findViewById(R.id.ha);
        ha.setText("int a = 1, b = 2, ans;\n" +
                "ans = (a == 1 ? (b == 2 ? 3 : 5) : 0);\n" +
                "printf (\"%d\\n\", ans);");

    }
}
