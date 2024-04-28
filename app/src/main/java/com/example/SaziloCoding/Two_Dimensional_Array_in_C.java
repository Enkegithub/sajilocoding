package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Two_Dimensional_Array_in_C extends AppCompatActivity {
    TextView textView;
 ImageView backbtn;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_dimensional_array_in_c);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView dd = findViewById(R.id.dd);
        dd.setText("The two-dimensional array can be defined as an array of arrays. The 2D array is organized as matrices which can be represented as the collection of rows and columns. However, 2D arrays are created to implement a relational database lookalike data structure. It provides ease of holding the bulk of data at once which can be passed to any number of functions wherever required.");


        TextView ji = findViewById(R.id.ji);
        ji.setText("The syntax to declare the 2D array is given below.\n" +
                "\n" +
                "data_type array_name[rows][columns];  \n" +
                "\n" +
                "Consider the following example.\n" +
                "\n" +
                "int twodimen[4][3];  \n" +
                "Here, 4 is the number of rows, and 3 is the number of columns.");

        TextView j = findViewById(R.id.j);
        j.setText("In the 1D array, we don't need to specify the size of the array if the declaration and initialization are being done simultaneously. However, this will not work with 2D arrays. We will have to define at least the second dimension of the array. The two-dimensional array can be declared and defined in the following way.\n" +
                "\n" +
                "int arr[4][3]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};  ");

        TextView d5 = findViewById(R.id.d5);
        d5.setText("#include<stdio.h>\n" +
                "\n" +
                "int main()\n" +
                "{      \n" +
                "     int i=0,j=0;    \n" +
                "     int arr[4][3]={{1,2,3},{2,3,4},{3,4,5},{4,5,6}};     \n" +
                "//traversing 2D array    \n" +
                "     for(i=0;i<4;i++)\n" +
                "     {    \n" +
                "         for(j=0;j<3;j++)\n" +
                "         {    \n" +
                "             printf(\"arr[%d] [%d] = %d \\n\",i,j,arr[i][j]);    \n" +
                "         }//end of j    \n" +
                "     }//end of i    \n" +
                "return 0;  \n" +
                "}    ");

        TextView d = findViewById(R.id.d);
        d.setText("arr[0][0] = 1\n" +
                "arr[0][1] = 2\n" +
                "arr[0][2] = 3\n" +
                "arr[1][0] = 2\n" +
                "arr[1][1] = 3\n" +
                "arr[1][2] = 4\n" +
                "arr[2][0] = 3\n" +
                "arr[2][1] = 4\n" +
                "arr[2][2] = 5\n" +
                "arr[3][0] = 4\n" +
                "arr[3][1] = 5\n" +
                "arr[3][2] = 6");


        TextView d7 = findViewById(R.id.d7);
        d7.setText("#include <stdio.h>    \n" +
                "void main ()    \n" +
                "{    \n" +
                "    int arr[3][3],i,j;     \n" +
                "    for (i=0;i<3;i++)    \n" +
                "    {    \n" +
                "        for (j=0;j<3;j++)    \n" +
                "        {    \n" +
                "            printf(\"Enter a[%d][%d]: \",i,j);                \n" +
                "            scanf(\"%d\",&arr[i][j]);    \n" +
                "        }    \n" +
                "    }    \n" +
                "    printf(\"\\n printing the elements ....\\n\");     \n" +
                "    for(i=0;i<3;i++)    \n" +
                "    {    \n" +
                "        printf(\"\\n\");    \n" +
                "        for (j=0;j<3;j++)    \n" +
                "        {    \n" +
                "            printf(\"%d\\t\",arr[i][j]);    \n" +
                "        }    \n" +
                "    }    \n" +
                "}  ");

        TextView g1 = findViewById(R.id.g1);
        g1.setText("Enter a[0][0]: 56   \n" +
                "Enter a[0][1]: 10   \n" +
                "Enter a[0][2]: 30  \n" +
                "Enter a[1][0]: 34  \n" +
                "Enter a[1][1]: 21 \n" +
                "Enter a[1][2]: 34    \n" +
                "\n" +
                "Enter a[2][0]: 45\n" +
                "Enter a[2][1]: 56\n" +
                "Enter a[2][2]: 78   \n" +
                "\n" +
                " printing the elements .... \n" +
                " \n" +
                "56      10      30  \n" +
                "34      21      34  \n" +
                "45      56      78");

    }


}