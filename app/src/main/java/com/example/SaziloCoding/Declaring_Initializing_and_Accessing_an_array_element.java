package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Declaring_Initializing_and_Accessing_an_array_element extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_declaring_initializing_and_accessing_an_array_element);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView k = findViewById(R.id.k);
        k.setText(Html.fromHtml("After an array is declared it must be initialized. Otherwise, it will contain <b> garbage</b> value (any random value). An array can be initialized at either <b>compile time</b> or at <b> runtime</b>."));

        TextView d7 = findViewById(R.id.d7);
        d7.setText("type array_name[size] = { list_of_values };\n" +
                "\n" +
                "//integer array initialization\n" +
                "int marks[4]={ 67, 87, 56, 77 };\n" +
                "\n" +
                "//float array initialization\n" +
                "float area[3]={ 23.4, 6.8, 5.5 };\n" +
                "\n" +
                "//character array initialization\n" +
                "char name[12]={ 'T', 'u', 't', 'o', 'r', 'i', 'a', 'l', 'i', 'n', 'k', '\\0' };");


        TextView d8 = findViewById(R.id.d8);
        d8.setText("//Number of initializers less than size of array\n" +
                "int subject[10]={ 67, 87, 56, 77, 59 };\n");


        TextView d9 = findViewById(R.id.d9);
        d9.setText("//Compile_time_error\n" +
                "int subject[2]={ 67, 87, 56, 77, 59 };");

        TextView g1 = findViewById(R.id.g1);
        g1.setText("//Write a Program to initialize array at compile time.\n" +
                "#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "    int i;\n" +
                "    int arr[]={2, 3, 4};    //Compile time array initialization\n" +
                "    for(i=0; i<3; i++) {\n" +
                "        printf(\"%d \",arr[i]);\n" +
                "    }\n" +
                "    getch();\n" +
                "}");

        TextView g9 = findViewById(R.id.g9);
        g9.setText("//Write a Program to initialize array at run time.\n" +
                "#include<stdio.h>\n" +
                "#include<conio.h>\n" +
                "void main()\n" +
                "{\n" +
                "    int arr[4];\n" +
                "    int i, j;\n" +
                "    printf(\"Enter array element:\");\n" +
                "    for(i=0; i<4; i++)\n" +
                "    {\n" +
                "        scanf(\"%d\",&arr[i]);    //Run time array initialization\n" +
                "    }\n" +
                "    printf(\"Value in Array:\");\n" +
                "    for(j=0; j<4; j++)\n" +
                "    {\n" +
                "        printf(\"%d \\n\",arr[j]);\n" +
                "    }\n" +
                "    getch();\n" +
                "}");


        TextView g10 = findViewById(R.id.g10);
        g10.setText("Enter array element:\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50\n" +
                "Value in Array:\n" +
                "20\n" +
                "30\n" +
                "40\n" +
                "50");

        TextView w1 = findViewById(R.id.w1);
        w1.setText("\n" +
                "#include <stdio.h>\n" +
                " \n" +
                "int main()\n" +
                "{\n" +
                "    int arr[5];\n" +
                "    arr[0] = 5;\n" +
                "    arr[2] = -10;\n" +
                "    arr[3 / 2] = 2; // this is same as arr[1] = 2\n" +
                "    arr[3] = arr[0];\n" +
                " \n" +
                "    printf(\"%d %d %d %d\", arr[0],\n" +
                "           arr[1], arr[2], arr[3]);\n" +
                " \n" +
                "    return 0;\n" +
                "}");

    }
}