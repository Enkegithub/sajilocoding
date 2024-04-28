package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Python_Variables_Data_Types extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python_variables_data_types);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });

        TextView t1 = findViewById(R.id.t1);
        t1.setText("In Python, a variable is a named reference to a value that is stored in the computer's memory. When you create a variable, you are creating a label that points to a specific location in memory where the value is stored.\n" +
                "\n" +
                "To create a variable in Python, you use the assignment operator (`=`) to assign a value to a variable name. Here's an example:");


        TextView txt5 = findViewById(R.id.txt5);
        txt5.setText("x = 5\n");


        TextView gt2 = findViewById(R.id.gt2);
        gt2.setText("In this example, we've created a variable called `x `and assigned it the value `5`. We can then use the variable name `x` in our code to refer to that value:");



        TextView txt6 = findViewById(R.id.txt6);
        txt6.setText("y = x + 2\n" +
                "print(y)  # Output: 7\n");

        TextView t21 = findViewById(R.id.t21);
        t21.setText("Here, we've created a new variable called y and assigned it the value of x + 2. Since x is equal to 5, y is equal to 7.");

        TextView t56 = findViewById(R.id.t56);
        t56.setText(Html.fromHtml("<b>Integers (`int`):</b> Integers are whole numbers, such as `1`, `2`, `3`, etc.<br>" +
                "<b>Floating-Point Numbers (`float`):</b> Floating-point numbers are decimal numbers, such as `1.5`, `2.7`, `3.14`, etc.<br>" +
                "<b>Strings (`str`):</b> Strings are sequences of characters, such as `\"hello\"`, `\"world\"`, \"Python\", etc.<br>" +
                "<b>Booleans (bool):</b> Booleans represent logical values of either 'True' or `False`.<br>" +
                "<b>Lists (`list`):</b> Lists are ordered collections of items, which can be of different data types. For example, `[1, 2, 3]` is a list of integers.<br>" +
                "<b>Tuples (`tuple`):</b> Tuples are similar to lists, but the items in a tuple cannot be changed once they are assigned. For example, `(1, 2, 3)` is a tuple of integers.<br>" +
                "<b>Sets (`set`):</b> Sets are collections of unique items that are unordered. For example, `{1, 2, 3}` is a set of integers.<br>" +
                "<b>Dictionaries (`dict`):</b> Dictionaries are collections of key-value pairs, where each key is associated with a value. For example, `{\"name\": \"John\", \"age\": 30} is a dictionary with keys \"name\"` and `\"age\"`, which are associated with the values `\"John\" and<br>" +
                "`30`, respectively.<br>" +
                "<br>" +
                "You can use the 'type()` function to determine the data type of a value in Python. For"));

        TextView txt8 = findViewById(R.id.txt8);
        txt8.setText("x = 5\n" +
                "print(type(x))  # Output: <class 'int'>\n" +
                "\n" +
                "y = 3.14\n" +
                "print(type(y))  # Output: <class 'float'>\n" +
                "\n" +
                "z = \"hello\"\n" +
                "print(type(z))  # Output: <class 'str'>\n" +
                "\n" +
                "a = True\n" +
                "print(type(a))  # Output: <class 'bool'>\n" +
                "\n" +
                "b = [1, 2, 3]\n" +
                "print(type(b))  # Output: <class 'list'>\n" +
                "\n" +
                "c = (1, 2, 3)\n" +
                "print(type(c))  # Output: <class 'tuple'>\n" +
                "\n" +
                "d = {1, 2, 3}\n" +
                "print(type(d))  # Output: <class 'set'>\n" +
                "\n" +
                "e = {\"name\": \"John\", \"age\": 30}\n" +
                "print(type(e))  # Output: <class 'dict'>\n");
    }
}