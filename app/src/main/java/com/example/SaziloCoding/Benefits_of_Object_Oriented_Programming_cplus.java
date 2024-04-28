package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Benefits_of_Object_Oriented_Programming_cplus extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_benefits_of_object_oriented_programming_cplus);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView cp0 = findViewById(R.id.cp0);
        String text = " OOP<a href=https://www.educba.com/object-oriented-programming-in-java/><font color='#DC8E47'>object-oriented programming </font></a> is a programming paradigm that is completely based on ‘objects’. A general explanation of ‘object’ for better understanding – Mr A is going to build a POT with the use of BLOCKS. Blocks are a kind of measurement units like height, radius, and shape by default. These properties are there by default, which means if you use a block, it has some dimensions associated with it. Now, some other crucial properties are not yet assigned, like color, material, and price. So, Objects are nothing but POTS. We build an object by assigning values to the properties when we need them. BLOCK is nothing but the templates of the object. There we write how the object should appeal (means look like) and how the actions will take place. In Java, we call it a class. ";
        cp0.setText(Html.fromHtml(text));
        cp0.setMovementMethod(LinkMovementMethod.getInstance());
        cp0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.educba.com/object-oriented-programming-in-java/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });




        TextView cp1 = findViewById(R.id.cp1);
        cp1.setText(Html.fromHtml("Moving to the advantages of OOP, we would like to say that there are many as this is one of the core development approaches which is widely accepted. Let’s see what the advantages of OOP are offers to its users.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>1. Re-usability<br></b></font>" +
                "It means reusing some facilities rather than building them again and again. This is done with the use of a class. We can use it ‘n’ number of times as per our need.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>2. Data Redundancy<br></b></font>" +
                "This is a condition created at the place of data storage (you can say Databases)where the same piece of data is held in two separate places. So the data redundancy is one of the greatest advantages of OOP. If a user wants a similar functionality in multiple classes, he/she can go ahead by writing common class definitions for similar functionalities and inherit them.<br>" +
                "<br>" +
                "<b> <font color='#DC8E47'>3. Code Maintenance<br></b></font>>" +
                "This feature is more of a necessity for any programming languages; it helps users from doing re-work in many ways. It is always easy and time-saving to maintain and modify the existing codes by incorporating new changes into them.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>4. Security<br></b></font> " +
               "With the use of data hiding and abstraction mechanism, we are filtering out limited data to exposure, which means we are maintaining security and providing necessary data to view.<br>" +
                "<br>" +
                " <b><font color='#DC8E47'>5. Design Benefits<br></b></font>" +
                "If you are practicing on OOPs, the design benefit a user will get is in terms of designing and fixing things easily and eliminating the risks (if any). Here the Object-Oriented Programs forces the designers to have a long and extensive design phase, which results in better designs and fewer flaws. After a time when the program has reached some critical limits, it is easier to program all the non-OOP’s one separately.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>6. Better productivity</b></font><br>" +
                "with the above-mentioned facts of using the application definitely enhances its users overall productivity. This leads to more work done, finishing a better program, having more inbuilt features, and easier reading, writing and maintaining. An OOP programmer cans stitch new software objects to make completely new programs. A good number of libraries with useful functions in abundance make it possible.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>7. Easy troubleshootin</b></font>g<br>" +
                "lets witness some common issues or problems any developers face in their work.<br>" +
                "<br>" +
                "•Is this the problem in the widget file?<br>" +
                "•Is the problem is in the WhaleFlumper?<br>" +
                "•Will I have to trudge through that ‘sewage.c’ file?<br>" +
                "•Commenting on all these issues related to code.<br>" +
                "So, many times, something has gone wrong, which later becomes so brainstorming for the developers to look where the error is. Relax! Working with OOP language, you will know where to look for. This is the advantage of using encapsulation  in OOP; all the objects are self-constrained. With this modality behavior, the IT teams get a lot of work benefits as they are now capable of working on multiple projects simultaneously with an advantage that there is no possibility of code duplicity.<br>" +
                "<br>" +
                "<b><font color='#DC8E47'>8. Polymorphism Flexib</b></font>ility<br>" +
                "Let’s see a scenario to better explain this behavior.<br>" +
                "<br>" +
                "You behave in a different way if the place or surrounding gets change. A person will behave like a customer if he is in a market, the same person will behave like a student if he is in a school and as a son/daughter if put in a house. Here we can see that the same person showing different behavior every time the surroundings are changed. This means polymorphism is flexible and helps developers in a number of ways.<br>" +
                "<br>" +
                "•It’s simplicity<br>" +
                "•Extensibility<br>" +
                "<b><font color='#DC8E47'>9. Problems solving<br></b></font>" +
                "Decomposing a complex problem into smaller chunks or discrete components is a good practice. OOP is specialized in this behavior, as it breaks down your software code into bite-sized – one object at a time. The broken components can be reused in solutions to different other problems (both less and more complex), or either they can be replaced by the future modules that relate to the same interface with implementations details.<br>" +
                "<br>" +
                "A general relatable real-time scenario (Links to an external site.)Links to an external site. – at a high level, a car can be decomposed into wheels, engine, and chassis soon. Each of those components can be further broken down into even smaller atomic components like screws and bolts. The engine’s design doesn’t need to know anything about the tires’ size to deliver a certain amount of power (as output) has little to do with each other."));
    }
}