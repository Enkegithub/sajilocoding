package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introducing_methods_in_Java_unit_2 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introducing_methods_in_java_unit2);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView s1 =findViewById(R.id.s1);
        s1.setText("A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again. It also provides the easy modification and readability of code, just by adding or removing a chunk of code. The method is executed only when we call or invoke it.\n" +
                "\n" +
                "The most important method in Java is the main() method.");



        TextView s2 = findViewById(R.id.s2);
        s2.setText(Html.fromHtml("<b> Method Signature:</b> Every method has a method signature. It is a part of the method declaration. It includes the method name and parameter list.<br><br>" +
                "<br>" +
                "<b>Access Specifier:</b> Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier:<br><br>" +
                "<br>" +
                "<b>➊Public:</b> The method is accessible by all classes when we use public specifier in our application.<br>" +
                "<b>➋Private:</b> When we use a private access specifier, the method is accessible only in the classes in which it is defined.<br>" +
                "<b>➌Protected:</b> When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.<br><br>" +
                "<b>Default:</b> When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.<br>" +
                "<b>Return Type:</b> Return type is a data type that the method returns. It may have a primitive data type, object, collection, void, etc. If the method does not return anything, we use void keyword.<br>" +
                "<br><br>" +
                "<b>Method Name:</b> It is a unique name that is used to define the name of a method. It must be corresponding to the functionality of the method. Suppose, if we are creating a method for subtraction of two numbers, the method name must be subtraction(). A method is invoked by its name.<br>" +
                "<br><br>" +
                "<b>Parameter List:</b> It is the list of parameters separated by a comma and enclosed in the pair of parentheses. It contains the data type and variable name. If the method has no parameter, left the parentheses blank.<br>" +
                "<br><br>" +
                "<b>Method Body:</b> It is a part of the method declaration. It contains all the actions to be performed. It is enclosed within the pair of curly braces."));



        TextView s3 = findViewById(R.id.s3);
        s3.setText(Html.fromHtml("While defining a method, remember that the method name must be a verb and start with a lowercase letter. If the method name has more than two words, the first name must be a verb followed by adjective or noun. In the multi-word method name, the first letter of each word must be in uppercase except the first word. For example:<br>" +
                "<br><br>" +
                "<b>Single-word method name:</b> sum(), area()<br><br>" +
                "<br>" +
                "<b>Multi-word method name:</b>areaOfCircle(),stringComparison()<br><br>" +
                "<br<br>" +
                "It is also possible that a method has the same name as another method name in the same class, it is known as method overloading."));


        TextView s4 = findViewById(R.id.s4);
        s4.setText(Html.fromHtml("There are two types of methods in Java:<br>" +
                "<br><br>" +
                "Predefined Method<br>" +
                "User-defined Method"));


        TextView s5 = findViewById(R.id.s5);
        s5.setText("In Java, predefined methods are the method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc. When we call any of the predefined methods in our program, a series of codes related to the corresponding method runs in the background that is already stored in the library.\n" +
                "\n" +
                "Each and every predefined method is defined inside a class. Such as print() method is defined in the java.io.PrintStream class. It prints the statement that we write inside the method. For example, print(\"Java\"), it prints Java on the console.\n" +
                "\n" +
                "Let's see an example of the predefined method.");

        TextView s6  = findViewById(R.id.s6);
        s6.setText("public class Demo   \n" +
                "\n" +
                "{ \n" +
                "\n" +
                "public static void main(String[] args)   \n" +
                "\n" +
                "{  \n" +
                "\n" +
                "// using the max() method of Math class  \n" +
                "\n" +
                "System.out.print(\"The maximum number is: \" + Math.max(9,7));  \n" +
                "\n" +
                "} \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "In the above example, we have used three predefined methods main(), print(), and max(). We have used these methods directly without declaration because they are predefined. The print() method is a method of PrintStream class that prints the result on the console. The max() method is a method of the Math class that returns the greater of two numbers.\n" +
                "\n" +
                "In the above method signature, we see that the method signature has access specifier public, non-access modifier static, return type int, method name max(), parameter list (int a, int b). In the above example, instead of defining the method, we have just invoked the method. This is the advantage of a predefined method. It makes programming less complicated.\n" +
                "\n" +
                "Similarly, we can also see the method signature of the print() method.");



        TextView s7 = findViewById(R.id.s7);
        s7.setText("A method that has static keyword is known as static method. In other words, a method that belongs to a class rather than an instance of a class is known as a static method. We can also create a static method by using the keyword static before the method name.\n" +
                "\n" +
                "The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name. The best example of a static method is the main() method.");




        TextView s8 = findViewById(R.id.s8);
        s8.setText("public class Display  \n" +
                "\n" +
                "{  \n" +
                "\n" +
                "public static void main(String[] args)   \n" +
                "\n" +
                "{  \n" +
                "\n" +
                "show();  \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "static void show()   \n" +
                "\n" +
                "{  \n" +
                "\n" +
                "System.out.println(\"It is an example of static method.\");  \n" +
                "\n" +
                "}  \n" +
                "\n" +
                "}  ");


        TextView s9 = findViewById(R.id.s9);
        s9.setText(Html.fromHtml("The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class. Let's see an example of an instance method.<br>" +
                "<br>" +
                "<b>InstanceMethodExample.java</b><br>" +
                "<br>" +
                "public class InstanceMethodExample  <br>" +
                "<br>" +
                "{  <br>" +
                "<br>" +
                "public static void main(String [] args)  <br>" +
                "<br>" +
                "{  <br>" +
                "<br>" +
                "//Creating an object of the class  <br>" +
                "<br>" +
                "InstanceMethodExample obj = new InstanceMethodExample();  <br>" +
                "<br>" +
                "//invoking instance method   <br>" +
                "\n" +
                "System.out.println(\"The sum is: \"+obj.add(12, 13));  <br>" +
                "<br>" +
                "}  <br>" +
                "<br>" +
                "int s;  <br>" +
                "<br>" +
                "//user-defined method because we have not used static keyword  <br>" +
                "<br>" +
                "public int add(int a, int b)  <br>" +
                "<br>" +
                "{  <br>" +
                "<br>" +
                "s = a+b;  <br>" +
                "<br>" +
                "//returning the sum <br>" +
                "<br>" +
                "return s; <br>" +
                "<br>" +
                "}  <br>" +
                "<br>" +
                "}  "));







    }
}