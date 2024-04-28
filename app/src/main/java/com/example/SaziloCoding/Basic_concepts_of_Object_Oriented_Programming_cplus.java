package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Basic_concepts_of_Object_Oriented_Programming_cplus extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_concepts_of_object_oriented_programming_cplus);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });






        TextView s1 = findViewById(R.id.s1);
        s1.setText(Html.fromHtml("<font color='#DC8E47'><b>Class:</b></font> The building block of C++ that leads to Object-Oriented programming is a Class. It is a user-defined data type, which holds its own data members and member functions, which can be accessed and used by creating an instance of that class. A class is like a blueprint for an object.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "For Example: Consider the Class of Cars. There may be many cars with different names and brand but all of them will share some common properties like all of them will have 4 wheels, Speed Limit, Mileage range etc. So here, Car is the class and wheels, speed limits, mileage are their properties.<br>" +
                "<br>" +
                "1.A Class is a user-defined data-type which has data members and member functions.<br>" +
                "2.Data members are the data variables and member functions are the functions used to manipulate these variables and together these data members and member functions define the properties and behaviour of the objects in a Class.<br>" +
                "3.In the above example of class Car, the data member will be speed limit, mileage etc and member functions can apply brakes, increase speed etc.<br>" +
                "We can say that a Class in C++ is a blue-print representing a group of objects which shares some common properties and behaviours.<br>" +
                "<br>" +
                "<font color='#DC8E47'><b>Object:</b></font> An Object is an identifiable entity with some characteristics and behaviour. An Object is an instance of a Class. When a class is defined, no memory is allocated but when it is instantiated (i.e. an object is created) memory is allocated.<br>" +
                "<br>" +
                "<br>" +
                "<br>" +
                "<br>" +
                "class person<br>" +
                "{<br>" +
                "    char name[20];<br>" +
                "    int id;<br>" +
                "public:<br>" +
                "    void getdetails(){}<br>" +
                "};<br>" +
                "  <br>" +
                "int main()<br>" +
                "{<br>" +
                "   person p1; // p1 is a object <br>" +
                "}<br>" +
                " <br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "Object take up space in memory and have an associated address like a record in pascal or structure or union in C.<br>" +
                "<br>" +
                "When a program is executed the objects interact by sending messages to one another.<br>" +
                "<br>" +
                "Each object contains data and code to manipulate the data. Objects can interact without having to know details of each other’s data or code, it is sufficient to know the type of message accepted and type of response returned by the objects.<br>" +
                "<br>" +
                "<font color='#DC8E47'><b>Encapsulation:</b></font> In normal terms, Encapsulation is defined as wrapping up of data and information under a single unit. In Object-Oriented Programming, Encapsulation is defined as binding together the data and the functions that manipulate them.<br>" +
                "<br>" +
                "Consider a real-life example of encapsulation, in a company, there are different sections like the accounts section, finance section, sales section etc. The finance section handles all the financial transactions and keeps records of all the data related to finance. Similarly, the sales section handles all the sales-related activities and keeps records of all the sales. Now there may arise a situation when for some reason an official from the finance section needs all the data about sales in a particular month. In this case, he is not allowed to directly access the data of the sales section. He will first have to contact some other officer in the sales section and then request him to give the particular data. This is what encapsulation is. Here the data of the sales section and the employees that can manipulate them are wrapped under a single name “sales section”."));

        TextView rp = findViewById(R.id.rp);
        rp.setText(Html.fromHtml("Encapsulation in C++<br>" +
                "<br>" +
                "Encapsulation also leads to data abstraction or hiding. As using encapsulation also hides the data. In the above example, the data of any of the section like sales, finance or accounts are hidden from any other section.<br>" +
                "<br>" +
                "<font color='#DC8E47'><b>Abstraction:</b></font> Data abstraction is one of the most essential and important features of object-oriented programming in C++. Abstraction means displaying only essential information and hiding the details. Data abstraction refers to providing only essential information about the data to the outside world, hiding the background details or implementation.<br>" +
                "<br>" +
                "Consider a real-life example of a man driving a car. The man only knows that pressing the accelerators will increase the speed of the car or applying brakes will stop the car but he does not know about how on pressing accelerator the speed is actually increasing, he does not know about the inner mechanism of the car or the implementation of accelerator, brakes etc in the car. This is what abstraction is.<br>" +
                "<br>" +
                "1.Abstraction using Classes: We can implement Abstraction in C++ using classes. The class helps us to group data members and member functions using available access specifiers. A Class can decide which data member will be visible to the outside world and which is not.<br>" +
                "2.Abstraction in Header files: One more type of abstraction in C++ can be header files. For example, consider the pow() method present in math.h header file. Whenever we need to calculate the power of a number, we simply call the function pow() present in the math.h header file and pass the numbers as arguments without knowing the underlying algorithm according to which the function is actually calculating the power of numbers.<br>" +
                "<b>Polymorphism:</b> (Links to an external site.)Links to an external site. The word polymorphism means having many forms. In simple words, we can define polymorphism as the ability of a message to be displayed in more than one form.<br>" +
                "<br>" +
                "A person at the same time can have different characteristic. Like a man at the same time is a father, a husband, an employee. So the same person posses different behaviour in different situations. This is called polymorphism.<br>" +
                "<br>" +
                "An operation may exhibit different behaviours in different instances. The behaviour depends upon the types of data used in the operation.<br>" +
                "<br>" +
                "C++ supports operator overloading and function overloading.<br>" +
                "<br>" +
                "1.Operator Overloading: The process of making an operator to exhibit different behaviours in different instances is known as operator overloading.<br>" +
                "2.Function Overloading: Function overloading is using a single function name to perform different types of tasks.<br>" +
                "Polymorphism is extensively used in implementing inheritance.<br>" +
                "<b>Example:</> Suppose we have to write a function to add some integers, some times there are 2 integers, some times there are 3 integers. We can write the Addition Method with the same name having different parameters, the concerned method will be called according to parameters."));


        TextView ss1 = findViewById(R.id.ss1);
        ss1.setText(Html.fromHtml("<font color='#DC8E47'><b>Inheritance:</b></font> The capability of a class to derive properties and characteristics from another class is called Inheritance. Inheritance is one of the most important features of Object-Oriented Programming.<br>" +
                "<br>" +
                "<b>Sub Class:</b> The class that inherits properties from another class is called Sub class or Derived Class.<br>" +
                "<b>Super Class:</b>The class whose properties are inherited by sub class is called Base Class or Super class.<br>" +
                "<b>Reusability:</b> Inheritance supports the concept of “reusability”, i.e. when we want to create a new class and there is already a class that includes some of the code that we want, we can derive our new class from the existing class. By doing this, we are reusing the fields and methods of the existing class.<br>" +
                "<b>Example:</b> Dog, Cat, Cow can be Derived Class of Animal Base Class."));

        TextView rp2 = findViewById(R.id.rp2);
        rp2.setText(Html.fromHtml("<font color='#DC8E47'><b>Dynamic Binding:</b></font> In dynamic binding, the code to be executed in response to function call is decided at runtime. C++ has virtual functions  to support this.<br>" +
                "<br>" +
                "<br>" +
                "<br>" +
                "<font color='#DC8E47'><b>Message Passing:</b></font> Objects communicate with one another by sending and receiving information to each other. A message for an object is a request for execution of a procedure and therefore will invoke a function in the receiving object that generates the desired results. Message passing involves specifying the name of the object, the name of the function and the information to be sent."));
    }

}