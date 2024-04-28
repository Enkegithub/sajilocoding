package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.text.HtmlCompat;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Object_Oriented_Programming_paradigm_cplush_unit1 extends AppCompatActivity {

    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_oriented_programming_paradigm_cplush_unit1);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView o = findViewById(R.id.o);
        o.setText("OOP is an approach to programming which recognizes life as we know it as a collection of objects, which work in tandem with each other to solve a particular problem at hand. The primary thing to know about OOP is encapsulation, which is the idea that each object which holds the program is self-sustainable, which means that all the components that make up the object are within the object itself. Now since each module within this paradigm is self-sustainable, objects can be taken from one program and used to resolve another problem at hand with little or no alterations.");



        TextView s1 = findViewById(R.id.s1);
        s1.setText("① Due to modularity and encapsulation, OOP offers ease of management\n \n" +
                "② OOP mimics the real world, making it easier to understand\n \n" +
                "③ Since objects are whole within themselves, they are reusable in other programs");

        TextView ss1 = findViewById(R.id.ss1);
        ss1.setText("① Object-Oriented programs tend to be slower and use up a high amount of memory\n" +
                "② Over-generalization\n" +
                "③ Programs built using this paradigm may take longer to be created");



        TextView s2 = findViewById(R.id.s2);
        s2.setText(Html.fromHtml("An OOP method differs from POP in its basic approach itself. All the best features of structured of OOP is developed by retaining the programming method, in which they have added number of concepts which makes efficient programming. Object oriented programming methods have number of features and it makes possible an entirely new way of approaching a program. We have to mind first that OOP retains all best features of POP method like functions/sub routines, structure etc.<br>" +
                "<br>" +
                "<b>1)</b> The first feature that any programmer would talk about OOP is <b>“data hiding”</b> facility. Programmer can hide the important core data from external world by using OOP method. The basic concept of OOP revolves around a feature similar to structure in POP, named as <b>class</b> in OOP.. Data members can be declared as <b>private</b> or<b> public</b> inside a class.Â  Programmer have to note that a class is really similar to <b>structure</b> in ‘C’. Due to same structure, a class packs together different things into a single entity."));




        TextView o3 = findViewById(R.id.o3);
        o3.setText(Html.fromHtml("<b>2)</b> Another important feature of OOP is ‘code reusability‘. The simple means of code reusability is just that the code is written earlier in program or read or used it later.Â  This is made possible by a feature of classes named “inheritance”. By using inheritance, one class can acquire the properties of another class. Let i will try to explain this using an example. Take the example of a “School Management System” and management decided to make software based on the data ofÂ  students only. The programmer made the software and deciding to collecting personal details like Name, Age, Sex, Address etc. After one year school management decides to incorporate data of teachers to the software. The programmer can add this extension within a small time as he can reuse many of the codes he had written earlier by making use of “inheritance“. The class personal details is of general nature (Age is same for every person irrespective of student/teacher)"));


        TextView gh = findViewById(R.id.gh);
        gh.setText(Html.fromHtml("<b>Object Oriented Programming:</b><br>" +
                "Object oriented programming can be defined as a programming model which is based upon the concept of objects. Objects contain data in the form of attributes and code in the form of methods. In object oriented programming, computer programs are designed using the concept of objects that interact with real world. Object oriented programming languages are various but the most popular ones are class-based, meaning that objects are instances of classes, which also determine their types.<br>" +
                "<br><br>" +
                "<b>Languages used in Object Oriented Programming:</b><br>" +
                "<br>" +
                "Java, C++, C#, Python, <br>" +
                "PHP, JavaScript, Ruby, Perl, <br>" +
                "Objective-C, Dart, Swift, Scala. "));

        TextView s3 = findViewById(R.id.s3);
        s3.setText(Html.fromHtml("<b>Object Oriented Programming:</b><br>" +
                "Object oriented programming . can be defined as a programming model which is based upon the concept of objects. Objects contain data in the form of attributes and code in the form of methods. In object oriented programming, computer programs are designed using the concept of objects that interact with real world. Object oriented programming languages are various but the most popular ones are class-based, meaning that objects are instances of classes, which also determine their types.<br>" +
                "<br><br>" +
                "<b>Languages used in Object Oriented Programming:</b><br>" +
                "<br>" +
                "Java, C++, C#, Python, <br>" +
                "PHP, JavaScript, Ruby, Perl, <br>" +
                "Objective-C, Dart, Swift, Scala. "));


        TextView s5 = findViewById(R.id.s5);
        String text = "<p>To this note, programming languages are often separated by their programming paradigm. A programming paradigm is one way of looking at and accessing data. The  <a href=\"https://careerkarma.com/blog/functional-programming-vs-oop/\">two primary paradigms  </a> are Object-Oriented and  <a href=\"https://careerkarma.com/blog/functional-programming-languages/\">Functional </a> although there are many more (including some that are underlying principles for the above).</p>" +
                "<p>Object-Oriented programming is built around objects, which are data structures that contain both data (properties or attributes) and code (procedures or methods). Objects are able to modify themselves with ‘this’ or ‘self.’ In most OOP languages, almost everything is an object that can have both values and executable code. Each object is unique, and though it may be a copy of another object, its variables can be different from any other object’s variables.</p>" +
                "<p>The objects in object-oriented software design can be thought of like actual objects. Think of an object, like a watch. That watch has properties. It’s made of metal, it’s black, it has a specific weight. But that object also does things. It displays the time, and it also can affect itself by spinning gears to change the position of its hands.</p>" +
                "<p>Another feature of objects is that we don’t always need to know how the watch functions to get it to function. Assuming the watch is well-built it will reliably tell time, without us having to interfere with its inner workings.</p>" +
                "<p>Object-oriented languages have objects similar to real-world objects. They can have properties and functions. They also tend to follow a certain set of principles.</p>";
        s5.setText(Html.fromHtml(text));
        s5.setMovementMethod(LinkMovementMethod.getInstance());
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://careerkarma.com/blog/functional-programming-vs-oop/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        TextView s6 = findViewById(R.id.s6);
        String htmlString = "<p> <a href=\"https://www.geeksforgeeks.org/differences-between-procedural-and-object-oriented-programming/\">Difference between Procedural Programming and Object Oriented Programming:</a> Click </p>";
        Spanned spannedString = HtmlCompat.fromHtml(htmlString, HtmlCompat.FROM_HTML_MODE_LEGACY);
        s6.setText(spannedString);
        s6.setMovementMethod(LinkMovementMethod.getInstance());
        s6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Uri uri = Uri.parse("\"https://www.geeksforgeeks.org/differences-between-procedural-and-object-oriented-programming/\"");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });


    }
}