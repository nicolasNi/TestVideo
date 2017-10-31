package com.example.administrator.testvideo.base;

import android.view.View;

import com.hannesdorfmann.mosby3.mvp.MvpActivity;
import com.hannesdorfmann.mosby3.mvp.MvpPresenter;
import com.hannesdorfmann.mosby3.mvp.MvpView;

/**
 * Created by Administrator on 2017/10/30.
 */

public abstract class BaseMvpActivity<v extends MvpView, p extends MvpPresenter<v>> extends MvpActivity<v, p> implements UIInterface, View.OnClickListener{
    /**
     * 处理的View的onclick事件
     */
    @Override
    public void onClick(View v) {
        processClick(v);
    }
}
