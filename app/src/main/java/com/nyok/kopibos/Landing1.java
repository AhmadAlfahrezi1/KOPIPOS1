package com.nyok.kopibos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;


public class Landing1 extends AppCompatActivity {
    private AppCompatButton btn_getstarted, btn_skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.landing1);

        btn_getstarted = findViewById(R.id.button1);
        btn_skip = findViewById(R.id.button2);

        btn_getstarted.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Landing1.this, Landing2.class);
                startActivity(intent);
            }
        });
        btn_skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Landing1.this, Login.class);
                startActivity(intent);
            }
        });
    }
}