package com.example.SaziloCoding;

import static com.example.SaziloCoding.R.id.btn_register;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class register extends AppCompatActivity {
    ////id find///
    Button btn_register;
    TextInputLayout email_vr, password_vr, user_vr, phone_vr;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btn_register = findViewById(R.id.btn_register);
        user_vr = findViewById(R.id.et_name);
        email_vr = findViewById(R.id.et_email);
        password_vr = findViewById(R.id.et_password);
        phone_vr = findViewById(R.id.et_repassword);

        firebaseAuth = FirebaseAuth.getInstance();

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String email_ = email_vr.getEditText().getText().toString();
                String username_ = user_vr.getEditText().getText().toString();
                String password_ = password_vr.getEditText().getText().toString();
                String phone_ = phone_vr.getEditText().getText().toString();

                if (!email_.isEmpty()) {
                    email_vr.setError(null);
                    email_vr.setErrorEnabled(false);

                    if (!username_.isEmpty()) {
                        user_vr.setError(null);
                        user_vr.setErrorEnabled(false);

                        if (!password_.isEmpty()) {
                            password_vr.setError(null);
                            password_vr.setErrorEnabled(false);

                            if (!phone_.isEmpty()) {
                                phone_vr.setError(null);
                                phone_vr.setErrorEnabled(false);


                                firebaseDatabase = FirebaseDatabase.getInstance();
                                reference = firebaseDatabase.getReference("datauser");

                                Map<String, String> users = new HashMap<>();
                                String email_s = email_vr.getEditText().getText().toString();
                                String username_s = user_vr.getEditText().getText().toString();
                                String password_s = password_vr.getEditText().getText().toString();
                                String phone_s = phone_vr.getEditText().getText().toString();
                                users.put("uid", firebaseAuth.getUid());
                                users.put("Email", email_s);
                                users.put("Username", username_s);
                                users.put("Password", password_s);
                                users.put("Phone", phone_s);

//                                    reference = FirebaseDatabase.getInstance().getReference("datauser");
                                reference.child(firebaseAuth.getUid()).setValue(users).addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void unused) {
                                        Toast.makeText(register.this, "", Toast.LENGTH_SHORT).show();
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(register.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                });

//                                    users.put("Email",email_s);

                                firebaseAuth.createUserWithEmailAndPassword(email_s, password_s).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if (task.isSuccessful()) {
                                            Toast.makeText(register.this, "Registration successfull", Toast.LENGTH_SHORT).show();
                                            startActivity(new Intent(register.this, dashbord.class));
                                        } else {
                                            Toast.makeText(register.this, "Something went wrong", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                }).addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Toast.makeText(register.this, "" + e.getMessage(), Toast.LENGTH_SHORT).show();
                                    }
                                });
//                                    storingdata storingdata = new storingdata(email_s,username_s,password_s,phone_s);
//                                    reference.child(username_s).setValue(storingdata);
//                                    Toast.makeText(getApplicationContext(),"Register Done",Toast.LENGTH_SHORT).show();
//                                    Intent intent = new Intent(getApplicationContext(),dashbord.class);
//                                    startActivity(intent);
                                finish();


                            } else {
                                phone_vr.setError("Enter your phone nbr");
                            }
                        } else {
                            password_vr.setError("enter password");
                        }
                    } else {
                        user_vr.setError("Enter user name ");
                    }

                } else {
                    email_vr.setError("Enter Email ");

                }


            }
        });


    }
}