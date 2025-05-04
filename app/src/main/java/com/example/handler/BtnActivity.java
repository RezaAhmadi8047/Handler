package com.example.handler;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class BtnActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn);

        Button btnGam = findViewById(R.id.btngam);
        Button btnTaghsim = findViewById(R.id.btntagh);
        Button btnzarb = findViewById(R.id.btnzarb);
        Button btnTafrigh = findViewById(R.id.btntaf);

        Intent intent1=new Intent(BtnActivity.this,ShowActivity.class);

        btnGam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent1.putExtra("TXT_button",0);
                startActivity(intent1);
            }
        });
        btnTafrigh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent1.putExtra("TXT_button",1);
                startActivity(intent1);
            }
        });
        btnzarb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent1.putExtra("TXT_button",2);
                startActivity(intent1);
            }
        });
        btnTaghsim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                intent1.putExtra("TXT_button",3);
                startActivity(intent1);
            }
        });


    }

}
