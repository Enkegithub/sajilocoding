package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Modules_in_python extends AppCompatActivity {
    ImageView backbtn;
    TextView textView
            ;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modules_in_python);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

       TextView t1 = findViewById(R.id.t1);
       t1.setText("In Python, a module is simply a file containing Python code. This code can include functions, classes, variables, and any other Python objects that you might use in your program. When you want to use the functionality defined in a module, you can `import` it into your program using the import statement.\n" +
               "\n" +
               "The syntax for importing a module is as follows:");

       TextView text5 = findViewById(R.id.text5);
       text5.setText("import module_name\n");

       TextView t3 = findViewById(R.id.t3);
       t3.setText("Here, `module_name` is the name of the module that you want to import. For example, if you wanted to import the math `module`, which provides various mathematical functions, you would write:");

     TextView text7 = findViewById(R.id.text7);
     text7.setText("import math\n");

     TextView t4 = findViewById(R.id.t4);
     t4.setText("After you have imported a module, you can use the functions and other objects defined in that module by prefixing their names with the module name and a dot (`.`) operator. For example, to use the sqrt() function from the `math` module, you would write:");

     TextView text8 = findViewById(R.id.text8);
     text8.setText("import math\n" +
             "\n" +
             "x = math.sqrt(16)\n" +
             "print(x)  # Output: 4.0\n");


     TextView r0 = findViewById(R.id.r0);
     r0.setText("You can also import specific objects from a module into your program using the from keyword. Here's an example:");


     TextView n0= findViewById(R.id.n0);
     n0.setText("from math import sqrt\n" +
             "\n" +
             "x = sqrt(16)\n" +
             "print(x)  # Output: 4.0\n");

     TextView r2 = findViewById(R.id.r2);
     r2.setText("In this case, we are importing only the sqrt() function from the math module, so we can use it directly without prefixing it with the module name.\n" +
             "\n" +
             "In addition to the standard library modules that come with Python, you can also create your own modules to encapsulate reusable code. To do this, you simply write your Python code in a file with a .py extension, and then import that file as a module in your other Python programs. Here's an example:");
     TextView n2 = findViewById(R.id.n2);
     n2.setText("# mymodule.py\n" +
             "\n" +
             "def add_numbers(a, b):\n" +
             "    return a + b\n");

     TextView r3 = findViewById(R.id.r3);
     r3.setText("To use this module in another Python program, you would simply import it like this:");
TextView n3 = findViewById(R.id.n3);
        n3.setText("import mymodule\n" +
                "\n" +
                "x = mymodule.add_numbers(3, 4)\n" +
                "print(x)  # Output: 7\n");



        TextView r4 = findViewById(R.id.r4);
        r4.setText("In summary, modules are an important feature of Python that allow you to organize and reuse your code. By importing modules, you can take advantage of the functionality provided by the standard library and by other developers in the Python community, and by creating your own modules, you can encapsulate your own reusable code for use in other programs.");

    }
}