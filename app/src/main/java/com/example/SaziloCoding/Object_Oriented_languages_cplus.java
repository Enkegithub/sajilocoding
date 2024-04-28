package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Object_Oriented_languages_cplus extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object_oriented_languages_cplus);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText(Html.fromHtml("It’s important to understand the concept of object-oriented programming. Object-oriented programming is also known as OOP, and was even the name of a project in Douglas Coupland’s famous novel “Microsoft.”<br>" +
                "<br>" +
                "OOP was a total paradigm shift with programming as it relies on classes and objects, which is a confusing pair of constructs. To define these, one might say an object is an instance of a class. But what is a class? A class is a blueprint from which objects are created. So a class is a sort of template for creating a blueprint, but a blueprint is an instance of a class.<br>" +
                "<br>" +
                "How do we simplify that? Easy:<br>" +
                "<br>" +
                "Think of an object as something tangible, like a phone, a record, or a cup. Next, think of a class as a group of similar objects. For example, you might group “phone”, “tablet,” and “laptop” as a class called “mobility,” and “record”, “CD”, and “cassette” into a class labeled “music.”<br>" +
                "<br>" +
                "More importantly, however, OOP adheres to 4 principles:<br>" +
                "<br>" +
                "•Encapsulation: when an object can keep its state private (within a class).<br><br>" +
                "•Abstraction: a natural extension of Encapsulation which makes it possible for objects to only reveal operations relevant for other objects. For example, you get in your car and press the Start button. You don’t have to know how everything works under the hood, to drive.<br><br>" +
                "•Inheritance: makes it possible to create a child class that is derived from a parent class that reuses all fields and methods from the parent. <br><br>" +
                "•Polymorphism: makes it possible for objects to take on more than one form based on the context in which it is used.<br><br>" +
                "One of the biggest benefits driving OOP is that it makes it much easier to collaborate on the development process (especially when a project is divided into groups). This is made possible by code reusability, scalability, and efficiency. <br>" +
                "<br>" +
                "With that said, let’s take a look at the top OOP programming languages currently available.<br>" +
                "<br>"
                ));


        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText(Html.fromHtml("<b><font color='#DC8E47'>Java<br></font></b>" +
                "Without a doubt, Java  is one of the most widely-used OOP languages on the market. Part of the reason for the widespread use of Java is because it’s one of the official languages for Android development. With Android the most popular mobile operating system on the planet, Java isn’t going to be knocked off that top spot for some time. <br>" +
                "<br>" +
                "Java was created as a “write once, run anywhere” language, which makes it work for so many applications. And with Java 100 percent on board with the concepts and principles behind OOP, it’s understandable why it lives at the top of this list.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Python<br></font></b>" +
                "One of the best things about Python  is that it’s a general-purpose language that can be applied in many use-cases. However, one of the reasons why this particular Object-Oriented Language is included near the top of this list is that it’s one of the more important languages for machine learning and data science. Chances are good you won’t find a language better suited for these 2 purposes. And with both ML and DS continuing to expand their importance in technology, Python will only continue to grow more popular.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>C++<br></font></b>" +
                "C++ is one of the few languages used to build compilers and interpreters that compile other programming languages. C++ includes the speed of C, with the addition of the basic OOP concepts, which makes it fast and flexible. One of the primary reasons why C++ is so popular is that all operating systems are written with a combination of C and C++. So without C++, there’d be no operating system with which to use C++. In other words, C++ is a crucial language for technology. C++ is also used to develop web browsers (such as Chrome, Firefox, and Safari). <br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>C#<br></font></b>" +
                "C# is another general-purpose OOP language. This language was developed by Microsoft back in 2000 as part of the .NET initiative and shares some similarities with Java, C, and C++. C# was also designed in such a way that other languages can make use of it. One of the primary uses of C# is for desktop and web applications, which makes it quite a popular option for developers looking to create software with GUIs. <br>" +
                "<br>" +
                "However, one of the most popular uses for C# is within the gaming industry. The reason for this is that C# easily integrates with Windows. Because C# includes Automatic Garbage Collection, has outstanding developer tools, and is an OOP language, it will continue to dominate the game design sector.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Ruby<br></font></b>" +
                "Ruby  is similar to Python in that it’s a general-purpose language. Built specifically for simplicity, completeness, extensibility, and portability, Ruby is an open-source, interpreted OOP language which can be used on numerous platforms. <br>" +
                "<br>" +
                "Ruby uses a very simple syntax and can be easily learned by anyone who’s worked with a modern programming language. It has the ease of use of Perl but adds the full complement of OOP concepts into the mix. Ruby is often used for both front and backend development and can be applied to the fields of data analysis, prototyping, and proof of concepts."));
    }
}