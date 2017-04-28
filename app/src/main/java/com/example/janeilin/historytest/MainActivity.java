package com.example.janeilin.historytest;


import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements QuestionView {

    @InjectPresenter
    public QuestionPresenterImpl presenter;

    private TextView title;
    private TextView question;
    private RadioGroup answerRadio;
    private LinearLayout answerCheck;
    private RadioButton button1;
    private RadioButton button2;
    private RadioButton button3;
    private RadioButton button4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView)findViewById(R.id.title);
        //title.setText("Вопрос 1");
        question = (TextView)findViewById(R.id.question);
        //question.setVisibility(View.VISIBLE);
        answerRadio = (RadioGroup)findViewById(R.id.r_group);

        answerCheck = (LinearLayout)findViewById(R.id.check);

        button1 = (RadioButton)findViewById(R.id.button1);
        button2 = (RadioButton)findViewById(R.id.button2);
        button3 = (RadioButton)findViewById(R.id.button3);
        button4 = (RadioButton)findViewById(R.id.button4);

        answerRadio.setOnCheckedChangeListener(new MyCheckedChangedListener());



    }

    class MyCheckedChangedListener implements RadioGroup.OnCheckedChangeListener {
        @Override
        public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

            if (checkedId == R.id.button1) {
                presenter.onAnswer(1);
            }

            if (checkedId == R.id.button2) {
                presenter.onAnswer(2);
            }

            if (checkedId == R.id.button3) {
                presenter.onAnswer(3);
            }

            if (checkedId == R.id.button4){
                presenter.onAnswer(4);
            }

        }
    }


    @Override
    public void showTitle(String title) {
        this.title.setText(title);
    }

    @Override
    public void showQuestion(String question) {
        this.question.setText(question);

    }

    @Override
    public void showAnswerRadio(String a, String b, String c, String d) {
        answerRadio.clearCheck();

        button1.setText(a);
        button2.setText(b);
        button3.setText(c);
        button4.setText(d);

    }




    @Override
    public void showAnswerCheck(String a, String b, String c, String d, String e) {


    }

    @Override
    public void showAnswerText(String text) {

    }
}
