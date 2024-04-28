package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Static_keyword_in_java extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_keyword_in_java);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView s0 =findViewById(R.id.s0);
        s0.setText(Html.fromHtml("1.Static variable<br>" +
                "2.Program of the counter without static variable<br>" +
                "3.Program of the counter with static variable<br>" +
                "4.Static method<br>" +
                "5.Restrictions for the static method<br>" +
                "6.Why is the main method static?<br>" +
                "7.Static block<br>" +
                "8.Can we execute a program without main method?<br><br>" +
                "The static keyword in Java is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested classes. The static keyword belongs to the class than an instance of the class.<br>" +
                "<br>" +
                "The static can be:<br>" +
                "<br>" +
                "1.Variable (also known as a class variable)<br>" +
                "2.Method (also known as a class method)<br>" +
                "3.Block<br>" +
                "4.Nested class"));

        TextView n =findViewById(R.id.n);
        n.setText("It makes your program memory efficient (i.e., it saves memory).\n" +
                "\n" +
                "Understanding the problem without static variable\n"+
                "\n"+
                "1. int rollno;  \n" +
                "2. String college=\"ITS\";  \n\n" +
                "Suppose there are 500 students in my college, now all instance data members will get memory each time when the object is created. All students have its unique rollno and name, so instance data member is good in such case. Here, \"college\" refers to the common property of all objects. If we make it static, this field will get the memory only once.");

        TextView s1 =findViewById(R.id.s1);
        s1.setText("If you declare any variable as static, it is known as a static variable.\n" +
                "\n" +
                "1. The static variable can be used to refer to the common property of all objects (which is not unique for each object), for example, the company name of employees, college name of students, etc.\n" +
                "2. The static variable gets memory only once in the class area at the time of class loading.");

        TextView n0 = findViewById(R.id.n0);
        n0.setText(Html.fromHtml("1.class Student{  <br>" +
                "2.String name;  <br>" +
                "3.//constructor  <br>" +
                "4.rollno = r;  <br>" +
                "5.}  <br>" +
                "6.void display (){System.out.println(rollno+\" \"+name+\" \"+college);}  <br>" +
                "7.//Test class to show the values of objects  <br>" +
                "8.public static void main(String args[]){  <br>" +
                "9.Student s2 = new Student(222,\"Aryan\");  <br>" +
                "10.//Student.college=\"BBDIT\";  <br>" +
                "11.s2.display();  <br>" +
                "12.}  <br><br>" +
                "<b>Output:</b><br>" +
                "<br>" +
                "111 Karan ITS<br>" +
                "222 Aryan ITS"));

        TextView s2 = findViewById(R.id.s2);
        s2.setText("If you apply static keyword with any method, it is known as static method.\n" +
                "\n" +
                "• A static method belongs to the class rather than the object of a class.\n" +
                "• A static method can be invoked without the need for creating an instance of a class.\n" +
                "• A static method can access static data member and can change the value of it.");

        TextView l = findViewById(R.id.l);
        l.setText("1.class Student{  \n" +
                "2. String name;  \n" +
                "3.//static method to change the value of static variable  \n" +
                "4.college = \"BBDIT\";  \n" +
                "5.//constructor to initialize the variable  \n" +
                "6.rollno = r;  \n" +
                "7.}  \n" +
                "8.void display(){System.out.println(rollno+\" \"+name+\" \"+college);}  \n" +
                "9.//Test class to create and display the values of object  \n" +
                "10. public static void main(String args[]){  \n" +
                "11.//creating objects  \n" +
                "12.Student s2 = new Student(222,\"Aryan\");  \n" +
                "13.//calling display method  \n" +
                "14.s2.display();  \n" +
                "15.}  \n\n" +
                "Output:111 Karan BBDIT\n" +
                "       222 Aryan BBDIT\n" +
                "       333 Sonoo BBDIT");

        TextView l1 = findViewById(R.id.l1);
        l1.setText("•Is used to initialize the static data member.\n" +
                "•It is executed before the main method at the time of class loading.");

        TextView l0 = findViewById(R.id.l0);
        l0.setText("1.static{System.out.println(\"static block is invoked\");}  \n" +
                "2.System.out.println(\"Hello main\");  \n" +
                "3.}  \n\n" +
                "Output:static block is invoked\n" +
                "       Hello main");


    }
}