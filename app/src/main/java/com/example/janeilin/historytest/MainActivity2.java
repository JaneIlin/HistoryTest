package com.example.janeilin.historytest;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity2 extends AppCompatActivity {

    RadioGroup answer;//(1 шаг)объявление переменной класса EditText и наречение оной
    Button ok;//02




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answer = (RadioGroup) findViewById(R.id.answer);//(2 шаг)привязываю объект к своей переменной (с помощью id)
        ok = (Button) findViewById(R.id.buttonLR);//01


       AnswerListener answerListener = new AnswerListener();//5 шаг Создание новой переменной
        answer.setOnCheckedChangeListener(answerListener);// (6 шаг) передала радио группе ansver объект
        // реагирующий на действие - ansverLictener

        OkListener okListener = new OkListener();//05
        ok.setOnClickListener(okListener);//06



    }

    class OkListener implements Button.OnClickListener {//03

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

            //Intent right;
           // right = new Intent(MainActivity.this, MainActivity.class);
            //startActivity(right);

        }
    }


    class AnswerListener implements RadioGroup.OnCheckedChangeListener{//(3 шаг) создаю класс, реализующий интерфес
        @Override
        public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {//(4 шаг) выбираю метод (alt enter)
            Log.d("AListener", "message");


            Intent right;
            right = new Intent(MainActivity2.this, SecondActiviti.class);
            //right.putExtra()
            startActivity(right);

        }




    }


}
