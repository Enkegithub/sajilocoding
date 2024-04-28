package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Applications_of_C_Language extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_applications_of_clanguage);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText(Html.fromHtml("<b><font color='#DC8E47'>Operating Systems</b></font> <br>" +
                "Be it Microsoft Windows or Mac OSX or Linux - all of them are programmed in C++. C/C++ is the backbone of all the well-known operating systems owing to the fact that it is a strongly typed and a fast programming language which makes it an ideal choice for developing an operating system. Moreover, C is quite close to the assembly language which further helps in writing low-level operating system modules.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Browsers</b></font> </br>" +
                "The rendering engines of various web browsers are programmed in C++ simply because if the speed that it offers. The rendering engines require faster execution to make sure that users don’t have to wait for the content to come up on the screen. As a result, such low-latency systems employ C++ as the programming language.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Libraries</b></font> <br>" +
                "Many high-level libraries use C++ as the core programming language. For instance, several Machine Learning libraries use C++ in the backend because of its speed. Tensorflow, one of the most widely used Machine Learning libraries uses C++ as the backend programming language. Such libraries required high-performance computations because they involve multiplications of huge matrices for the purpose of training Machine Learning models. As a result, performance becomes critical. C++ comes to the rescue in such libraries.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Graphics</b></font> <br>" +
                "All graphics applications require fast rendering and just like the case of web browsers, here also C++ helps in reducing the latency. Software that employ computer vision, digital image processing, high-end graphical processing - they all use C++ as the backend programming language. Even the popular games that are heavy on graphics use C++ as the primary programming language. The speed that C++ offers in such situations helps the developers in expanding the target audience because an optimized application can run even on low-end devices that do not have high computation power available.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Banking Applications</b></font> <br>" +
                "One of the most popularly used core-banking system - Infosys Finacle uses C++ as one of the backend programming languages. Banking applications process millions of transactions on a daily basis and require high concurrency and low latency support. C++ automatically becomes the preferred choice in such applications owing to its speed and multithreading support that is made available through various Standard Template Libraries that come as a part of the C++ programming kit.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Cloud/Distributed Systems</b></font> <br>" +
                "Large organizations that develop cloud storage systems and other distributed systems also use C++ because it connects very well with the hardware and is compatible with a lot of machines. Cloud storage systems use scalable file-systems that work close to the hardware. C++ becomes a preferred choice in such situations because it is close to the hardware and also the multithreading libraries in C++ provide high concurrency and load tolerance which is very much needed in such scenarios.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Databases</b></font> <br>" +
                "Postgres and MySQL - two of the most widely used databases are written in C++ and C, the precursor to C++. These databases are used in almost all of the well-known applications that we all use in our day to day life - Quora, YouTube, etc.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Embedded Systems</b></font> <br>" +
                "Various embedded systems like medical machines, smartwatches, etc. use C++ as the primary programming language because of the fact that C++ is closer to the hardware level as compared to other high-level programming languages.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Telephone Switches</b></font> <br>" +
                "Because of the fact that it is one of the fastest programming languages, C++ is widely used in programming telephone switches, routers, and space probes.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>Compilers</b></font> <br>" +
                "The compilers of various programming languages use C and C++ as the backend programming language. This is because of the fact that both C and C++ are relatively lower level languages and are closer to the hardware and therefore are the ideal choice for such compilation systems. These are a few uses and applications of C++ programming language. Now, let's know more about C++ advantages over other programming languages.<br>" +
                "<br>"));

    }
}