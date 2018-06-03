package com.xpf.rxokhttp;

import android.app.Application;

import com.xpf.http.ApiClient;

/**
 * Created by xpf on 2017/11/7 :)
 * Function:
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化api网络请求
        //OkhttpApiClient.init(this);// http1.0
        ApiClient.getInstance().init(this); // http2.0
    }
}
