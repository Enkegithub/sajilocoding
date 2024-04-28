package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Unit_1_Introduction_java extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1_introduction_java);

        backbtn= findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView h1 = findViewById(R.id.h1);
        h1.setText(Html.fromHtml("Java is a <b> programming language </b> and a <b>platform</b>."
                + "<br><br>"
                + "Java is a high level, robust, object-oriented and secure programming language."
                + "<br><br>"
                + "Java was developed by Sun Microsystems (which is now the subsidiary of Oracle) in the year 1995."
                + " James Gosling is known as the father of Java. Before Java, its name was Oak."
                + " Since Oak was already a registered company, so James Gosling and his team changed the Oak name to Java."
                + "<br><br>"
                + "<b>Platform:</b> Any hardware or software environment in which a program runs, is known as a platform."
                + " Since Java has a runtime environment (JRE) and API, it is called a platform."));


        TextView h2 = findViewById(R.id.h2);
        h2.setText(Html.fromHtml("According to Sun, 3 billion devices run Java. There are many devices where Java is currently used. Some of them are as follows:<br><br>" +
                "1. Desktop Applications such as acrobat reader, media player, antivirus, etc.<br><br>" +
                "2. Web Applications such as irctc.co.in, javatpoint.com, etc.<br><br>" +
                "3. Enterprise Applications such as banking applications.<br><br>" +
                "4. Mobile<br><br>" +
                "5. Embedded System<br><br>" +
                "6. Smart Card<br><br>" +
                "7. Robotics<br><br>" +
                "8. Games, etc."));


    }
}