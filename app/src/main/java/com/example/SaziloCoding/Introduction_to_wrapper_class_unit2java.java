package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_to_wrapper_class_unit2java extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_wrapper_class_unit2java);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView s0 = findViewById(R.id.s0);
        s0.setText("The wrapper class in Java provides the mechanism to convert primitive into object and object into primitive.\n" +
                "\n" +
                "Since J2SE 5.0, autoboxing and unboxing feature convert primitives into objects and objects into primitives automatically. The automatic conversion of a primitive into an object is known as autoboxing and vice-versa unboxing.\n" +
                "\n" +
                "The eight classes of the java.lang package are known as wrapper classes in Java. The list of eight wrapper classes are given below:");



        TextView s1 = findViewById(R.id.s1);
        s1.setText(Html.fromHtml("The automatic conversion of a primitive data type into its corresponding wrapper class is known as autoboxing, for example, byte to Byte, char to Character, int to Integer, long to Long, float to Float, boolean to Boolean, double to Double, and short to Short.<br>" +
                "<br>" +
                "Since Java 5, we do not need to use the valueOf() method of wrapper classes to convert the primitive into objects.\n" +
                "<br><br>" +
                "<b>Wrapper class Example: Primitive to Wrapper</b><br>" +
                "<br>" +
                "1.//Autoboxing example of int to Integer  <br>" +
                "2.public static void main(String args[]){  <br>" +
                "3.int a=20;  <br>" +
                "4.Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally <br>" +
                "5.System.out.println(a+\" \"+i+\" \"+j); <br> <br>" +
                "<b>Output:</b><br>" +
                "<br>" +
                "20 20 20"));

        TextView n = findViewById(R.id.n);
        n.setText(Html.fromHtml("The automatic conversion of wrapper type into its corresponding primitive type is known as unboxing. It is the reverse process of autoboxing. Since Java 5, we do not need to use the intValue() method of wrapper classes to convert the wrapper type into primitives.<br>" +
                "<br><br>" +
                "<b>Wrapper class Example: Wrapper to Primitive</b><br><br>" +
                "<br>" +
                "1.//Unboxing example of Integer to int  <br>" +
                "2.public static void main(String args[]){   <br>" +
                "3.Integer a=new Integer(3);    <br>" +
                "4.int j=a;//unboxing, now compiler will write a.intValue() internally   <br>" +
                "5.System.out.println(a+\" \"+i+\" \"+j);  <br><br>" +
                "Output:<br>" +
                "<br>" +
                "3 3 3"));


        TextView c0 = findViewById(R.id.c0);
        c0.setText("1.//wrapper objects and vice-versa  \n" +
                "2.public static void main(String args[]){  \n" +
                "3.short s=20;  \n" +
                "4.long l=40;  \n" +
                "5.double d=60.0D;  \n" +
                "6.boolean b2=true; \n" +
                "7.//Autoboxing: Converting primitives into objects  \n" +
                "8.Short shortobj=s;  \n" +
                "9.Long longobj=l;  \n" +
                "10.Double doubleobj=d;  \n" +
                "11.Boolean boolobj=b2; \n" +
                "12.//Printing objects  \n" +
                "13.System.out.println(\"Byte object: \"+byteobj);  \n" +
                "14.System.out.println(\"Integer object: \"+intobj);  \n" +
                "15.System.out.println(\"Float object: \"+floatobj);  \n" +
                "16.System.out.println(\"Character object: \"+charobj);  \n" +
                "17.byte bytevalue=byteobj;  \n" +
                "18.int intvalue=intobj;  \n" +
                "19.float floatvalue=floatobj;  \n" +
                "20.char charvalue=charobj;  \n" +
                "21.System.out.println(\"---Printing primitive values---\");  \n" +
                "22.System.out.println(\"short value: \"+shortvalue);  \n" +
                "23.System.out.println(\"long value: \"+longvalue);  \n" +
                "24.System.out.println(\"double value: \"+doublevalue);  \n" +
                "25.System.out.println(\"boolean value: \"+boolvalue);  ");

        TextView hk = findViewById(R.id.hk);
        hk.setText("---Printing object values---\n" +
                "Byte object: 10\n" +
                "Short object: 20\n" +
                "Integer object: 30\n" +
                "Long object: 40\n" +
                "Float object: 50.0\n" +
                "Double object: 60.0\n" +
                "Character object: a\n" +
                "Boolean object: true\n" +
                "---Printing primitive values---\n" +
                "byte value: 10\n" +
                "short value: 20\n" +
                "int value: 30\n" +
                "long value: 40\n" +
                "float value: 50.0\n" +
                "double value: 60.0\n" +
                "char value: a\n" +
                "boolean value: true\n");
    }
}