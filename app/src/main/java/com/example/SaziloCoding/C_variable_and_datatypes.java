package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class C_variable_and_datatypes extends AppCompatActivity {
  ImageView backbtn;
  TextView textView80;

    @SuppressLint({"MissingInflatedId", "SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cvariable_and_datatypes);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
////**************************************************************************************************************//
        TextView textView = findViewById(R.id.textView80);
        String cppCode = "#include <stdio.h>\n"
                + "int main() {\n"
                + "  short a;\n"
                + "  long b;\n"
                + "  long long c;\n"
                + "  long double d;\n"
                + "  printf(\"size of short = %lu bytes\\n\", sizeof(a));\n"
                + "  printf(\"size of long = %lu bytes\\n\", sizeof(b));\n"
                + "  printf(\"size of long long = %lu bytes\\n\", sizeof(c));\n"
                + "  printf(\"size of long double= %lu bytes\\n\", sizeof(d));\n"
                + "  return 0;\n"
                + "}";
        textView.setText(cppCode);
////**************************************************************************************************************//
        TextView textView0 = findViewById(R.id.textView0);
        textView0.setText("unsigned int x;\nint y;");
////**************************************************************************************************************//

        TextView textView1 = findViewById(R.id.text01);
        textView1.setText("Here, the variable x can hold only zero and positive values because we have used the unsigned modifier.\n\nConsidering the size of int is 4 bytes, variable y can hold values from -231 to 231-1, whereas variable x can hold values from 0 to 232-1.");
////**************************************************************************************************************//

        TextView textView2 = findViewById(R.id.data);
        textView2.setText("•bool Type\n"
                + "•Enumerated type\n"
                + "•Complex types");
////**************************************************************************************************************//



    }
}

