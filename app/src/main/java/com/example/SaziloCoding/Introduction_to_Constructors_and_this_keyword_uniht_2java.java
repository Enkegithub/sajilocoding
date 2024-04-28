package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_to_Constructors_and_this_keyword_uniht_2java extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_to_constructors_and_this_keyword_uniht2java);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView s0 = findViewById(R.id.s0);
        s0.setText(Html.fromHtml("In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory.<br>" +
                "<br>" +
                "It is a special type of method which is used to initialize the object.<br>" +
                "<br>" +
                "Every time an object is created using the new() keyword, at least one constructor is called.<br>" +
                "<br>" +
                "It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.<br>" +
                "<br>" +
                "There are two types of constructors in Java: no-arg constructor, and parameterized constructor.<br>" +
                "<br>" +
                "<b>Note:</b> It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.<br>" +
                "<br>" +
                " <b><font color='#DC8E47'>Rules for creating Java constructor </font><br><br></b>" +
                "There are two rules defined for the constructor.<br>" +
                "<br>" +
                "1.Constructor name must be the same as its class name<br>" +
                "2.A Constructor must have no explicit return type<br>" +
                "3.A Java constructor cannot be abstract, static, final, and synchronized"));


        TextView s1 = findViewById(R.id.s1);
        s1.setText("There are two types of constructors in Java:\n" +
                "\n" +
                "1. Default constructor (no-arg constructor)\n" +
                "2. Parameterized constructor");


        TextView n = findViewById(R.id.n);
        n.setText("A constructor is called \"Default Constructor\" when it doesn't have any parameter.");

        TextView s2 = findViewById(R.id.s2);
        s2.setText("In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.\n" +
                "\n" +
                "//Java Program to create and call a default constructor  \n" +
                "\n" +
                "class Bike1{  \n" +
                "\n" +
                "//creating a default constructor  \n" +
                "\n" +
                "Bike1(){System.out.println(\"Bike is created\");}  \n" +
                "\n" +
                "//main method  \n" +
                "\n" +
                "public static void main(String args[]){  \n" +
                "\n" +
                "//calling a default constructor  \n" +
                "\n" +
                "Bike1 b=new Bike1();  \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "Rule: If there is no constructor in a class, compiler automatically creates a default constructor.");


        TextView s3 =findViewById(R.id.s3);
        s3.setText("//Let us see another example of default constructor  \n" +
                "\n" +
                "//which displays the default values  \n" +
                "\n" +
                "class Student3{  \n" +
                "\n" +
                "int id;  \n" +
                "\n" +
                "String name;  \n" +
                "\n" +
                "//method to display the value of id and name  \n" +
                "\n" +
                "void display(){System.out.println(id+\" \"+name);}    \n" +
                "\n" +
                "public static void main(String args[]){  \n" +
                "\n" +
                "//creating objects  \n" +
                "\n" +
                "Student3 s1=new Student3();  \n" +
                "\n" +
                "Student3 s2=new Student3();  \n" +
                "\n" +
                "//displaying values of the object  \n" +
                "\n" +
                "s1.display();  \n" +
                "\n" +
                "s2.display();  \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "Explanation:In the above class,you are not creating any constructor so compiler provides you a default constructor. Here 0 and null values are provided by default constructor.");


             TextView s5 = findViewById(R.id.s5);
             s5.setText(Html.fromHtml("A constructor which has a specific number of parameters is called a parameterized constructor.<br>" +
                     "<br>" +
                     "<b>Why use the parameterized constructor?</b><br>" +
                     "The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also."));

              TextView s6 =findViewById(R.id.s6);
              s6.setText("In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.\n" +
                      "\n" +
                      "//Java Program to demonstrate the use of the parameterized constructor.  \n" +
                      "\n" +
                      "class Student4{  \n" +
                      "\n" +
                      "    int id;  \n" +
                      "\n" +
                      "    String name;  \n" +
                      "\n" +
                      "    //creating a parameterized constructor  \n" +
                      "\n" +
                      "    Student4(int i,String n){  \n" +
                      "\n" +
                      "    id = i;  \n" +
                      "\n" +
                      "    name = n; \n" +
                      "\n" +
                      "    }  \n" +
                      "\n" +
                      "    //method to display the values  \n" +
                      "\n" +
                      "    void display(){System.out.println(id+\" \"+name);}     \n" +
                      "\n" +
                      "    public static void main(String args[]){  \n" +
                      "\n" +
                      "    //creating objects and passing values  \n" +
                      "\n" +
                      "    Student4 s1 = new Student4(111,\"Karan\");  \n" +
                      "\n" +
                      "    Student4 s2 = new Student4(222,\"Aryan\");  \n" +
                      "\n" +
                      "    //calling method to display the values of object  \n" +
                      "\n" +
                      "    s1.display();      s2.display();  \n" +
                      "\n" +
                      "   }  \n" +
                      "\n" +
                      "}  ");


              TextView s7 = findViewById(R.id.s7);
              s7.setText("In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.\n" +
                      "\n" +
                      "Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.");

              TextView s8 = findViewById(R.id.s8);
              s8.setText("//Java program to overload constructors  \n" +
                      "\n" +
                      "class Student5{  \n" +
                      "\n" +
                      "    int id;  \n" +
                      "\n" +
                      "    String name;  \n" +
                      "\n" +
                      "    int age;  \n" +
                      "\n" +
                      "    //creating two arg constructor  \n" +
                      "\n" +
                      "    Student5(int i,String n){  \n" +
                      "\n" +
                      "    id = i;      name = n;      }  \n" +
                      "\n" +
                      "    //creating three arg constructor  \n" +
                      "\n" +
                      "    Student5(int i,String n,int a){  \n" +
                      "\n" +
                      "    id = i;  \n" +
                      "\n" +
                      "    name = n;  \n" +
                      "\n" +
                      "    age=a;  \n" +
                      "\n" +
                      "    }  \n" +
                      "\n" +
                      "    void display(){System.out.println(id+\" \"+name+\" \"+age);}  \n" +
                      "\n" +
                      "    public static void main(String args[]){  \n" +
                      "\n" +
                      "    Student5 s1 = new Student5(111,\"Karan\");  \n" +
                      "\n" +
                      "    Student5 s2 = new Student5(222,\"Aryan\",25);  \n" +
                      "\n" +
                      "    s1.display();  \n" +
                      "\n" +
                      "    s2.display();     \n" +
                      "\n" +
                      "}  \n" +
                      "\n" +
                      "}  ");




              TextView s10 = findViewById(R.id.s10);
              s10.setText("There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.\n" +
                      "\n" +
                      "There are many ways to copy the values of one object into another in Java. They are:\n" +
                      "\n" +
                      ".By constructor\n" +
                      ".By assigning the values of one object into another\n" +
                      ".By clone() method of Object class\n" +
                      "In this example, we are going to copy the values of one object into another using Java constructor.");

              TextView s11 = findViewById(R.id.s11);
              s11.setText("//Java program to initialize the values from one object to another object.  \n" +
                      "\n" +
                      "class Student6{  \n" +
                      "\n" +
                      "    int id;  \n" +
                      "\n" +
                      "    String name;  \n" +
                      "\n" +
                      "    //constructor to initialize integer and string  \n" +
                      "\n" +
                      "    Student6(int i,String n){  \n" +
                      "\n" +
                      "    id = i;  \n" +
                      "\n" +
                      "    name = n;  \n" +
                      "\n" +
                      "    }  \n" +
                      "\n" +
                      "    //constructor to initialize another object  \n" +
                      "\n" +
                      "    Student6(Student6 s){  \n" +
                      "\n" +
                      "    id = s.id;  \n" +
                      "\n" +
                      "    name =s.name;  \n" +
                      "\n" +
                      "    }  \n" +
                      "\n" +
                      "    void display(){System.out.println(id+\" \"+name);}  \n" +
                      "\n" +
                      "       public static void main(String args[]){  \n" +
                      "\n" +
                      "       Student6 s1 = new Student6(111,\"Karan\");  \n" +
                      "\n" +
                      "       Student6 s2 = new Student6(s1);  \n" +
                      "\n" +
                      "       s1.display();  \n" +
                      "\n" +
                      "       s2.display();  \n" +
                      "\n" +
                      "}  \n" +
                      "\n" +
                      "}  ");


              TextView s12 = findViewById(R.id.s12);
              s12.setText("We can copy the values of one object into another by assigning the objects values to another object. In this case, there is no need to create the constructor.\n" +
                      "\n" +
                      "class Student7{  \n" +
                      "\n" +
                      "    int id;  \n" +
                      "\n" +
                      "    String name;  \n" +
                      "\n" +
                      "    Student7(int i,String n){  \n" +
                      "\n" +
                      "    id = i;  \n" +
                      "\n" +
                      "    name = n;      } \n" +
                      "\n" +
                      "    Student7(){}  \n" +
                      "\n" +
                      "    void display(){System.out.println(id+\" \"+name);}     \n" +
                      "\n" +
                      "    public static void main(String args[]){  \n" +
                      "\n" +
                      "    Student7 s1 = new Student7(111,\"Karan\");  \n" +
                      "\n" +
                      "    Student7 s2 = new Student7();  \n" +
                      "\n" +
                      "    s2.id=s1.id;  \n" +
                      "\n" +
                      "    s2.name=s1.name;  \n" +
                      "\n" +
                      "    s1.display();  \n" +
                      "\n" +
                      "    s2.display();  \n" +
                      "\n" +
                      "   }  \n" +
                      "\n" +
                      "}  ");

            TextView s13 = findViewById(R.id.s13);
            s13.setText("Here is given the 6 usage of java this keyword.\n" +
                    "\n" +
                    "1.this can be used to refer current class instance variable.\n" +
                    "2.this can be used to invoke current class method (implicitly)\n" +
                    "3.this() can be used to invoke current class constructor.\n" +
                    "4.this can be passed as an argument in the method call.\n" +
                    "5.this can be passed as argument in the constructor call.\n" +
                    "6.this can be used to return the current class instance from the method.\n" +
                    "Suggestion: If you are beginner to java, lookup only three usage of this keyword.");


            TextView s14 = findViewById(R.id.s14);
            s14.setText("The this keyword can be used to refer current class instance variable. If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.\n" +
                    "\n" +
                    "Understanding the problem without this keyword\n" +
                    "Let's understand the problem if we don't use this keyword by the example given below:\n" +
                    "\n" +
                    "class Student{  \n" +
                    "int rollno;  \n" +
                    "\n" +
                    "String name;  \n" +
                    "\n" +
                    "float fee;  \n" +
                    "\n" +
                    "Student(int rollno,String name,float fee){  \n" +
                    "\n" +
                    "rollno=rollno;  \n" +
                    "\n" +
                    "name=name;  \n" +
                    "\n" +
                    "fee=fee;  \n" +
                    "\n" +
                    "}  \n" +
                    "\n" +
                    "void display(){System.out.println(rollno+\" \"+name+\" \"+fee);}  \n" +
                    "\n" +
                    "}  \n" +
                    "\n" +
                    "class TestThis1{  \n" +
                    "\n" +
                    "public static void main(String args[]){  \n" +
                    "\n" +
                    "Student s1=new Student(111,\"ankit\",5000f);  \n" +
                    "\n" +
                    "Student s2=new Student(112,\"sumit\",6000f);  \n" +
                    "\n" +
                    "s1.display();  \n" +
                    "\n" +
                    "s2.display();  \n" +
                    "\n" +
                    "}}  \n" +
                    "\n" +
                    "In the above example, parameters (formal arguments) and instance variables are same. So, we are using this keyword to distinguish local variable and instance variable.\n" +
                    "\n" +
                    "Solution of the above problem by this keyword\n" +
                    "class Student{ \n" +
                    "int rollno; \n" +
                    "String name; \n" +
                    "float fee; \n" +
                    "Student(int rollno,String name,float fee){ \n" +
                    "this.rollno=rollno; \n" +
                    "this.name=name; \n" +
                    "this.fee=fee; \n" +
                    "} \n" +
                    "void display(){System.out.println(rollno+\" \"+name+\" \"+fee);} \n" +
                    "} \n" +
                    "  class TestThis2{ \n" +
                    "public static void main(String args[]){ \n" +
                    "Student s1=new Student(111,\"ankit\",5000f);  Student s2=new Student(112,\"sumit\",6000f); \n" +
                    "s1.display(); \n" +
                    "s2.display(); \n" +
                    "}}  \n" +
                    "If local variables(formal arguments) and instance variables are different, there is no need to use this keyword like in the following program:\n" +
                    "\n" +
                    "Program where this keyword is not required\n" +
                    "class Student{ \n" +
                    "int rollno; \n" +
                    "String name; \n" +
                    "foat fee; \n" +
                    "Student(int r,String n,float f){ \n" +
                    "rollno=r; \n" +
                    "name=n; \n" +
                    "fee=f; \n" +
                    "} \n" +
                    "void display(){System.out.println(rollno+\" \"+name+\" \"+fee);}\n" +
                    "}   \n" +
                    "class TestThis3{ \n" +
                    "public static void main(String args[]){ \n" +
                    "Student s1=new Student(111,\"ankit\",5000f); \n" +
                    "Student s2=new Student(112,\"sumit\",6000f); \n" +
                    "s1.display(); \n" +
                    "s2.display(); \n" +
                    "}}  ");




            TextView s15 = findViewById(R.id.s15);
            s15.setText("1.void m(){System.out.println(\"hello m\");}  \n" +
                    "2.System.out.println(\"hello n\");  \n" +
                    "3.this.m();  \n" +
                    "4.}  \n" +
                    "5.public static void main(String args[]){  \n" +
                    "6.a.n();  ");

            TextView s16 = findViewById(R.id.s16);
            s16.setText(Html.fromHtml("The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor. In other words, it is used for constructor chaining.<br>" +
                    "<br>" +
                    "<b>Calling default constructor from parameterized constructor:</b><br>" +
                    "<br>" +
                    " (Links to an external site.)Links to an external site. (Links to an external site.)Links to an external site. (Links to an external site.)Links to an external site.<br>" +
                    "A(){System.out.println(\"hello a\");}  <br>" +
                    "this();  <br>" +
                    "}  <br>" +
                    "class TestThis5{  <br>" +
                    "A a=new A(10);  "));

    }
}