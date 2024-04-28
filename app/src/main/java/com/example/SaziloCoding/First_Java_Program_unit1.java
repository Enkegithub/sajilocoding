package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class First_Java_Program_unit1 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_java_program_unit1);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView h1 = findViewById(R.id.h1);
        h1.setText("In this topic, we will learn how to write the simple program of java. We can write a simple hello java program easily after installing the JDK.\n" +
                "\n" +
                "To create a simple java program, you need to create a class that contains the main method. Let's understand the requirement first.");

        TextView h2 = findViewById(R.id.h2);
        h2.setText("For executing any java program, you need to\n" +
                "\n" +
                "•Install the JDK if you don't have installed it, download the JDK and install it.\n" +
                "•Set path of the jdk/bin directory. \n" +
                "•Create the java program\n" +
                "\n" +
                "Compile and run the java program");

        TextView m2 = findViewById(R.id.m2);
        m2.setText(Html.fromHtml("Let's create the hello java program:<br><br>" +
                "<br><br>" +
                "class Simple{  <br>" +
                "<br><br>" +
                "    public static void main(String args[]){  <br><br>" +
                "<br><br>" +
                "     System.out.println(\"Hello Java\");  <br><br>" +
                "<br><br>" +
                "                    }  <br><br>" +
                "<br><br>" +
                "                     }  <br><br>" +
                "<br><br>" +
                "save this file as Simple.java<br><br>" +
                "<br><br>" +
                "To compile:<br><br>" +
                "<br>" +
                "javac Simple.java<br><br>" +
                "<br>" +
                "To execute:<br><br>" +
                "<br>" +
                "java Simple<br><br>" +
                "<br>" +
                "Output:Hello Java"));

        TextView m3 = findViewById(R.id.m3);
        m3.setText(Html.fromHtml("When we compile Java program using javac tool, java compiler converts the source code into byte code.<br>" +
                "<br>" +
                "Parameters used in First Java Program<br>" +
                "<br>" +
                "Let's see what is the meaning of class, public, static, void, main, String[], System.out.println().<br><br>" +
                "<br>" +
                "<b>•class</b> keyword is used to declare a class in java.<br><br>" +
                "<b>•public</b> keyword is an access modifier which represents visibility. It means it is visible to all.<br><br>" +
                "<b>•static</b> is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main method is executed by the JVM, so it doesn't require to create an object to invoke the main method. So it saves memory.<br><br>" +
                "<b>•void</b> is the return type of the method. It means it doesn't return any value.<br><br>" +
                "main represents the starting point of the program.<br><br>" +
                "<b>•String[]args</b>  is used for command line argument. We will learn it later.<br><br>" +
                "<b>•System.out.println()</b> is used to print statement. Here, System is a class, out is the object of PrintStream class, println() is the method of PrintStream class. We will learn about the internal working of System.out.println statement later.<br><br>" +
                "You can write your programs in normal editor like notepad or you can use any IDE like eclipse, neatbean or any other."));

    }
}