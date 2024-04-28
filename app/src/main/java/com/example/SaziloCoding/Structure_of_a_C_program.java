package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Structure_of_a_C_program extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint({"SetTextI18n", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_structure_of_a_c_program);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        // Find the TextView by its ID
        textView = findViewById(R.id.textmy);

        // Set the text for the TextView
        textView.setText("\t#include<stdio.h>\n" + "#include<conio.h>");
////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.my);
        textView.setText("return 0 / getch();\n" + "}");
////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.semi);
        textView.setText(Html.fromHtml("<font color='#1B3364'>The first and foremost component is the inclusion of the Header files in a C program.</font><br> <br> " + "<font color='#1B3364'>A header file is a file with extension .h which contains C function declarations and macro definitions to be shared between several source files.</font><br><br>\n" + "<font color='#1B3364'>Some of C Header files:</font><br><br>" +

                "<font color='#DC8E47'>•stddef.h – </font> Defines several useful types and macros.<br>" + "<font color='#DC8E47'>•stdint.h – </font> Defines exact width integer types.<br>" + "<font color='#DC8E47'>•stdio.h – </font> Defines core input and output functions.<br>" + "<font color='#DC8E47'>•stdlib.h – </font> Defines numeric conversion functions, pseudo-random network generator, memory allocation.<br>" + "<font color='#DC8E47'>•string.h – </font> Defines string handling functions.<br>" + "<font color='#DC8E47>•math.h – </font> Defines common mathematical functions.<br>"));

////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.p);
        textView.setText("int main()\n" + "    {}");

        ////////////////****************************************************************************************************/////////////////

        textView = findViewById(R.id.m);
        textView.setText("The next part of any C program is the variable declaration. It refers to the variables that are to be used in the function. Please note that in the C program, no variable can be used without being declared. Also in a C program, the variables are to be declared before any operation in the function.");

        ////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.b);
        textView.setText("int main()\n" + "{\n" + "    int a;\n" + ".\n" + ".");
        ////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.c);
        textView.setText("int main()\n" + "{\n" + "    int a;\n" + "\n" + "    printf(\"%d\", a);\n" + ".\n" + ".");

        ////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.ca);
        textView.setText("int main()\n" + "{\n" + "    int a;\n" + "\n" + "    printf(\"%d\", a);\n" + "\n" + "    return 0;\n" + "}");

        ////////////////****************************************************************************************************/////////////////
        textView = findViewById(R.id.n2);
        textView.setText("Following is first program in C\n" + "\n" + "#include <stdio.h>\n" + "int main(void)\n" + "{\n" + "    printf(\"CreweraQuiz\");\n" + "    return 0;\n" + "}\n" + "\n" + "Let us analyze the program line by line.\n" + "Line 1: [ #include <stdio.h> ] In a C program, all lines that start with # are processed by preprocessor which is a program invoked by the compiler. In a very basic term, preprocessor takes a C program and produces another C program. The produced program has no lines starting with #, all such lines are processed by the preprocessor. In the above example, preprocessor copies the preprocessed code of stdio.h to our file. The .h files are called header files in C. These header files generally contain declaration of functions. We need stdio.h for the function printf() used in the program.\n" + "\n" + "Line 2 [ int main(void) ] There must to be starting point from where execution of compiled C program begins. In C, the execution typically begins with first line of main(). The void written in brackets indicates that the main doesn’t take any parameter (See this for more details). main() can be written to take parameters also. We will be covering that in future posts.\n" + "The int written before main indicates return type of main(). The value returned by main indicates status of program termination. See this post for more details on return type.\n" + "\n" + "Line 3 and 6: [ { and } ] In C language, a pair of curly brackets define a scope and mainly used in functions and control statements like if, else, loops. All functions must start and end with curly brackets.\n" + "\n" + "Line 4 [ printf(“CreweraQuiz”); ] printf() is a standard library function to print something on standard output. The semicolon at the end of printf indicates line termination. In C, semicolon is always used to indicate end of statement.\n" + "\n" + "Line 5 [ return 0; ] The return statement returns the value from main(). The returned value may be used by operating system to know termination status of your program. The value 0 typically means successful termination.");


    }
}

