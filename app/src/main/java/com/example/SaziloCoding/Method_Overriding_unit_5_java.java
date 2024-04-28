package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Method_Overriding_unit_5_java extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_overriding_unit5_java);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView e0 = findViewById(R.id.e0);
        e0.setText("If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java.\n" +
                "\n" +
                "In other words, If a subclass provides the specific implementation of the method that has been declared by one of its parent class, it is known as method overriding.");


        TextView s4 = findViewById(R.id.s4);
        s4.setText(". Method overriding is used to provide the specific implementation of a method which is already provided by its superclass.\n" +
                ". Method overriding is used for runtime polymorphism");


        TextView s5 =findViewById(R.id.s5);
        s5.setText("1. The method must have the same name as in the parent class\n" +
                "2. The method must have the same parameter as in the parent class.\n" +
                "3. There must be an IS-A relationship (inheritance).");


        TextView s6 = findViewById(R.id.s6);
        s6.setText("Let's understand the problem that we may face in the program if we don't use method overriding.\n" +
                "\n" +
                "1. //Here, we are calling the method of parent class with child  \n" +
                "2. //Creating a parent class  \n" +
                "3. void run(){System.out.println(\"Vehicle is running\");}  \n" +
                "4. //Creating a child class  \n" +
                "5. public static void main(String args[]){  \n" +
                "6. Bike obj = new Bike();  \n" +
                "7. obj.run();  \n" +
                "8. }  \n\n" +
                "Output:\n" +
                "\n" +
                "Vehicle is running\n /n" +
                "Problem is that I have to provide a specific implementation of run() method in subclass that is why we use method overriding.");

        TextView s7 = findViewById(R.id.s7);
        s7.setText("In this example, we have defined the run method in the subclass as defined in the parent class but it has some specific implementation. The name and parameter of the method are the same, and there is IS-A relationship between the classes, so there is method overriding.\n" +
                "\n" +
                "1. //Creating a parent class.  \n" +
                "2. //defining a method  \n" +
                "3. }  \n" +
                "4. class Bike2 extends Vehicle{  \n" +
                "5. void run(){System.out.println(\"Bike is running safely\");}  \n" +
                "6. public static void main(String args[]){  \n" +
                "7. obj.run();//calling method  \n" +
                "8. }  \n" +
                "Output:\n" +
                "\n" +
                "Bike is running safely");


        TextView e1 = findViewById(R.id.e1);
        e1.setText("Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest.");




        TextView e2 = findViewById(R.id.e2);
        e2.setText("Java method overriding is mostly used in Runtime Polymorphism which we will learn in next pages.\n" +
                "1. //where three classes are overriding the method of a parent class.  \n" +
                "2. class Bank{  \n" +
                "3. }  \n" +
                "4. class SBI extends Bank{  \n" +
                "5.}  \n" +
                "6. class ICICI extends Bank{  \n" +
                "7. }  \n" +
                "8. int getRateOfInterest(){return 9;}  \n" +
                "9. //Test class to create objects and call the methods  \n" +
                "10. public static void main(String args[]){  \n" +
                "11. ICICI i=new ICICI();  \n" +
                "12. System.out.println(\"SBI Rate of Interest: \"+s.getRateOfInterest());  \n" +
                "13. System.out.println(\"AXIS Rate of Interest: \"+a.getRateOfInterest());  \n" +
                "14. }  \n\n" +
                "Output:\n" +
                "SBI Rate of Interest: 8\n" +
                "ICICI Rate of Interest: 7\n" +
                "AXIS Rate of Interest: 9");
    }
}