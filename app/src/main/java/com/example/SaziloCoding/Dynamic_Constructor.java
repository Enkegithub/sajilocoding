package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Dynamic_Constructor extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic_constructor);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        TextView v2 = findViewById(R.id.v2);
        v2.setText(Html.fromHtml("<b><font color='#DC8E47'>Example 1:</b></font> <br>" +
                "<br>" +
                "#include <iostream><br>" +
                "using namespace std;<br>" +
                "<br>" +
                "class geeks {<br>" +
                "const char* p;<br>" +
                "<br>" +
                "public:<br>" +
                "// default constructor<br>" +
                "geeks()<br>" +
                "{<br>" +
                "<br>" +
                "// allocating memory at run time<br>" +
                "p = new char[6];<br>" +
                "p = \"demos\";<br>" +
                "}<br>" +
                "<br>" +
                "void display()<br>" +
                "{<br>" +
                "cout << p << endl;<br>" +
                "}<br>" +
                "};<br>" +
                "<br>" +
                "int main()<br>" +
                "{<br>" +
                "geeks obj = new geeks();<br>" +
                "obj.display();<br>" +
                "}<br>" +
                "<br>" +
                "Explanation: In this we point data member of type char which is allocated memory dynamically by new operator and when we create dynamic memory within the constructor of class this is known as dynamic constructor.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example 2:</b></font> <br>" +
                "<br>" +
                "#include <iostream><br>" +
                "using namespace std;<br>" +
                "<br>" +
                "class geeks {<br>" +
                "int* p;<br>" +
                "<br>" +
                "public:<br>" +
                "// default constructor<br>" +
                "geeks()<br>" +
                "{<br>" +
                "<br>" +
                "// allocating memory at run time<br>" +
                "// and initializing<br>" +
                "p = new int[3]{ 1, 2, 3 };<br>" +
                "<br>" +
                "for (int i = 0; i < 3; i++) {<br>" +
                "cout << p[i] << \" \";<br>" +
                "}<br>" +
                "<br>" +
                "cout << endl;<br>" +
                "}<br>" +
                "};<br>" +
                "<br>" +
                "int main()<br>" +
                "{<br>" +
                "<br>" +
                "// five objects will be created<br>" +
                "// for each object<br>" +
                "// default constructor would be called<br>" +
                "// and memory will be allocated<br>" +
                "// to array dynamically<br>" +
                "geeks* ptr = new geeks[5];<br>" +
                "}<br>" +
                "<br>" +
                "Explanation: In this program we have created array of object dynamically. The first object is ptr[0], second is ptr[1] and so on . For each object creation default constructor is called and for each object memory is allocated to pointer type variable by new (Links to an external site.)Links to an external site. operator.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example 3:</b></font> <br>" +
                "<br>" +
                "#include <iostream><br>" +
                "using namespace std;<br>" +
                "<br>" +
                "class geeks {<br>" +
                "int* p;<br>" +
                "<br>" +
                "public:<br>" +
                "// default constructor<br>" +
                "geeks()<br>" +
                "{<br>" +
                "<br>" +
                "// allocating memory at run time<br>" +
                "p = new int;<br>" +
                "*p = 0;<br>" +
                "}<br>" +
                "<br>" +
                "// parameterized constructor<br>" +
                "geeks(int x)<br>" +
                "{<br>" +
                "p = new int;<br>" +
                "*p = x;<br>" +
                "}<br>" +
                "void display()<br>" +
                "{<br>" +
                "cout << *p << endl;<br>" +
                "}<br>" +
                "};<br>" +
                "<br>" +
                "int main()<br>" +
                "{<br>" +
                "<br>" +
                "// default constructor would be called<br>" +
                "geeks obj1 = geeks();<br>" +
                "obj1.display();<br>" +
                "<br>" +
                "// parameterized constructor would be called<br>" +
                "geeks obj2 = geeks(7);<br>" +
                "obj2.display();<br>" +
                "}<br>" +
                "<br>" +
                "Explanation: In this integer type pointer variable is declared in class which is assigned memory dynamically when the constructor is called. When we create object obj1, the default constructor is called and memory is assigned dynamically to pointer type variable and initialized with value 0. And similarly when obj2 is created parameterized constructor is called and memory is assigned dynamically.<br>" +
                "<br>" +
                " "));
    }
}