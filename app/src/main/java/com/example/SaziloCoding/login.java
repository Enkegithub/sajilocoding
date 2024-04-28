package com.example.SaziloCoding;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

public class login extends AppCompatActivity {
    Button signup,btn_login;
    ProgressDialog mLoadingBar;
    TextInputLayout email_vr , password_vr;
    private FirebaseDatabase firebaseDatabase;
    private FirebaseAuth firebaseAuth;
    private DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mLoadingBar=new ProgressDialog(login.this);
        signup=findViewById(R.id.signup);
        btn_login=findViewById(R.id.btn_login);
        email_vr = findViewById(R.id.email);
        password_vr = findViewById(R.id.password);

        firebaseAuth = FirebaseAuth.getInstance();

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),register.class);
                startActivity(i);
            }
        });





        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(login.this, "clicked on login", Toast.LENGTH_SHORT).show();

                String email_ = email_vr.getEditText().getText().toString();
                String password_ = password_vr.getEditText().getText().toString();

                if(!email_.isEmpty()){
                    email_vr.setError(null);
                    email_vr.setErrorEnabled(false);
                    if (!password_.isEmpty()){
                        password_vr.setError(null);
                        password_vr.setErrorEnabled(false);

                        final String email_data = email_vr.getEditText().getText().toString();
                        final String password_data = password_vr.getEditText().getText().toString();

                        mLoadingBar.setTitle("Login");
                        mLoadingBar.setMessage("Wait For a Second");
                        mLoadingBar.setCanceledOnTouchOutside(false);
                        mLoadingBar.show();

                        firebaseAuth.signInWithEmailAndPassword(email_data,password_data).addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                            @Override
                            public void onSuccess(AuthResult authResult) {

                                reference = FirebaseDatabase.getInstance().getReference("datauser");
                                reference.orderByChild("uid").equalTo(firebaseAuth.getUid()).addListenerForSingleValueEvent(new ValueEventListener() {
                                    @Override
                                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                                        mLoadingBar.dismiss();
                                        Toast.makeText(login.this, "Login successfull", Toast.LENGTH_SHORT).show();
                                       startActivity(new Intent(login.this,dashbord.class));
                                    }

                                    @Override
                                    public void onCancelled(@NonNull DatabaseError error) {
                                        mLoadingBar.dismiss();
                                        Toast.makeText(login.this, ""+ error.getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                });
                            }
                        }).addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                mLoadingBar.dismiss();
                                Toast.makeText(login.this, "Invalid credentials!!!Please try again...", Toast.LENGTH_SHORT).show();
                            }
                        });
                        
/*
                        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
                        DatabaseReference databaseReference = firebaseDatabase.getReference("datauser");

                        Query check_email = databaseReference.orderByChild("email").equalTo(email_data);
                        check_email.addListenerForSingleValueEvent(new ValueEventListener() {
                            @Override
                            public void onDataChange(@NonNull DataSnapshot snapshot) {

                                if (snapshot.exists()){
                                    email_vr.setError(null);
                                    email_vr.setErrorEnabled(false);
                                    String passwordcheck = snapshot.child(email_data).child("password").getValue(String.class);
                                    if (passwordcheck.equals(password_data)){
                                        password_vr.setError(null);
                                        password_vr.setErrorEnabled(false);
                                        Toast.makeText(getApplicationContext(),"login Successfuly",Toast.LENGTH_SHORT).show();
                                        Intent intent = new Intent(getApplicationContext(),dashbord.class);
                                        startActivity(intent);
                                        finish();


                                    }else {
                                        password_vr.setError("wrong password");
                                    }

                                }else {
                                    email_vr.setError("user does not exists");
                                }

                            }

                            @Override
                            public void onCancelled(@NonNull DatabaseError error) {

                            }
                        });
*/


                    }else {
                        password_vr.setError("Enter Your Password");
                    }

                }else {
                    email_vr.setError("Enter Your Email ");


                }


            }
        });


    }
}