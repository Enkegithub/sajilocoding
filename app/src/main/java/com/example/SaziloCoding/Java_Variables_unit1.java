package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Java_Variables_unit1 extends AppCompatActivity {
TextView textView;
ImageView backbtn;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_variables_unit1);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView dd = findViewById(R.id.dd);
        dd.setText("A variable is a container which holds the value while the Java program is executed. A variable is assigned with a data type.\n" +
                "\n" +
                "Variable is a name of memory location. There are three types of variables in java: local, instance and static.\n" +
                "\n" +
                "There are two types of data types in Java: primitive and non-primitive.");

        TextView ji = findViewById(R.id.ji);
        ji.setText(Html.fromHtml("<b>Variable</b> is name of reserved area allocated in memory. In other words, it is a name of memory location. It is a combination of \"vary + able\" that means its value can be changed."));


        TextView j = findViewById(R.id.j);
        j.setText("There are three types of variables in Java:\n" +
                "\n" +
                "•local variable\n" +
                "•instance variable\n" +
                "•static variable");

        TextView j4 = findViewById(R.id.j4);
        j4.setText("A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists.\n" +
                "\n" +
                "A local variable cannot be defined with \"static\" keyword.");

        TextView j5 = findViewById(R.id.j5);
        j5.setText("A variable declared inside the class but outside the body of the method, is called instance variable. It is not declared as static.\n" +
                "\n" +
                "It is called instance variable because its value is instance specific and is not shared among instances.");

        TextView d5 =findViewById(R.id.d5);
        d5.setText("class A{\n" +
                "\n" +
                "            int data=50;//instance variable  \n" +
                "\n" +
                "            static int m=100;//static variable  \n" +
                "\n" +
                "            void method(){  \n" +
                "\n" +
                "            int n=90;//local variable  \n" +
                "\n" +
                "} ");

        TextView j6 = findViewById(R.id.j6);
        j6.setText("Widening conversion takes place when two data types are automatically converted. This happens when:\n" +
                "\n" +
                "•The two data types are compatible.\n\n" +
                "•When we assign value of a smaller data type to a bigger data type.\n\n" +
                "For Example, in java the numeric data types are compatible with each other but no automatic conversion is supported from numeric type to char or boolean. Also, char and boolean are not compatible with each other.");
        TextView d = findViewById(R.id.d);
        d.setText("\n" +
                "class Test\n" +
                "\n" +
                "{\n" +
                "\n" +
                "    public static void main(String[] args)\n" +
                "\n" +
                "    {\n" +
                "\n" +
                "        int i = 100; \n" +
                "\n" +
                "        // automatic type conversion\n" +
                "\n" +
                "        long l = i;\n" +
                "\n" +
                "        // automatic type conversion\n" +
                "\n" +
                "        float f = l; \n" +
                "\n" +
                "        System.out.println(\"Int value \"+i);\n" +
                "\n" +
                "        System.out.println(\"Long value \"+l);\n" +
                "\n" +
                "        System.out.println(\"Float value \"+f); \n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Output: \n" +
                "\n" +
                "Int value 100\n" +
                "\n" +
                "Long value 100\n" +
                "\n" +
                "Float value 100.0");


        TextView d7 = findViewById(R.id.d7);
        d7.setText("class Test\n" +
                "\n" +
                "{\n" +
                "\n" +
                "    public static void main(String[] args)\n" +
                "\n" +
                "    {\n" +
                "\n" +
                "        int i = 100;\n" +
                "\n" +
                "        // automatic type conversion\n" +
                "\n" +
                "        long l = i; \n" +
                "\n" +
                "        // automatic type conversion\n" +
                "\n" +
                "        float f = l; \n" +
                "\n" +
                "        System.out.println(\"Int value \"+i);\n" +
                "\n" +
                "        System.out.println(\"Long value \"+l);\n" +
                "\n" +
                "        System.out.println(\"Float value \"+f); \n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Int value 100\n" +
                "\n" +
                "Long value 100\n" +
                "\n" +
                "Float value 100.0");

        TextView d8 =findViewById(R.id.d8);
        d8.setText("If we want to assign a value of larger data type to a smaller data type we perform explicit type casting or narrowing.\n" +
                "\n" +
                "•This is useful for incompatible data types where automatic conversion cannot be done.\n\n" +
                "•Here, target-type specifies the desired type to convert the specified value to.\n\n" +
                "char and number are not compatible with each other. Let’s see when we try to convert one into other.");

        TextView g1 = findViewById(R.id.g1);
        g1.setText("\n" +
                "//Java program to illustrate incompatible data \n" +
                "\n" +
                "// type for explicit type conversion\n" +
                "\n" +
                "public class Test\n" +
                "\n" +
                "{\n" +
                "\n" +
                "  public static void main(String[] argv)\n" +
                "\n" +
                "  {\n" +
                "\n" +
                "    char ch = 'c';\n" +
                "\n" +
                "    int num = 88;\n" +
                "\n" +
                "    ch = num;\n" +
                "\n" +
                "  }\n" +
                "\n" +
                "}");

        TextView g2 = findViewById(R.id.g2);
        g2.setText("Example:\n" +
                "\n" +
                "//Java program to illustrate explicit type conversion\n" +
                "\n" +
                "class Test\n" +
                "\n" +
                "{\n" +
                "\n" +
                "                public static void main(String[] args)\n" +
                "\n" +
                "                {\n" +
                "\n" +
                "             double d = 100.04;\n" +
                "\n" +
                "              //explicit type casting\n" +
                "\n" +
                "              long l = (long)d;\n" +
                "\n" +
                "              //explicit type casting\n" +
                "\n" +
                "              int i = (int)l;\n" +
                "\n" +
                "           System.out.println(\"Double value \"+d);\n" +
                "\n" +
                "           //fractional part lost\n" +
                "\n" +
                "            System.out.println(\"Long value \"+l);\n" +
                "\n" +
                "            //fractional part lost\n" +
                "\n" +
                "           System.out.println(\"Int value \"+i);\n" +
                "\n" +
                "                }\n" +
                "\n" +
                "}\n" +
                "\n" +
                "Double value 100.04\n" +
                "\n" +
                "Long value 100\n" +
                "\n" +
                "Int value 100");

        TextView d9 = findViewById(R.id.d9);
        d9.setText("While evaluating expressions, the intermediate value may exceed the range of operands and hence the expression value will be promoted. Some conditions for type promotion are:\n" +
                "\n" +
                "1. Java automatically promotes each byte, short, or char operand to int when evaluating an expression.\n" +
                "\n" +
                "2.  If one operand is a long, float or double the whole expression is promoted to long, float or double respectively.");
    }
}