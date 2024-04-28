package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Scopes_and_Namespaces_python extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scopes_and_namespaces_python);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView t1 = findViewById(R.id.t1);
        t1.setText("A namespace is a system that has a unique name for each and every object in Python. An object might be a variable or a method. Python itself maintains a namespace in the form of a Python dictionary. Let’s go through an example, a directory-file system structure in computers. Needless to say, that one can have multiple directories having a file with the same name inside every directory. But one can get directed to the file, one wishes, just by specifying the absolute path to the file. \n" +
                "Real-time example, the role of a namespace is like a surname. One might not find a single “Alice” in the class there might be multiple “Alice” but when you particularly ask for “Alice Lee” or “Alice Clark” (with a surname), there will be only one (time being don’t think of both first name and surname are same for multiple students).\n" +
                "On similar lines, the Python interpreter understands what exact method or variable one is trying to point to in the code, depending upon the namespace. So, the division of the word itself gives a little more information. Its Name (which means name, a unique identifier) + Space(which talks something related to scope). Here, a name might be of any Python method or variable and space depends upon the location from where is trying to access a variable or a method.");



        TextView t21 = findViewById(R.id.t21);
        t21.setText("When Python interpreter runs solely without any user-defined modules, methods, classes, etc. Some functions like print(), id() are always present, these are built-in namespaces. When a user creates a module, a global namespace gets created, later the creation of local functions creates the local namespace. The built-in namespace encompasses the global namespace and the global namespace encompasses the local namespace.");



        TextView text5 = findViewById(R.id.text5);
        text5.setText("# var1 is in the global namespace\n" +
                "var1 = 5\n" +
                "def some_func():\n" +
                "\n" +
                "\t# var2 is in the local namespace\n" +
                "\tvar2 = 6\n" +
                "\tdef some_inner_func():\n" +
                "\n" +
                "\t\t# var3 is in the nested local\n" +
                "\t\t# namespace\n" +
                "\t\tvar3 = 7\n");

        TextView hy = findViewById(R.id.hy);
        hy.setText("But in some cases, one might be interested in updating or processing global variables only, as shown in the following example, one should mark it explicitly as global and the update or process.   Note that the line “count = count +1” references the global variable and therefore uses the global variable, but compare this to the same line written “count = 1”.  Then the line “global count” is absolutely needed according to scope rules.");



        TextView text6 = findViewById(R.id.text6);
        text6.setText("# Python program processing\n" +
                "# global variable\n" +
                "\n" +
                "count = 5\n" +
                "def some_method():\n" +
                "\tglobal count\n" +
                "\tcount = count + 1\n" +
                "\tprint(count)\n" +
                "some_method()\n");

        TextView gy = findViewById(R.id.gy);
        gy.setText("# Python program showing\n" +
                "# a scope of object\n" +
                "\n" +
                "def some_func():\n" +
                "\tprint(\"Inside some_func\")\n" +
                "\tdef some_inner_func():\n" +
                "\t\tvar = 10\n" +
                "\t\tprint(\"Inside inner function, value of var:\",var)\n" +
                "\tsome_inner_func()\n" +
                "\tprint(\"Try printing var from outer function: \",var)\n" +
                "some_func()\n");

        TextView gt = findViewById(R.id.gt);
        gt.setText("Scope refers to the coding region from which a particular Python object is accessible. Hence one cannot access any particular object from anywhere from the code, the accessing has to be allowed by the scope of the object.\n" +
                "Let’s take an example to have a detailed understanding of the same: ");

        TextView gy1 = findViewById(R.id.gy1);
        gy1.setText("Inside some_func\n" +
                "Inside inner function, value of var: 10\n" +
                "\n" +
                "Traceback (most recent call last):\n" +
                "  File \"/home/1eb47bb3eac2fa36d6bfe5d349dfcb84.py\", line 8, in \n" +
                "    some_func()\n" +
                "  File \"/home/1eb47bb3eac2fa36d6bfe5d349dfcb84.py\", line 7, in some_func\n" +
                "    print(\"Try printing var from outer function: \",var)\n" +
                "NameError: name 'var' is not defined");
    }
}