package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Types_of_Inheritance_unit3_java extends AppCompatActivity {
    TextView textView;
    ImageView  backbtn;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_inheritance_unit3_java);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView e0 = findViewById(R.id.e0);
        e0.setText("On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.\n" +
                "\n" +
                "In java programming, multiple and hybrid inheritance is supported through interface only. We will learn about interfaces later.");


        TextView s3 = findViewById(R.id.s3);
        s3.setText("Note: Multiple inheritance is not supported in Java through class.\n" +
                "When one class inherits multiple classes, it is known as multiple inheritance. For Example:");


        TextView s4 = findViewById(R.id.s4);
        s4.setText("When a class inherits another class, it is known as a single inheritance. In the example given below, Dog class inherits the Animal class, so there is the single inheritance.\n" +
                "\n" +
                "File: TestInheritance.java\n" +
                "\n" +
                "1. void eat(){System.out.println(\"eating...\");}  \n" +
                "2 class Dog extends Animal{  \n" +
                "3. }  \n" +
                "4. public static void main(String args[]){  \n" +
                "5. d.bark();  \n" +
                "6. }}  \n \n" +
                "Output:\n" +
                "\n" +
                "barking...\n" +
                "eating...");

        TextView s5 = findViewById(R.id.s5);
        s5.setText("When there is a chain of inheritance, it is known as multilevel inheritance. As you can see in the example given below, BabyDog class inherits the Dog class which again inherits the Animal class, so there is a multilevel inheritance.\n" +
                "\n" +
                "File: TestInheritance2.java\n" +
                "\n" +
                "1. void eat(){System.out.println(\"eating...\");}  \n" +
                "2. class Dog extends Animal{  \n" +
                "3. }  \n" +
                "4. void weep(){System.out.println(\"weeping...\");}  \n" +
                "5. class TestInheritance2{  \n" +
                "6. BabyDog d=new BabyDog();  \n" +
                "7. d.bark();  \n" +
                "8. }}  \n" +
                "Output:\n" +
                "\n" +
                "weeping...\n" +
                "barking...\n" +
                "eating...");


        TextView s6 =findViewById(R.id.s6);
        s6.setText("When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.\n" +
                "\n" +
                "File: TestInheritance3.java\n" +
                "\n" +
                "1. void eat(){System.out.println(\"eating...\");}  \n" +
                "2. class Dog extends Animal{  \n" +
                "3. }  \n" +
                "4. void meow(){System.out.println(\"meowing...\");}  \n" +
                "6. class TestInheritance3{  \n" +
                "7. Cat c=new Cat();  \n" +
                "8. c.eat();  \n" +
                "9. }}  \n" +
                "Output:\n" +
                "\n" +
                "meowing...\n" +
                "eating...");


        TextView s7 = findViewById(R.id.s7);
        s7.setText("To reduce the complexity and simplify the language, multiple inheritance is not supported in java.\n" +
                "\n" +
                "Consider a scenario where A, B, and C are three classes. The C class inherits A and B classes. If A and B classes have the same method and you call it from child class object, there will be ambiguity to call the method of A or B class.\n" +
                "\n" +
                "Since compile-time errors are better than runtime errors, Java renders compile-time error if you inherit 2 classes. So whether you have same method or different, there will be compile time error.\n" +
                "\n" +
                "1. void msg(){System.out.println(\"Hello\");}  \n" +
                "2. class B{  \n" +
                "3. }  \n" +
                "   \n" +
                "5.   C obj=new C();  \n" +
                "6. }  \n" +
                " Compile Time Error");



    }
}