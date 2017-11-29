package com.xpf.library;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.Map;

import okhttp3.MediaType;

/**
 * Created by xpf on 2017/10/24 :)
 * Function:build okhttp request.
 */

public class OkhttpFactory {

    /**
     * okhttp get request.
     *
     * @param url
     * @param listener
     */
    public static void get(String url, ApiRequestListener listener) {
        OkHttpUtils
                .get()
                .url(url)
                .build()
                .execute(new MyStringCallback(listener));
    }

    /**
     * okhttp post request.
     *
     * @param url
     * @param map
     * @param listener
     */
    public static void post(String url, Map map, ApiRequestListener listener) {
        OkHttpUtils
                .postString()
                .url(url)
                .content(new Gson().toJson(map))
                .mediaType(MediaType.parse("application/json; charset=utf-8"))
                .build()
                .execute(new MyStringCallback(listener));
    }

}
