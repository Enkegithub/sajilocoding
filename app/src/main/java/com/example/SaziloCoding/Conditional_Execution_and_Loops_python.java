package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Conditional_Execution_and_Loops_python extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conditional_execution_and_loops_python);

        backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView t1 = findViewById(R.id.t1);
        t1.setText("Conditional execution and loops are fundamental concepts in programming, and they are essential for building complex and robust programs. In Python, these concepts are implemented using a few different keywords and syntax structures.\n" +
                "\n" +
                "Conditional execution is the process of running certain code only if a specific condition is true. In Python, this is typically achieved using the if statement. The syntax for an if statement is as follows:");


        TextView text5 = findViewById(R.id.text5);
        text5.setText("if condition:\n" +
                "    # code to execute if the condition is true\n");

        TextView t3 = findViewById(R.id.t3);
        t3.setText("The condition can be any expression that evaluates to a boolean value (True or False). If the condition is true, then the code inside the if block is executed. If the condition is false, then the code inside the block is skipped.\n" +
                "\n" +
                "In addition to if, Python also has several other conditional statements, including elif and else. These allow for more complex conditional logic. Here's an example:");

        TextView text7 = findViewById(R.id.text7);
        text7.setText("x = 10\n" +
                "\n" +
                "if x > 10:\n" +
                "    print(\"x is greater than 10\")\n" +
                "elif x < 10:\n" +
                "    print(\"x is less than 10\")\n" +
                "else:\n" +
                "    print(\"x is equal to 10\")\n");
        TextView t4 = findViewById(R.id.t4);
        t4.setText("In this example, if x is greater than 10, the first print statement is executed. If x is less than 10, the second print statement is executed. If x is exactly equal to 10, then the third print statement is executed.\n" +
                "\n" +
                "Loops, on the other hand, allow us to execute a block of code repeatedly. In Python, there are two types of loops: for loops and while loops.\n" +
                "\n" +
                "A for loop is used to iterate over a sequence of items. The syntax is as follows:");

        TextView text8 = findViewById(R.id.text8);
        text8.setText("for item in sequence:\n" +
                "    # code to execute for each item in the sequence\n");



        TextView r0 = findViewById(R.id.r0);
        r0.setText("The sequence can be any iterable object, such as a list or a tuple. The item variable takes on the value of each item in the sequence in turn, and the code inside the loop block is executed for each value of item.\n" +
                "\n" +
                "Here's an example:");


        TextView n0 = findViewById(R.id.n0);
        n0.setText("fruits = [\"apple\", \"banana\", \"cherry\"]\n" +
                "\n" +
                "for fruit in fruits:\n" +
                "    print(fruit)\n");


        TextView r2 = findViewById(R.id.r2);
        r2.setText("In this example, the loop iterates over the fruits list, and the fruit variable takes on the value of each item in turn. The print statement inside the loop block is executed for each value of fruit, so the output is:");


        TextView n2 = findViewById(R.id.n2);
        n2.setText("apple\n" +
                "banana\n" +
                "cherry\napple\n" +
                "banana\n" +
                "cherry\n");



        TextView r3 = findViewById(R.id.r3);
        r3.setText("A while loop is used to repeat a block of code while a certain condition is true. The syntax is as follows:");

        TextView n3 = findViewById(R.id.n3);
        n3.setText("while condition:\n" +
                "    # code to execute while the condition is true\n");


        TextView r4 = findViewById(R.id.r4);
        r4.setText("The condition can be any expression that evaluates to a boolean value (True or False). The code inside the loop block is executed repeatedly as long as the condition is true.\n" +
                "\n" +
                "Here's an example:");

        TextView n4 = findViewById(R.id.n4);
        n4.setText("i = 0\n" +
                "\n" +
                "while i < 5:\n" +
                "    print(i)\n" +
                "    i += 1\n");

        TextView r5 = findViewById(R.id.r5);
        r5.setText("In this example, the loop block is executed repeatedly as long as i is less than 5. The print statement inside the loop block outputs the value of i, and i is incremented by 1 at the end of each iteration. The output of this loop is:");

        TextView n5 = findViewById(R.id.n5);
        n5.setText("0\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "4\n");


        TextView r8 = findViewById(R.id.r8);
        r8.setText("In conclusion, conditional execution and loops are two powerful tools for building complex programs in Python. By using these constructs, you can control the flow of your program and repeat blocks of code as needed.");




    }
}