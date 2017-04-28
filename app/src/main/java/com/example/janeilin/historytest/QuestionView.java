package com.example.janeilin.historytest;

import android.widget.TextView;

import com.arellomobile.mvp.MvpView;

/**
 * Created by janeilin on 4/22/17.
 */

public interface QuestionView extends MvpView {

    void showTitle(String title);

    void showQuestion(String question);

    void showAnswerRadio(String a, String b, String c, String d);

    void showAnswerCheck(String a, String b, String c, String d, String e);

    void showAnswerText(String text);


}
