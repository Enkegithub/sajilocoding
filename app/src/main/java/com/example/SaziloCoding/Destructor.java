package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Destructor extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_destructor);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 onBackPressed();
            }
        });





        TextView vp1 = findViewById(R.id.vp1);
        vp1.setText("Destructor is an instance member function which is invoked automatically whenever an object is going to be destroyed. Meaning, a destructor is the last function that is going to be called before an object is destroyed.\n" +
                "\n" +
                "The thing is to be noted here, if the object is created by using new or the constructor uses new to allocate memory which resides in the heap memory or the free store, the destructor should use delete to free the memory. \n" +
                "\n" +
                "➤Destructor function is automatically invoked when the objects are destroyed.\n" +
                "➤It cannot be declared static or const.\n" +
                "➤The destructor does not have arguments.\n" +
                "➤It has no return type not even void.\n" +
                "➤An object of a class with a Destructor cannot become a member of the union.\n" +
                "➤A destructor should be declared in the public section of the class.\n" +
                "➤The programmer cannot access the address of destructor.\n" +
                " \n" +
                "\n" +
                "class String {\n" +
                "private:\n" +
                "char* s;\n" +
                "int size;\n" +
                "\n" +
                "public:\n" +
                "String(char*); // constructor\n" +
                "~String(); // destructor\n" +
                "};\n" +
                "\n" +
                "String::String(char* c)\n" +
                "{\n" +
                "size = strlen(c);\n" +
                "s = new char[size + 1];\n" +
                "strcpy(s, c);\n" +
                "}\n" +
                "String::~String() { delete[] s; }");
    }
}