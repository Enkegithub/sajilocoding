package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class unit_Features_of_Java extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_features_of_java);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView h1 = findViewById(R.id.h1);
        h1.setText("The primary objective of Java programming language creation was to make it portable, simple and secure programming language. Apart from this, there are also some excellent features which play an important role in the popularity of this language. The features of Java are also known as java buzzwords.\n" +
                "\n" +
                "A list of most important features of Java language is given below.\n" +
                "\n" +
                "1.Simple\n" +
                "2.Object-Oriented\n" +
                "3.Portable\n" +
                "4.Platform independent\n" +
                "5.Secured\n" +
                "6.Robust\n" +
                "7.Architecture neutral\n" +
                "8.Interpreted\n" +
                "9.High Performance\n" +
                "10.Multithreaded\n" +
                "11.Distributed\n" +
                "12.Dynamic");


        TextView h2 = findViewById(R.id.h2);
        String text = "Java is very easy to learn, and its syntax is simple, clean and easy to understand. According to Sun, Java language is a simple programming language because:<br><br>" +
                "•Java syntax is based on C++ (so easier for programmers to learn it after C++).<br><br>" +
                "•Java has removed many complicated and rarely-used features, for example, explicit pointers, operator overloading, etc.<br><br>" +
                "•There is no need to remove unreferenced objects because there is an Automatic Garbage Collection in Java.";

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            h2.setText(Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY));
        } else {
            h2.setText(Html.fromHtml(text));
        }



        TextView m2 = findViewById(R.id.m2);
        m2.setText("Java is an object-oriented programming language. Everything in Java is an object. Object-oriented means we organize our software as a combination of different types of objects that incorporates both data and behavior.\n" +
                "\n" +
                "Object-oriented programming (OOPs) is a methodology that simplifies software development and maintenance by providing some rules.\n" +
                "\n" +
                "Basic concepts of OOPs are:\n" +
                "\n" +
                "1.Object\n" +
                "2.Class\n" +
                "3.Inheritance\n" +
                "4.Polymorphism\n" +
                "5.Abstraction\n" +
                "6.Encapsulation");
        TextView m3 = findViewById(R.id.m3);
        m3.setText(Html.fromHtml("Java is platform independent because it is different from other languages like C, C++, etc. which are compiled into platform specific machines while Java is a write once, run anywhere language. A platform is the hardware or software environment in which a program runs.<br><br>" +
                "There are two types of platforms software-based and hardware-based. Java provides a software-based platform.<br><br>" +
                "The Java platform differs from most other platforms in the sense that it is a software-based platform that runs on the top of other hardware-based platforms. It has two components:<br><br>" +
                "1.Runtime Environment<br>" +
                "2.API(Application Programming Interface)<br><br>" +
                "Java code can be run on multiple platforms, for example, Windows, Linux, Sun Solaris, Mac/OS, etc. Java code is compiled by the compiler and converted into bytecode. This bytecode is a platform-independent code because it can be run on multiple platforms, i.e., Write Once and Run Anywhere(WORA)."));


        TextView m4 = findViewById(R.id.m4);
        m4.setText(Html.fromHtml("Java is best known for its security. With Java, we can develop virus-free systems. Java is secured because:<br> <br>" +
                "<br> <br>" +
                "<b>•No explicit pointer</b><br> <br>" +
                "<b>•Java Programs run inside a virtual machine sandbox </b><br><br>" +
                "<b>•Classloader:</b> Classloader in Java is a part of the Java Runtime Environment(JRE) which is used to load Java classes into the Java Virtual Machine dynamically. It adds security by separating the package for the classes of the local file system from those that are imported from network sources.<br><br>" +
                "<b>•Bytecode Verifier:</b>It checks the code fragments for illegal code that can violate access right to objects.<br><br>" +
                "<b>•Security Manager:</b> It determines what resources a class can access such as reading and writing to the local disk.<br><br>" +
                "Java language provides these securities by default. Some security can also be provided by an application developer explicitly through SSL, JAAS, Cryptography, etc."));
         TextView h4 = findViewById(R.id.h4);
         h4.setText(Html.fromHtml("Robust simply means strong. Java is robust because:<br> <br>" +
                 "<br>" +
                 "<b>①.</b>It uses strong memory management.<br><br>" +
                 "<b>②.</b>There is a lack of pointers that avoids security problems.<br><br>" +
                 "<b>③.</b>There is automatic garbage collection in java which runs on the Java Virtual Machine to get rid of objects which are not being used by a Java application anymore.<br><br>" +
                 "<b>④.</b>There are exception handling and the type checking mechanism in Java. All these points make Java robust.<br>"));


         TextView h5 = findViewById(R.id.h5);
         h5.setText("Java is architecture neutral because there are no implementation dependent features, for example, the size of primitive types is fixed.\n" +
                 "\n" +
                 "In C programming, int data type occupies 2 bytes of memory for 32-bit architecture and 4 bytes of memory for 64-bit architecture. However, it occupies 4 bytes of memory for both 32 and 64-bit architectures in Java.");


         TextView h6 = findViewById(R.id.h6);
         h6.setText("Java is faster than other traditional interpreted programming languages because Java bytecode is \"close\" to native code. It is still a little bit slower than a compiled language (e.g., C++). Java is an interpreted language that is why it is slower than compiled languages, e.g., C, C++, etc.");

         TextView h7= findViewById(R.id.h7);
         h7.setText("Java is a dynamic language. It supports dynamic loading of classes. It means classes are loaded on demand. It also supports functions from its native languages, i.e., C and C++.\n" +
                 "\n" +
                 "Java supports dynamic compilation and automatic memory management (garbage collection).");


    }
}