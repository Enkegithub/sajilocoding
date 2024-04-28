package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Introduction_unit6 extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction_unit6);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText("A constructor is a special type of member function of a class which initializes objects of a class. In C++, Constructor is automatically called when object(instance of class) create. It is special member function of the class because it does not have any return type.");


        TextView cp0 = findViewById(R.id.cp0);
        cp0.setText("A constructor is different from normal functions in following ways: \n" +
                "\n" +
                "Want to learn from the best curated videos and practice problems, check out the C++ Foundation Course  for Basic to Advanced C++ and C++ STL Course (Links to an external site.)Links to an external site. for foundation plus STL.  To complete your preparation from learning a language to DS Algo and many more,  please refer Complete Interview Preparation Course .\n" +
                "\n" +
                "➤Constructor has same name as the class itself\n" +
                "➤Constructors don’t have return type\n" +
                "➤A constructor is automatically called when an object is created.\n" +
                "➤It must be placed in public section of class.\n" +
                "➤If we do not specify a constructor, C++ compiler generates a default constructor for object (expects no parameters and has an empty body).\n" +
                "Let us understand the types of constructors in C++ by taking a real-world example. Suppose you went to a shop to buy a marker. When you want to buy a marker, what are the options? The first one you go to a shop and say give me a marker. So just saying give me a marker mean that you did not set which brand name and which color, you didn’t mention anything just say you want a marker. So when we said just I want a marker so whatever the frequently sold marker is there in the market or in his shop he will simply hand over that. And this is what a default constructor is! The second method you go to a shop and say I want a marker a red in color and XYZ brand. So you are mentioning this and he will give you that marker. So in this case you have given the parameters. And this is what a parameterized constructor is! Then the third one you go to a shop and say I want a marker like this(a physical marker on your hand). So the shopkeeper will see that marker. Okay, and he will give a new marker for you. So copy of that marker. And that’s what copy constructor is!");
    }
}