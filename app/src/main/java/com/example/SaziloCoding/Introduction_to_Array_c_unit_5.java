package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_to_Array_c_unit_5 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_array_cunit5);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView q1 = findViewById(R.id.q1);
        q1.setText("An array is defined as the collection of similar type of data items stored at contiguous memory locations. Arrays are the derived data type in C programming language which can store the primitive type of data such as int, char, double, float, etc. It also has the capability to store the collection of derived data types, such as pointers, structure, etc. The array is the simplest data structure where each data element can be randomly accessed by using its index number.\n" +
                "\n" +
                "C array is beneficial if you have to store similar elements. For example, if we want to store the marks of a student in 6 subjects, then we don't need to define different variables for the marks in the different subject. Instead of that, we can define an array which can store the marks in each subject at the contiguous memory locations.\n" +
                "\n" +
                "By using the array, we can access the elements easily. Only a few lines of code are required to access the elements of the array");

        TextView n = findViewById(R.id.n);
        n.setText("•Each element of an array is of same data type and carries the same size, i.e., int = 4 bytes.\n \n" +
                "•Elements of the array are stored at contiguous memory locations where the first element is stored at the smallest memory location.\n \n" +
                "•Elements of the array can be randomly accessed since we can calculate the address of each element of the array with the given base address and the size of the data element.\n");


        TextView na = findViewById(R.id.na);
        na.setText(Html.fromHtml("<b>1) Code Optimization</b>: Less code to the access the data.<br><br>" +
                "<b>2) Ease of traversing</b>: By using the for loop, we can retrieve the elements of an array easily.<br><br>" +

                "<b>3) Ease of sorting</b>: To sort the elements of the array, we need a few lines of code only.<br><br>" +

                "<b>4) Random Access</b>: We can access any element randomly using the array."));

        TextView a = findViewById(R.id.a);
        a.setText(Html.fromHtml("<b>1) Fixed Size</b>: Whatever size, we define at the time of declaration of the array, we can't exceed the limit. So, it doesn't grow the size dynamically like Linked List which we will learn later."));



    }
}