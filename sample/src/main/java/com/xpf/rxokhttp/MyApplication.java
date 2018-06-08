package com.xpf.rxokhttp;

import android.app.Application;

import com.xpf.http.OklaClient;

/**
 * Created by xpf on 2017/11/7 :)
 * Function:
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化 OklaClient
        OklaClient.getInstance().init(this);
    }
}
