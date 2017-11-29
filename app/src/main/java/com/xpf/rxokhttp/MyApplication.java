package com.xpf.rxokhttp;

import android.app.Application;

<<<<<<< HEAD
import com.anloq.http.ApiClient;
=======
import com.xpf.library.OkhttpApiClient;
>>>>>>> a07180009b99e23c2cb2eca9698d332e04c5a1e2

/**
 * Created by xpf on 2017/11/7 :)
 * Function:
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
<<<<<<< HEAD

        // 初始化api网络请求
        //OkhttpApiClient.init(this);// http1.0
        ApiClient.getInstance().init(this); // http2.0
=======
        // 初始化api网络请求
        OkhttpApiClient.init(this);
>>>>>>> a07180009b99e23c2cb2eca9698d332e04c5a1e2
    }
}
