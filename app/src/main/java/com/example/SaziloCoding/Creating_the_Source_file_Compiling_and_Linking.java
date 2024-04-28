package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Creating_the_Source_file_Compiling_and_Linking extends AppCompatActivity {
ImageView backbtn;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creating_the_source_file_compiling_and_linking);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText(Html.fromHtml("Step 1: Define the problem that you would like to solve<br>" +
                "<br>" +
                "This is the “what” step, where you figure out what problem you are intending to solve. Coming up with the initial idea for what you would like to program can be the easiest step, or the hardest. But conceptually, it is the simplest. All you need is an idea that can be well defined, and you’re ready for the next step.<br>" +
                "<br>" +
                "Here are a few examples:<br>" +
                "<br>" +
                "“I want to write a program that will allow me to enter many numbers, then calculates the average.”<br>" +
                "“I want to write a program that generates a 2d maze and lets the user navigate through it. The user wins if they reach the end.”<br>" +
                "“I want to write a program that reads in a file of stock prices and predicts whether the stock will go up or down.”<br>" +
                "Step 2: Determine how you are going to solve the problem<br>" +
                "<br>" +
                "This is the “how” step, where you determine how you are going to solve the problem you came up with in step 1. It is also the step that is most neglected in software development. The crux of the issue is that there are many ways to solve a problem -- however, some of these solutions are good and some of them are bad. Too often, a programmer will get an idea, sit down, and immediately start coding a solution. This often generates a solution that falls into the bad category.<br>" +
                "<br>" +
                "Typically, good solutions have the following characteristics:<br>" +
                "<br>" +
                "They are straightforward (not overly complicated or confusing).<br>" +
                "They are well documented (especially around any assumptions being made or limitations).<br>" +
                "They are built modularly, so parts can be reused or changed later without impacting other parts of the program.<br>" +
                "They are robust, and can recover or give useful error messages when something unexpected happens.<br>" +
                "Studies have shown that only 20% of a programmer’s time is actually spent writing the initial program. The other 80% is spent on maintenance, which can consist of debugging (removing bugs), updates to cope with changes in the environment (e.g. to run on a new OS version), enhancements (minor changes to improve usability or capability), or internal improvements (to increase reliability or maintainability).<br>" +
                "<br>" +
                "Consequently, it’s worth your time to spend a little extra time up front (before you start coding) thinking about the best way to tackle a problem, what assumptions you are making, and how you might plan for the future, in order to save yourself a lot of time and trouble down the road.<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "Step 3: Write the program<br>" +
                "<br>" +
                "In order to write the program, we need two things: First, we need knowledge of a programming language -- that’s what these tutorials are for! Second, we need a text editor to write and save our written programs. The programs we write using C++ instructions are called source code (often shortened to just code). It’s possible to write a program using any text editor you want, even something as simple as Window’s notepad or Unix’s vi or pico. However, we strongly urge you to use an editor that is designed for programming (called a code editor). Don’t worry if you don’t have one yet. We’ll cover how to install a code editor shortly.<br>" +
                "<br>" +
                "A typical editor designed for coding has a few features that make programming much easier, including:<br>" +
                "<br>" +
                "1) Line numbering. Line numbering is useful when the compiler gives us an error, as a typical compiler error will state: some error code/message, line 64. Without an editor that shows line numbers, finding line 64 can be a real hassle.<br>" +
                "<br>" +
                "2) Syntax highlighting and coloring. Syntax highlighting and coloring changes the color of various parts of your program to make it easier to identify the different components of your program. Here’s an example of a C++ program with both line numbering and syntax highlighting:<br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                " <br>" +
                "<br>" +
                "The examples we show in this tutorial will always have both line numbering and syntax highlighting to make them easier to follow.<br>" +
                "<br>" +
                "3) An unambiguous font. Non-programming fonts often make it hard to distinguish between the number 0 and the letter O, or between the number 1, the letter l (lower case L), and the letter I (upper case i). A good programming font will ensure these symbols are visually differentiated in order to ensure one isn’t accidentally used in place of the other. All code editors should have this enabled by default, but a standard text editor might not.<br>" +
                "<br>" +
                "The programs you write will typically be named something.cpp, where something is replaced with the name of your choosing for the program (e.g. calculator, hi-lo, etc…). The .cpp extension tells the compiler (and you) that this is a C++ source code file that contains C++ instructions. Note that some people use the extension .cc instead of .cpp, but we recommend you use .cpp.<br>" +
                "<br>" +
                "Step 4: Compiling your source code<br>" +
                "<br>" +
                "In order to compile a C++ program, we use a C++ compiler. The C++ compiler sequentially goes through each source code (.cpp) file in your program and does two important tasks:<br>" +
                "<br>" +
                "First, it checks your code to make sure it follows the rules of the C++ language. If it does not, the compiler will give you an error (and the corresponding line number) to help pinpoint what needs fixing. The compilation process will also be aborted until the error is fixed.<br>" +
                "<br>" +
                "Second, it translates your C++ source code into a machine language file called an object file. Object files are typically named name.o or name.obj, where name is the same name as the .cpp file it was produced from.<br>" +
                "<br>" +
                "If your program had 3 .cpp files, the compiler would generate 3 object files:<br>" +
                "<br>" +
                "The compilation process<br>" +
                "C++ compilers are available for many different operating systems. We will discuss installing a compiler shortly, so there is no need to do so now.<br>" +
                "<br>" +
                "Step 5: Linking object files and libraries<br>" +
                "<br>" +
                "After the compiler creates one or more object files, then another program called the linker kicks in. The job of the linker is three fold:<br>" +
                "<br>" +
                "First, to take all the object files generated by the compiler and combine them into a single executable program.<br>" +
                "<br>" +
                "The linking process<br>" +
                "Second, in addition to being able to link object files, the linker also is capable of linking library files. A library file is a collection of precompiled code that has been “packaged up” for reuse in other programs.<br>" +
                "<br>" +
                "The C++ core language is actually fairly small and concise (and you’ll learn much of it in these tutorials). However, C++ also comes with an extensive library called the C++ Standard Library (usually shortened to standard library) that provides additional functionality that you can use in your programs. One of the most commonly used parts of the C++ standard library is the iostream library, which contains functionality for printing text on a monitor and getting keyboard input from a user. Almost every C++ program written utilizes the standard library in some form, so it’s very common for the standard library to get linked into your programs. Most linkers will automatically link in the standard library as soon as you use any part of it, so this generally isn’t something you need to worry about.<br>" +
                "<br>" +
                "You can also optionally link in other libraries. For example, if you were going to write a program that played sounds, you probably would not want to write your own code to read in the sound files from disk, check to ensure they were valid, or figure out how to route the sound data to the operating system or hardware to play through the speaker -- that would be a lot of work! Instead, you’d probably download a library that already knew how to do those things, and use that. We’ll talk about how to link in libraries (and create your own!) in the appendix.<br>" +
                "<br>" +
                "Third, the linker makes sure all cross-file dependencies are resolved properly. For example, if you define something in one .cpp file, and then use it in another .cpp file, the linker connects the two together. If the linker is unable to connect a reference to something with its definition, you’ll get a linker error, and the linking process will abort.<br>" +
                "<br>" +
                "Once the linker is finished linking all the object files and libraries (assuming all goes well), you will have an executable file that you can then run!<br>" +
                "<br>" +
                "teps 6 & 7: Testing and Debugging<br>" +
                "<br>" +
                "You are able to run your executable and see whether it produces the output you were expecting!"));

    }
}