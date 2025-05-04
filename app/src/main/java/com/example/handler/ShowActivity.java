package com.example.handler;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ShowActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        int txt = getIntent().getIntExtra("TXT_button",4);

        TextView num1=findViewById(R.id.txtNum1);
        TextView num2=findViewById(R.id.txtNum2);
        TextView num3=findViewById(R.id.txtNum3);
        TextView txtBtn=findViewById(R.id.txtBtn);

        txtBtn.setText(txt);

        Random random=new Random();
        int number1 = random.nextInt(1000);
        int number2 = random.nextInt(1000);
        num1.setText(String.valueOf(number1));
        num2.setText(String.valueOf(number2));

        switch (txt)
        {
            case 0:
                num3.setText(String.valueOf(number1+number2));
                break;
            case 1:
                num3.setText(String.valueOf(number1-number2));
                break;
            case 2:
                num3.setText(String.valueOf(number1*number2));
                break;
            case 3:
                num3.setText(String.valueOf(number1/number2));
                break;
            default:
                num3.setText("error");
                break;

        }

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                num1.setVisibility(TextView.VISIBLE);
            }
        },2000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                num2.setVisibility(TextView.VISIBLE);
            }
        },4000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                txtBtn.setVisibility(TextView.VISIBLE);
            }
        },6000);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                num3.setVisibility(TextView.VISIBLE);
            }
        },8000);



    }
}
