package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Procedure_Oriented_Programming_unit1_cplush extends AppCompatActivity {

    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_procedure_oriented_programming_unit1_cplush);
        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView o = findViewById(R.id.o);
        o.setText("Procedural Programming may be the first programming paradigm that a new developer will learn. Fundamentally, the procedural code is the one that directly instructs a device on how to finish a task in logical steps. This paradigm uses a linear top-down approach and treats data and procedures as two different entities. Based on the concept of a procedure call, Procedural Programming divides the program into procedures, which are also known as routines or functions, simply containing a series of steps to be carried out.<br>" +
                "<br>" +
                "Simply put, Procedural Programming involves writing down a list of instructions to tell the computer what it should do step-by-step to finish the task at hand.");



        TextView s1 = findViewById(R.id.s1);
        s1.setText(Html.fromHtml("The key features of procedural programming are given below:<br>" +
                "<br>" +
                "<b>.Predefined functions:</b> A predefined function is typically an instruction identified by a name. Usually, the predefined functions are built into higher-level programming languages (Links to an external site.)Links to an external site., but they are derived from the library or the registry, rather than the program. One example of a pre-defined function is ‘charAt()’, which searches for a character position in a string.<br><br>" +
                "<b>.Local Variable:</b> A local variable is a variable that is declared in the main structure of a method and is limited to the local scope it is given. The local variable can only be used in the method it is defined in, and if it were to be used outside the defined method, the code will cease to work.<br><br>" +
                "<b>.Global Variable:</b> A global variable is a variable which is declared outside every other function defined in the code. Due to this, global variables can be used in all functions, unlike a local variable.<br><br>" +
                "<b>.Modularity:</b> Modularity is when two dissimilar systems have two different tasks at hand but are grouped together to conclude a larger task first. Every group of systems then would have its own tasks finished one after the other until all tasks are complete.<br><br>" +
                "<b>.Parameter Passing:</b> Parameter Passing is a mechanism used to pass parameters to functions, subroutines or procedures. Parameter Passing can be done through ‘pass by value’, ‘pass by reference’, ‘pass by result’, ‘pass by value-result’ and ‘pass by the name’."));


       TextView s2 = findViewById(R.id.s2);
       s2.setText("①.Procedural Programming is excellent for general-purpose programming\n \n" +
               "②.The coded simplicity along with ease of implementation of compilers and interpreters\n \n" +
               "③.A large variety of books and online course material available on tested algorithms, making it easier to learn along the way\n \n" +
               "④.The source code is portable, therefore, it can be used to target a different CPU as well\n \n" +
               "⑤.The code can be reused in different parts of the program, without the need to copy it\n \n" +
               "⑥.Through Procedural Programming technique, the memory requirement also slashes\n \n" +
               "⑦.The program flow can be tracked easily");



       TextView o3 = findViewById(R.id.o3);
       o3.setText("①.The program code is harder to write when Procedural Programming is employed\n\n" +
               "②.The Procedural code is often not reusable, which may pose the need to recreate the code if is needed to use in another application\n\n" +
               "③.Difficult to relate with real-world objects\n \n" +
               "④.The importance is given to the operation rather than the data, which might pose issues in some data-sensitive cases\n\n" +
               "⑤.The data is exposed to the whole program, making it not so much security friendly");

       TextView s3 = findViewById(R.id.s3);
       s3.setText("Here is some problems in POP method like its difficult to handling data because it gives no importance to data.Â  Dat means the information that are collected from user and after calculation new result come. If any one is familiar with C programming than he may recollect storage classes in C.Â  In C, data member is declared GLOBAL in order to make 2 or more functions in the program. What happen when 2 or functions on the same data member. For example,Â  when if there are 7 functions in a program and this become a global data member. Unfortunately,Â  if the value of any global data member or that may key element than it will affect the whole program. It is a big problem to identify that which function is causing the problem");



       TextView s5 = findViewById(R.id.s5);
       s5.setText("One of the most important feature of C language is structure. Programmer use integer data, decimal point data(float), array data pack togetherÂ  into single entity by using structure. The reason of the popularity of structure was introduced first by c language.");







    }
}