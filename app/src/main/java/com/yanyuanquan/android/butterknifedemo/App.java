package com.yanyuanquan.android.butterknifedemo;

import android.app.Application;

import butterknife.ButterKnife;

/**
 * Created by guider on 16/8/5.
 * Email guider@yeah.net
 * github https://github.com/guider
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ButterKnife.setDebug(true);
    }
}
