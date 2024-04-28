package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class Packages_and_Interfaces_in_Java_unit_4 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_packages_and_interfaces_in_java_unit4);
        backbtn =findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView s0 = findViewById(R.id.s0);
        s0.setText(Html.fromHtml("A package is a mechanism to group the similar type of classes, interfaces and sub-packages and provide access control.  It organizes classes into single unit.<br>" +
                "In Java already many predefined packages are available, used while programming.<br>" +
                "<b>For example:</b> java.lang, java.io, java.util etc."));

        TextView s1 = findViewById(R.id.s1);
        s1.setText("1. Packages provide code reusability, because a package has group of classes.<br>" +
                "2. It helps in resolving naming collision when multiple packages have classes with the same name.<br>" +
                "3. Package also provides the hiding of class facility. Thus other programs cannot use the classes from hidden package.<br>" +
                "4. Access limitation can be applied with the help of packages.<br>" +
                "5. One package can be defined in another package.");

        TextView n = findViewById(R.id.n);
        n.setText(Html.fromHtml("<b>There are two types of packages available in Java.</b> <br>" +
                "<br>" +
                "<b>1. Built-in packages</b><br>" +
                "Built-in packages are already defined in java API. For example: java.util, java.io, java,lang, java.awt, java.applet, java.net, etc.<br><br>" +
                "<b>2. User defined packages</b><br>" +
                "The package we create according to our need is called user defined package.<br><br>" +
                "Creating a Package<br><br>" +
                "We can create our own package by creating our own classes and interfaces together. The package statement should be declared at the beginning of the program.<br><br>" +
                "Syntax:<br>" +
                "package <packagename>;<br>" +
                "class ClassName<br>" +
                "{<br>" +
                "……..<br>" +
                "……..<br>" +
                "}"));

        TextView n0 = findViewById(R.id.n0);
        n0.setText(Html.fromHtml("<b>// Demo.java</b><br>" +
                "package p1;<br>" +
                "class Demo<br>" +
                "{<br>" +
                "   public void m1()<br>" +
                "   {<br>" +
                "       System.out.println(\"Method m1..\");<br>" +
                "   }<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b>How to compile?</b><br>" +
                "<b>Syntax:</b>  javac –d directory javafilename<br>" +
                "<b>For Example:</b> javac –d . Demo.java<br>" +
                "<br>" +
                "<b>How to run?</b><br>" +
                "<b>To run:</b> java p1.Demo<br>" +
                "<br>" +
                " <font color='#DC8E47'>Example: Program to create and use a user defined ackage in Java.</font><br>" +
                "<b>// Vehicle.java<br></b>" +
                "package vehicles;<br>" +
                "interface Vehicle<br>" +
                "{<br>" +
                "   public void run();<br>" +
                "   public void speed();<br>" +
                "}<br>" +
                "<br>" +
                "<b>//Bike.java</b><br>" +
                "package vehicles;<br>" +
                "public class Bike implements Vehicle<br>" +
                "{<br>" +
                "    public void run()<br>" +
                "   {<br>" +
                "      System.out.println(\"Bike is running.\");<br>" +
                "   }<br>" +
                "   public void speed()<br>" +
                "   {<br>" +
                "      System.out.println(\"Speed of Bike: 50 Km/h\");<br>" +
                "   }<br>" +
                "   public static void main(String args[])<br>" +
                "   {<br>" +
                "      Bike bike = new Bike();<br>" +
                "      bike.run();<br>" +
                "      bike.speed();<br>" +
                "   }<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b>Compile:</b>  <br>" +
                "javac –d . Vehicle.java<br>" +
                "javac –d . Bike.java<br>" +
                "<br>" +
                "<b>Run:</b><br>" +
                "java vehicles.Bike<br>" +
                "<br>" +
                "<b>Output:</b><br>" +
                "Bike is running<br>" +
                "Speed of Bike: 50 Km/h<br>" +
                "The “import” keyword<br>" +
                "The import keyword provides the access to other package classes and interfaces in current packages.<br>" +
                "“import” keyword is used to import built-in and user defined packages in java program.<br>" +
                "<b>There are different 3 ways to access a package from other packages.</b><br>" +
                "<br>" +
                "<b>1. Using full qualified name</b><br>" +
                "Example<br>" +
                "class Demo extends java.util.Scanner<br>" +
                "{<br>" +
                "    //statements<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b>2. import only single class</b><br>" +
                "Example<br>" +
                "import java.util.Scanner;<br>" +
                "class Demo<br>" +
                "{<br>" +
                "      // statements<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b>3. import all classes</b><br>" +
                "Example<br>" +
                "import java.util.*;<br>" +
                "class Demo<br>" +
                "{<br>" +
                "    // statements<br>" +
                "}"));

        TextView s2 = findViewById(R.id.s2);
        s2.setText(Html.fromHtml("1.Interface is similar to a class, but it contains only abstract methods.<br>" +
                "2.By default the variables declared in an interface are public, static and final.<br>" +
                "3.Interface is a mechanism to achieve full abstraction.<br>" +
                "4.An interface does not contain any constructor.<br></br>" +
                "<b><font color='#DC8E47'>Syntax:</b><br></font>" +
                "interface InterfaceName<br>" +
                "{<br>" +
                "   public void method1();<br>" +
                "   public void method2();<br>" +
                "   <type> variableName = value;<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example: Sample of an interface</b></font><br>" +
                "interface Employee<br>" +
                "{<br>" +
                "   static final Id = 101;<br>" +
                "   static final String name = “ABC”;<br>" +
                "   void show();<br>" +
                "   void getSalary(double salary);<br>" +
                "}<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Extending interfaces<br></b></font>" +
                "An interface has to extend another interface as it happens in class. It cannot implement another interface.  <br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example: Sample program for extending interfaces<br></b></font>" +
                "interface Base<br>" +
                "{<br>" +
                "   public void display ();<br>" +
                "}<br>" +
                "interface Derive extends Base<br>" +
                "{<br>" +
                "   public void show ();<br>" +
                "}<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Implementing interfaces<br></b></font>" +
                "1. A class implements an interface. After that, class can perform the specific behavior on an interface.<br>" +
                "2. The implements keyword is used by class to implement an interface.<br><br>" +
                "<b><font color='#DC8E47'>Syntax:<br></b></font>" +
                "class ClassName implements interfacename<br>" +
                "{<br>" +
                "   // body of class<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b>Note:</b> A class can implement more than one interface. Java can achieve multiple inheritances by using interface.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example:  Sample program to implements interface in Java<br></b></font>" +
                "interface Results<br>" +
                "{<br>" +
                "   final static float pi = 3.14f;<br>" +
                "   float areaOf(float l, float b);<br>" +
                "}<br>" +
                "class Rectangle implements Results<br>" +
                "{<br>" +
                "   public float areaOf(float l, float b)<br>" +
                "   {<br>" +
                "       return (l * b);<br>" +
                "   }<br>" +
                "}<br>" +
                "class Square implements Results  <br>" +
                "{<br>" +
                "   public float areaOf(float l, float b)<br>" +
                "   {<br>" +
                "      return (l * l);<br>" +
                "   }<br>" +
                "}<br>" +
                "class Circle implements Results<br>" +
                "{<br>" +
                "   public float areaOf(float r, float b)<br>" +
                "   {<br>" +
                "      return (pi * r * r);<br>" +
                "   }<br>" +
                "}<br>" +
                "public class InterfaceDemo<br>" +
                "{<br>" +
                "   public static void main(String args[])<br>" +
                "   {<br>" +
                "      Rectangle rect = new Rectangle();<br>" +
                "      Square square = new Square();<br>" +
                "      Circle circle = new Circle();<br>" +
                "System.out.println(\"Area of Rectangle:\"+rect.areaOf(20.3f, 28.7f));<br>" +
                "System.out.println(\"Are of square: \"+square.areaOf(10.0f, 10.0f));<br>" +
                "System.out.println(\"Area of Circle: \"+circle.areaOf(5.2f, 0));<br>" +
                "   }<br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<font color='#DC8E47'>Output:<br></font>" +
                "Area of Rectangle: 582.61<br>" +
                "Are of square: 100.0<br>" +
                "Area of Circle: 84.905594<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example: Sample program to implements multiple inheritance<br></b> </font>" +
                "interface Vehicle<br>" +
                "{  <br>" +
                "  void run();  <br>" +
                "}  <br>" +
                "interface Bike extends Vehicle<br>" +
                "{  <br>" +
                "  void stop();  <br>" +
                "}  <br>" +
                "public class Demo implements Bike<br>" +
                "{  <br>" +
                "  public void run()<br>" +
                "  {<br>" +
                "     System.out.println(\"Vehicle is running.\");<br>" +
                "  }  <br>" +
                "  public void stop()<br>" +
                "  {<br>" +
                "     System.out.println(\"Bike is stop.\");<br>" +
                "  }  <br>" +
                "  public static void main(String args[])<br>" +
                "  {  <br>" +
                "     Demo obj = new Demo();  <br>" +
                "     obj.run();  <br>" +
                "     obj.stop();  <br>" +
                "  }  <br>" +
                "}<br>" +
                "<br>" +
                "<br>" +
                "<b>Output:<br></b>" +
                "Vehicle is running.<br>" +
                "Bike is stop.<br>" +
                "<b><font color='#DC8E47'>Marker Interface<br></b></font>" +
                "An interface which does not contain any fields and methods is known as marker or tag interface. It is an empty interface.<br>" +
                "<br>" +
                "<b>For example</b> Serializable, EventListener, MouseListner, Remote, Cloneable etc.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Example:<br></b></font>" +
                "package java.util;<br>" +
                "public interface EventListner<br>" +
                "{<br>" +
                "}"));




    }
}