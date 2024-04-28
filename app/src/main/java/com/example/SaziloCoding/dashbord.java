package com.example.SaziloCoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class dashbord extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    DrawerLayout drwerlayout;
    NavigationView nav;
    ImageView Android;
    ImageView java;
    ImageView cplus, c_only;
    CardView py;
    CardView op;
    ImageView deve;
    SwipeRefreshLayout swipeRefreshLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashbord);
//////////////////////////////////////////////////////////////

     swipeRefreshLayout = findViewById(R.id.swipe_refresh);
     swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
         @Override
         public void onRefresh() {
             swipeRefreshLayout.setRefreshing(false);
             Intent intent = new Intent(dashbord.this,dashbord.class);
             startActivity(intent);
             finish();
             Toast.makeText(dashbord.this, "Refreshed", Toast.LENGTH_SHORT).show();

         }


     });



        py = findViewById(R.id.py);
        cplus = findViewById(R.id.cplus);
        java = findViewById(R.id.java);
        Android = findViewById(R.id.Android);
        c_only = findViewById(R.id.c_only);
        op = findViewById(R.id.op);
        deve = findViewById(R.id.deve);


        drwerlayout = findViewById(R.id.drwerlayout);

        nav = findViewById(R.id.nav);
        nav.setNavigationItemSelectedListener(this);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);




        //when user click on image view user can redirect another page which is that subject /////


        py.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(dashbord.this, python.class);
                startActivity(p);

            }
        });

        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(dashbord.this, javarmain.class);
                startActivity(m);
            }
        });

        Android.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(dashbord.this, Android_coming_soon.class);
                startActivity(i);

            }
        });

        cplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(dashbord.this, cplus.class);
                startActivity(c);
            }
        });
        c_only.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(dashbord.this, clanguage.class);
                startActivity(n);
            }
        });

        op.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(dashbord.this, oldpaper.class);
                startActivity(o);
            }
        });

        deve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(dashbord.this, developer_profile.class);
                startActivity(d);
            }
        });


//this code for open menu bar and close
// when user click on 3line menu side layout is open ///////////////////////////////////////////////////////

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drwerlayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drwerlayout.addDrawerListener(toggle);
        toggle.syncState();


//// this is for toggle view
// /////

    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.dashbord_db:
                //Intent n = new Intent(dashbord.this, dashbord.class);
               // startActivity(n);
               // finish();
                break;


            case R.id.feedback:
                Intent intent = new Intent(Intent.ACTION_SENDTO);
                String UriText = "mailto:" +      Uri.encode("nkushwaha028@rku.ac.in") +"?subject="+
                        Uri.encode("Feedback") +"$body="+ Uri.encode("");
                Uri uri = Uri.parse(UriText);
                intent.setData(uri);
                startActivity(Intent.createChooser(intent,"send email"));
                break;



            case R.id.share:

                intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                startActivity(Intent.createChooser(intent,"share via"));
                break;


            case R.id.dfo:
                Intent intentt = new Intent(dashbord.this,developer_profile.class);
                startActivity(intentt);
                break;

            case  R.id.android:
                Intent n = new Intent(dashbord.this,Android_coming_soon.class);
                startActivity(n);
                break;
            case  R.id.javaa:
                Intent m = new Intent(dashbord.this,javarmain.class);
                startActivity(m);
                break;

            case  R.id.Clag:
                Intent z = new Intent(dashbord.this,clanguage.class);
                startActivity(z);
                break;

            case  R.id.pyt:
                Intent x = new Intent(dashbord.this,python.class);
                startActivity(x);
                break;
            case R.id.cp:
                Intent d = new Intent(dashbord.this,cplus.class);
                startActivity(d);
                break;



        }
        drwerlayout.closeDrawer(GravityCompat.START);
        return true;


    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(dashbord.this);
        alertDialog.setTitle("Exit App");
        alertDialog.setMessage("Do you want to exit Sajilo Coding");
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
             finishAffinity();
            }
        });
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.dismiss();
            }
        });
        alertDialog.show();

    }
}