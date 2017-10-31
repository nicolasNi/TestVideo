package com.example.administrator.testvideo;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.testvideo.base.BaseMvpActivity;
import com.example.administrator.testvideo.base.UIInterface;
import com.example.administrator.testvideo.homePage.presenter.MainActivityPresenter;
import com.example.administrator.testvideo.homePage.view.MainActivityView;

public class MainActivity extends BaseMvpActivity<MainActivityView, MainActivityPresenter> implements UIInterface,MainActivityView {
    @NonNull
    @Override
    public MainActivityPresenter createPresenter() {
        return new MainActivityPresenter();
    }

    @Override
    public void processClick(View v) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
