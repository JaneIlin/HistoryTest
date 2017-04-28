package com.example.janeilin.historytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class Activity3 extends AppCompatActivity {


    Button next;//02




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        next = (Button) findViewById(R.id.buttonLR);//01


        NextBackListener nextBackListener = new NextBackListener();//05
        next.setOnClickListener(nextBackListener);//06



    }

    class NextBackListener implements Button.OnClickListener {//03

        @Override//04
        public void onClick(View v) {

            int a = v.getId();//объявление новой переменной и присваивание ей id нажатия кноки
            if(a == R.id.buttonLL){//проверяем, нажата ли кнопка LL
                Log.d("click", "LowButton1");

            }
            else
                if(a == R.id.buttonLR){
                    Log.d("click", "LowButton2");
                }

            Intent right;
            right = new Intent(Activity3.this, Activity4.class);
            startActivity(right);

        }
    }





}
