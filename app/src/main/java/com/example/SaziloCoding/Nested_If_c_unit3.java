package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Nested_If_c_unit3 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nested_if_c_unit3);
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        ////**************************************************************************************************************//
        TextView text5 = findViewById(R.id.text5);
        text5.setText("if( expression )\n" +
                "{ \n" +
                "    statement-block 3;\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "    if( expression1 ) \n" +
                "    { \n" +
                "        statement-block1; \n" +
                "    } \n" +
                "    else \n" +
                "    { \n" +
                "        statement-block 2; \n" +
                "    }\n" +
                "}\n" +
                "\n");
        ////**************************************************************************************************************//
        TextView hk = findViewById(R.id.hk);
        hk.setText("#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main( )\n" +
                "{ \n" +
                " int a,b,c;\n" +
                " clrscr();\n" +
                " printf(\"Please Enter 3 number\");\n" +
                " scanf(\"%d %d %d\",&a,&b,&c);\n" +
                " if(a>b)\n" +
                " {\n" +
                "      if(a>c)\n" +
                "      {\n" +
                "                        printf(\"a is greatest\");\n" +
                "      }\n" +
                "      else \n" +
                "      {\n" +
                "                        printf(\"c is greatest\");\n" +
                "      }\n" +
                " }\n" +
                " else\n" +
                " {\n" +
                "       if(b>c)\n" +
                "       {\n" +
                "             printf(\"b is greatest\");\n" +
                "       }\n" +
                "       else\n" +
                "       {\n" +
                "            printf(\"c is greatest\");\n" +
                "       }\n" +
                " }\n" +
                " getch();\n" +
                "} ");
                ////**************************************************************************************************************//
                TextView sk = findViewById(R.id.sk);
        sk.setText("Please Enter 3 number: 12 23 45 \n" +
                "c is greatest");

    }
}