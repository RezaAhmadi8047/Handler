package com.example.handler;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

       LinearLayout back1 = findViewById(R.id.back1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                back1.setBackgroundColor(Color.RED);
            }
        },2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                back1.setBackgroundColor(Color.GREEN);
            }
        },4000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                back1.setBackgroundColor(Color.YELLOW);
            }
        },6000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, BtnActivity.class);
                startActivity(intent);
                finish();
            }
        },8000);


    }


}
