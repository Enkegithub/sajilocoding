package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Multi_Dimensional_Array extends AppCompatActivity {
ImageView backbtn;
TextView textView;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_dimensional_array);
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView dd = findViewById(R.id.dd);
        dd.setText("In C, we can define multidimensional arrays in simple words as array of arrays. Data in multidimensional arrays are stored in tabular form (in row major order).\n" +
                "\n" +
                "General form of declaring N-dimensional arrays:");


        TextView j5 = findViewById(R.id.j5);
        j5.setText("data_type  array_name[size1][size2]....[sizeN];\n" +
                "\n" +
                "data_type: Type of data to be stored in the array. \n" +
                "           Here data_type is valid C data type\n" +
                "array_name: Name of the array\n" +
                "size1, size2,... ,sizeN: Sizes of the dimensions.");

        TextView d5 = findViewById(R.id.d5);
        d5.setText("int x[2][3][4] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, \n" +
                "                 11, 12, 13, 14, 15, 16, 17, 18, 19,\n" +
                "                 20, 21, 22, 23};");


        TextView d = findViewById(R.id.d);
        d.setText("int x[2][3][4] = \n" +
                " { \n" +
                "   { {0,1,2,3}, {4,5,6,7}, {8,9,10,11} },\n" +
                "   { {12,13,14,15}, {16,17,18,19}, {20,21,22,23} }\n" +
                " };");

        TextView d7 = findViewById(R.id.d7);
        d7.setText("#include<stdio.h>\n" +
                "int main()\n" +
                "{\n" +
                "    // initializing the 3-dimensional array\n" +
                "    int x[2][3][2] =\n" +
                "    {\n" +
                "        { {0,1}, {2,3}, {4,5} },\n" +
                "        { {6,7}, {8,9}, {10,11} }\n" +
                "    };\n" +
                "    // output each element's value\n" +
                "    for (int i = 0; i < 2; ++i)\n" +
                "    {\n" +
                "        for (int j = 0; j < 3; ++j)\n" +
                "        {\n" +
                "            for (int k = 0; k < 2; ++k)\n" +
                "            {\n" +
                "                printf(\"Element at x[%d][%d][%d] = %d\",i,j,k ,x[i][j][k]);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    return 0;\n" +
                "}");



        TextView g1 = findViewById(R.id.g1);
        g1.setText("Element at x[0][0][0] = 0\n" +
                "Element at x[0][0][1] = 1\n" +
                "Element at x[0][1][0] = 2\n" +
                "Element at x[0][1][1] = 3\n" +
                "Element at x[0][2][0] = 4\n" +
                "Element at x[0][2][1] = 5\n" +
                "Element at x[1][0][0] = 6\n" +
                "Element at x[1][0][1] = 7\n" +
                "Element at x[1][1][0] = 8\n" +
                "Element at x[1][1][1] = 9\n" +
                "Element at x[1][2][0] = 10\n" +
                "Element at x[1][2][1] = 11");





    }
}