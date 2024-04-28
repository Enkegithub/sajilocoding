package com.example.SaziloCoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;

public class oldpaper extends AppCompatActivity {
    private WebView webView;
TextView textView;
ImageView backbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oldpaper);

        backbtn=findViewById(R.id.backbtn);
        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        TextView s5 = findViewById(R.id.s5);
        String text = "<p><a href=\"https://drive.google.com/drive/folders/1dDu4hMzOdHhZMcTR_6i1N-54rfTq4t1p?usp=share_link\">Click here </a> </p>";
        s5.setText(Html.fromHtml(text));
        s5.setMovementMethod(LinkMovementMethod.getInstance());
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://drive.google.com/drive/folders/1dDu4hMzOdHhZMcTR_6i1N-54rfTq4t1p?usp=share_link/");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

    }
}