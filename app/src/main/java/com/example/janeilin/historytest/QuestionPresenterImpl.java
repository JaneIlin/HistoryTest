package com.example.janeilin.historytest;

import android.util.Log;

import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by janeilin on 4/22/17.
 */

public class QuestionPresenterImpl extends MvpPresenter<QuestionView> implements QuestionPresenter {

    @Override
    public void onAnswer(int radioId) {
        Log.d("string", "" +radioId);

         if (radioId == 4) {
             Log.d("String", "правильный ответ");
         }else {
             Log.d("String", "неправильный ответ");
         }

    }
}
