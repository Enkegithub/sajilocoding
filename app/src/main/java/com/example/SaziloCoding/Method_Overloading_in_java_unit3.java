package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Method_Overloading_in_java_unit3 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_overloading_in_java_unit3);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView s0 =findViewById(R.id.s0);
        s0.setText("Understanding the problem without method overriding\n\n" +
                "1.Can we override the static method\n" +
                "2.Method overloading vs. method overriding\n" +
                "3.If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.\n" +
                "\n" +
                "In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.");

        TextView s1 = findViewById(R.id.s1);
        s1.setText("➊ Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.\n" +
                "➋Method overriding is used for runtime polymorphism");

        TextView n = findViewById(R.id.n);
        n.setText("1.The method must have the same name as in the parent class\n" +
                "2.The method must have the same parameter as in the parent class.\n" +
                "3.There must be an IS-A relationship (inheritance).");

        TextView n0 = findViewById(R.id.n0);
        n0.setText(Html.fromHtml("Let's understand the problem that we may face in the program if we don't use method overriding.<br><br>" +
                "<br>" +
                "1.//Here, we are calling the method of parent class with child  <br>" +
                "2.//Creating a parent class <br>" +
                "3.void run(){System.out.println(\"Vehicle is running\");}  <br>" +
                "4.//Creating a child class  <br>" +
                "5.public static void main(String args[]){  <br>" +
                "6.Bike obj = new Bike();  <br>" +
                "6.obj.run();  <br>" +
                "} <br><br>" +
                "<b>Output:</b><br>" +
                "<br>" +
                "Vehicle is running<br><br>" +
                "Problem is that I have to provide a specific implementation of run() method in subclass that is why we use method overriding."));



        TextView s2 = findViewById(R.id.s2);
        s2.setText(Html.fromHtml("In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation. The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding.<br>" +
                "<br>" +
                "//Creating a parent class.  <br>" +
                "  //defining a method  <br>" +
                "}  <br>" +
                "class Bike2 extends Vehicle{  <br>" +
                "  void run(){System.out.println(\"Bike is running safely\");}  <br>" +
                "  public static void main(String args[]){  <br>" +
                "  obj.run();//calling method  <br><br>" +
                "}  " +
                " Output:<br>" +
                "<br>" +
                "Bike is running safely "));

        TextView s3 = findViewById(R.id.s3);
        s3.setText(Html.fromHtml("Java method overriding is mostly used in Runtime Polymorphism which we will learn in next pages.<br><br>" +
                "1. //where three classes are overriding the method of a parent class.  <br>" +
                "2. class Bank{  <br>" +
                "3. }  <br>" +
                "4. class SBI extends Bank{  <br>" +
                "5. }  <br>" +
                "6. class ICICI extends Bank{  <br>" +
                "7. }  <br>" +
                "8. int getRateOfInterest(){return 9;}  <br>" +
                "9. //Test class to create objects and call the methods  <br>" +
                "10. public static void main(String args[]){ <br>" +
                "11. ICICI i=new ICICI();  <br>" +
                "12. System.out.println(\"SBI Rate of Interest: \"+s.getRateOfInterest());  <br>" +
                "13. System.out.println(\"AXIS Rate of Interest: \"+a.getRateOfInterest());  <br>" +
                "14. }  <br><br>" +
                "Output:<br>" +
                "SBI Rate of Interest: 8<br>" +
                "ICICI Rate of Interest: 7<br>" +
                "AXIS Rate of Interest: 9<br><br>" +
                "<b>Can we override static method?</b><br>" +
                "No, a static method cannot be overridden. It can be proved by runtime polymorphism, so we will learn it later."));




    }
}