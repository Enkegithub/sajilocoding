package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Examples_c_arry extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examples_carry);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView bh = findViewById(R.id.bh);
        bh.setText("#include<stdio.h> \n" +
                "void main ()    \n" +
                "{    \n" +
                "    int i, j,temp;     \n" +
                "    int a[10] = { 10, 9, 7, 101, 23, 44, 12, 78, 34, 23};     \n" +
                "    for(i = 0; i<10; i++)    \n" +
                "    {    \n" +
                "        for(j = i+1; j<10; j++)    \n" +
                "        {    \n" +
                "            if(a[j] > a[i])    \n" +
                "            {    \n" +
                "                temp = a[i];    \n" +
                "                a[i] = a[j];    \n" +
                "                a[j] = temp;     \n" +
                "            }     \n" +
                "        }     \n" +
                "    }     \n" +
                "    printf(\"Printing Sorted Element List ...\\n\");    \n" +
                "    for(i = 0; i<10; i++)    \n" +
                "    {    \n" +
                "        printf(\"%d\\n\",a[i]);    \n" +
                "    }    \n" +
                "}");


        TextView bn = findViewById(R.id.bn);
        bn.setText("\n" +
                "#include<stdio.h>\n" +
                "void main ()  \n" +
                "{  \n" +
                "    int arr[100],i,n,largest,sec_largest;  \n" +
                "    printf(\"Enter the size of the array?\");  \n" +
                "    scanf(\"%d\",&n);  \n" +
                "    printf(\"Enter the elements of the array?\");  \n" +
                "    for(i = 0; i<n; i++)  \n" +
                "    {  \n" +
                "        scanf(\"%d\",&arr[i]);  \n" +
                "    }  \n" +
                "    largest = arr[0];  \n" +
                "    sec_largest = arr[1];  \n" +
                "    for(i=0;i<n;i++)  \n" +
                "    {  \n" +
                "        if(arr[i]>largest)  \n" +
                "        {  \n" +
                "            sec_largest = largest;  \n" +
                "            largest = arr[i];  \n" +
                "        }  \n" +
                "        else if (arr[i]>sec_largest && arr[i]!=largest)  \n" +
                "        {  \n" +
                "            sec_largest=arr[i];  \n" +
                "        }  \n" +
                "    }  \n" +
                "    printf(\"largest = %d, second largest = %d\",largest,sec_largest);  \n" +
                "      \n" +
                "}  ");

    }
}