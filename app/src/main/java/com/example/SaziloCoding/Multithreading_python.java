package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Multithreading_python extends AppCompatActivity {
    ImageView backbtn;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multithreading_python);

        backbtn = findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        TextView t1 = findViewById(R.id.t1);
        t1.setText("Multithreading is a way of achieving parallelism in programming by dividing a program into smaller concurrent threads of execution that can run simultaneously on multiple CPU cores. Python provides a built-in threading module that allows developers to create and manage threads in their programs. In this answer, we will discuss multithreading in Python and its various aspects.");


        TextView text5 = findViewById(R.id.text5);
        text5.setText("import threading\n" +
                "\n" +
                "def my_thread_function():\n" +
                "    print(\"This is my thread.\")\n" +
                "\n" +
                "my_thread = threading.Thread(target=my_thread_function)\n" +
                "my_thread.start()\n");


        TextView m1 = findViewById(R.id.m1);
        m1.setText("In this example, we define a function called my_thread_function that will be executed in a separate thread. We then create a new Thread object and pass our function as the target parameter. Finally, we call the start method on the Thread object to start the thread.");



        TextView n1 = findViewById(R.id.n1);
        n1.setText("When multiple threads are executing in a program, it's important to ensure that they don't interfere with each other. One way to achieve this is through synchronization.\n" +
                "\n" +
                "Python provides several synchronization mechanisms, including locks, semaphores, and barriers. These mechanisms can be used to ensure that only one thread can access a particular resource at a time or to coordinate the execution of multiple threads.\n" +
                "\n" +
                "Here's an example of using a lock to synchronize access to a shared resource:");

        TextView text7 = findViewById(R.id.text7);
        text7.setText("import threading\n" +
                "\n" +
                "my_lock = threading.Lock()\n" +
                "\n" +
                "def my_thread_function():\n" +
                "    with my_lock:\n" +
                "        # access the shared resource here\n" +
                "        pass\n");


        TextView na2 = findViewById(R.id.na2);
        na2.setText("In this example, we create a Lock object called my_lock. Inside our thread function, we use a with statement to acquire the lock before accessing the shared resource. This ensures that only one thread can access the resource at a time.");




        TextView h2 = findViewById(R.id.h2);
        h2.setText("Creating and managing threads can be expensive, so it's often a good idea to use a thread pool to reuse threads instead of creating new ones for every task.\n" +
                "\n" +
                "Python's ThreadPoolExecutor class provides a simple way to create and manage a pool of threads:");

        TextView text8 = findViewById(R.id.text8);
        text8.setText("import concurrent.futures\n" +
                "\n" +
                "def my_task():\n" +
                "    # do some work here\n" +
                "    pass\n" +
                "\n" +
                "with concurrent.futures.ThreadPoolExecutor(max_workers=4) as executor:\n" +
                "    futures = []\n" +
                "    for i in range(10):\n" +
                "        futures.append(executor.submit(my_task))\n" +
                "    for future in concurrent.futures.as_completed(futures):\n" +
                "        # handle the completed futures here\n" +
                "        pass\n");

        TextView nr = findViewById(R.id.nr);
        nr.setText("In this example, we create a ThreadPoolExecutor object with a maximum of four worker threads. We then submit ten tasks to the executor using the submit method, which returns a Future object for each task. Finally, we use the as_completed function to iterate over the completed futures and handle their results.");



        TextView h3 = findViewById(R.id.h3);
        h3.setText("Multithreading in Python allows you to write concurrent programs that can take advantage of multiple CPU cores. Python's built-in threading module provides a simple way to create and manage threads, and synchronization mechanisms like locks and semaphores can be used to coordinate their execution. Thread pooling with the ThreadPoolExecutor class can help you reuse threads and avoid the overhead of creating and managing them manually.");
    }
}