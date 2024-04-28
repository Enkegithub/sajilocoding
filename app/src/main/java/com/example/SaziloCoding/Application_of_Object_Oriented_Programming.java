package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Application_of_Object_Oriented_Programming extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_application_of_object_oriented_programming);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText("To determine, Object Oriented Programming with C++  deals with objects which are to be manipulated. It does not define the logic. An object can be a method, a data structure, or a function. An object is defined as an instance of a class where variables, methods, and data structures come together to make an object. The objects can contain both data as well as functions.");



        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText(Html.fromHtml("<font color='#DC8E47'>AI Expert Systems<br></font>" +
                "These are computer applications that are developed to solve sophisticated problems about a specific domain, which is at a level far beyond the reach of a human brain. It has the following characteristics such as<br>" +
                "<br>" +
                "• Reliable<br>" +
                "• Highly responsive<br>" +
                "• High-performance<br>" +
                "• Understandable<br><br>" +
                "<font color='#DC8E47'>Office Automation Systems<br></font>" +
                "It includes formal and informal electronic systems primarily concerned with information sharing and communication to and from people inside and outside the organization. Examples of office automation systems such as<br>" +
                "<br>" +
                "• Email<br>" +
                "• Word processing<br>" +
                "• Desktop publishing<br>" +
                "• Web calendars<br><br>" +
                "<font color='#DC8E47'>Object-Oriented Databases<br></font>" +
                "They are also known as Object Database Management Systems (ODBMS). These databases store objects instead of data, such as integers and real numbers. Objects consist of the following such as<br>" +
                "<br>" +
                "Attributes: Attributes are data which defines the traits of an object. This data can be as simple as integers and real numbers. As well as, it is reference to a complex object.<br>" +
                "<br>" +
                "Methods: They define the behavior and are also called functions or procedures.<br>" +
                "<br><br>" +
                "<font color='#DC8E47'>Client-Server Systems<br></font>" +
                "Object-oriented Client-Server Systems deliver the IT infrastructure that creating object-oriented Client-Server Internet (OCSI) applications. Here, infrastructure refers to operating systems, networks, and hardware in Embedded System Programming Course (Links to an external site.)Links to an external site.. It consists of three major technologies such as<br>" +
                "<br>" +
                "• The Client Server<br>" +
                "• The Internet<br>" +
                "• Object-Oriented Programming<br><br>" +
                "<font color='#DC8E47'>OOPs</font> stands for Object-Oriented Programming. It is about creating objects that contain both data and functions. Object-Oriented programming has several advantages over procedural languages. As OOP is faster and easier to execute it becomes more powerful than procedural languages like C++ (Links to an external site.)Links to an external site.. OOPs is the most important and flexible paradigm of modern programming. It is specifically useful in modeling real-world problems. Below are some applications of OOPs:<br>" +
                "<br>" +
                "<b>•Real-Time System design:</b> Real-time system inherits complexities and makes it difficult to build them. OOP techniques make it easier to handle those complexities.<br><br>" +
                "<b>•Hypertext and Hypermedia:</b> Hypertext is similar to regular text as it can be stored, searched, and edited easily. Hypermedia on the other hand is a superset of hypertext. OOP also helps in laying the framework for hypertext and hypermedia.<br><br>" +
                "<b>•AI Expert System:</b> These are computer application that is developed to solve complex problems which are far beyond the human brain. OOP helps to develop such an AI expert System<br><br>" +
                "<b>•Office automation System:</b> These include formal as well as informal electronic systems that primarily concerned with information sharing and communication to and from people inside and outside the organization. OOP also help in making office automation principle.<br><br>" +
                "<b>•Neural networking and parallel programming:</b> It addresses the problem of prediction and approximation of complex-time varying systems. OOP simplifies the entire process by simplifying the approximation and prediction ability of the network.<br><br>" +
                "<b>•Stimulation and modeling system:</b> It is difficult to model complex systems due to varying specifications of variables. Stimulating complex systems require modeling and understanding interaction explicitly. OOP provides an appropriate approach for simplifying these complex models.<br><br>" +
                "<b>•Object-oriented database:</b> The databases try to maintain a direct correspondence between the real world and database object in order to let the object retain it identity and integrity.<br><br>" +
                "<b>•Client-server system:</b> Object-oriented client-server system provides the IT infrastructure creating object-oriented sever internet(OCSI) applications.<br><br>" +
                "<b>•CIM/CAD/CAM systems:</b> OOP can also be used in manufacturing and designing applications as it allows people to reduce the efforts involved. For instance, it can be used while designing blueprints and flowcharts. So it makes it possible to produce these flowcharts and blueprint accurately.<br><br>" +
                " "));

    }
}