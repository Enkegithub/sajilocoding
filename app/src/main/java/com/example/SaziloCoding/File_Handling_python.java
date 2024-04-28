package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class File_Handling_python extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_file_handling_python);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });



        TextView t1 = findViewById(R.id.t1);
        t1.setText(Html.fromHtml("File handling in Python refers to the process of working with files, including creating, reading, updating, and deleting them. Python has built-in functions and modules that make file handling easy and efficient. In this answer, I will cover the basics of file handling in Python.<br><br>" +
                "<br>" +
                "<b>Opening a File:</b><br><br>" +
                "To open a file, you can use the built-in function `open()` with the file name and mode. The mode specifies the purpose of opening the file, whether for reading, writing, or appending. The following are the different modes in Python:<br>" +
                "<br><br>" +
                "<b>1.`r`:</b> Read mode - opens the file for reading.<br><br>" +
                "<b>2.`w`:</b> Write mode - opens the file for writing. If the file exists, it truncates the file. If the file does not exist, it creates a new file.<br><br>" +
                "<b>3.`a`:</b> Append mode - opens the file for appending. If the file exists, it adds the new data to the end of the file. If the file does not exist, it creates a new file.<br><br>" +
                "<b>4.`x`:</b> Exclusive mode - opens the file for exclusive creation. If the file already exists, it raises an error.<br><br>" +
                "<b>5.`b`:</b> Binary mode - opens the file in binary mode.<br><br>" +
                "<b>6.`t`:</b> Text mode - opens the file in text mode (default)."));


        TextView text5 = findViewById(R.id.text5);
        text5.setText("file = open(\"example.txt\", \"r\")\n");

        TextView m1 = findViewById(R.id.m1);
        m1.setText("Once you have opened a file, you can read the contents of the file using various methods, such as `read()`, `readline()`, or `readlines()`. The following are some examples: \n" +
                "Example of reading the entire contents of a file:");


        TextView text7 = findViewById(R.id.text7);
        text7.setText("file = open(\"example.txt\", \"r\")\n" +
                "content = file.read()\n" +
                "print(content)\n");

        TextView text8 = findViewById(R.id.text8);
        text8.setText("file = open(\"example.txt\", \"r\")\n" +
                "line = file.readline()\n" +
                "print(line)\n");


        TextView n0 = findViewById(R.id.n0);
        n0.setText("file = open(\"example.txt\", \"r\")\n" +
                "lines = file.readlines()\n" +
                "print(lines)\n");

        TextView n1 = findViewById(R.id.n1);
        n1.setText("To write to a file, you can use the write() method. The following is an example:\n" +
                "\n" +
                "Example of writing to a file:\n");

        TextView n2 = findViewById(R.id.n2);
        n2.setText("file = open(\"example.txt\", \"w\")\n" +
                "file.write(\"This is a new line.\")\n" +
                "file.close()\n");


        TextView h2 = findViewById(R.id.h2);
        h2.setText("To append to a file, you can use the append() method. The following is an example:\n" +
                "\n" +
                "Example of appending to a file:");

        TextView n3 = findViewById(R.id.n3);
        n3.setText("file = open(\"example.txt\", \"a\")\n" +
                "file.write(\"This is a new line.\")\n" +
                "file.close()\n");

        TextView n4 = findViewById(R.id.n4);
        n4.setText("file = open(\"example.txt\", \"r\")\n" +
                "content = file.read()\n" +
                "file.close()\n");
        TextView h3 = findViewById(R.id.h3);
        h3.setText("After you are done working with a file, it is important to close the file using the `close()` method. The following is an example:\n" +
                "\n" +
                "Example of closing a file:");
        TextView h4 = findViewById(R.id.h4);
        h4.setText("It is also possible to use a file object in a with statement, which automatically closes the file when the block inside the with statement is completed.\n" +
                "\n" +
                "Example of using a file object in a with statement:");

        TextView n5 = findViewById(R.id.n5);
        n5.setText("with open(\"example.txt\", \"r\") as file:\n" +
                "    content = file.read()\n");

        TextView h5 = findViewById(R.id.h5);
        h5.setText("To delete a file, you can use the os module in Python. The following is an example:\n" +
                "\n" +
                "Example of deleting a file:");

        TextView n6 = findViewById(R.id.n6);
        n6.setText("import os\n" +
                "os.remove(\"example.txt\")\n");

        TextView h6 = findViewById(R.id.h6);
        h6.setText("In summary, file handling in Python is a powerful tool that enables you to work with files efficiently. By understanding the basics of file handling in Python, you can easily create, read, update, and delete files as needed.");




    }
}