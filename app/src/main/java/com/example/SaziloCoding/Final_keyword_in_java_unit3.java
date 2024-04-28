package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Final_keyword_in_java_unit3 extends AppCompatActivity {
    TextView textView;
    ImageView backbtn;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_keyword_in_java_unit3);
        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView s0 = findViewById(R.id.s0);
        s0.setText("The final keyword in java is used to restrict the user. The java final keyword can be used in many context. Final can be:\n" +
                "\n" +
                "1. variable\n" +
                "2. method\n" +
                "3. class\n" +
                "The final keyword can be applied with the variables, a final variable that have no value it is called blank final variable or uninitialized final variable. It can be initialized in the constructor only. The blank final variable can be static also which will be initialized in the static block only. We will have detailed learning of these. Let's first learn the basics of final keyword.");

        TextView n = findViewById(R.id.n);
        n.setText(Html.fromHtml("There is a final variable speedlimit, we are going to change the value of this variable, but It can't be changed because final variable once assigned a value can never be changed.<br>" +
                "<br>" +
                " 1. final int speedlimit=90;//final variable  <br>" +
                "2. speedlimit=400;  <br>" +
                "3. public static void main(String args[]){  <br>" +
                "4. obj.run();  <br>" +
                "5. }//end of class  <br>" +
                "Output:Compile Time Error"));

        TextView s2 = findViewById(R.id.s2);
        s2.setText(Html.fromHtml("  final void run(){System.out.println(\"running\");} <br>" +
                "     <br>" +
                "   void run(){System.out.println(\"running safely with 100kmph\");}  <br>" +
                "   public static void main(String args[]){  <br>" +
                "   honda.run(); <br>" +
                "}  <br>" +
                "Output:Compile Time Error"));

        TextView l1 = findViewById(R.id.l1);
        l1.setText(Html.fromHtml("  <br>" +
                "  void run(){System.out.println(\"running safely with 100kmph\");}  <br>" +
                "  public static void main(String args[]){  <br>" +
                "  honda.run();  <br>" +
                "}  <br>" +
                "Output:Compile Time Error"));

        TextView l0 = findViewById(R.id.l0);
        l0.setText(Html.fromHtml("Ans) Yes, final method is inherited but you cannot override it. For Example:<br>" +
                "<br>" +
                "  final void run(){System.out.println(\"running...\");}  <br>" +
                "class Honda2 extends Bike{  <br>" +
                "    new Honda2().run();  <br>" +
                "}  <br>" +
                "Output:running..."));

    }
}