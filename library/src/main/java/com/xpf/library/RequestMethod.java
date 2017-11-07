package com.xpf.library;

import java.util.HashMap;

/**
 * Created by xpf on 2017/9/22 :)
 * Function:post and get method
 */

public class RequestMethod {

    public RequestMethod() {
    }

    /**
     * post
     *
     * @param url
     * @param map
     * @param listener
     */
    public void post(String url, HashMap map, final ApiRequestListener listener) {
        OkhttpFactory.post(url, map, listener);
    }

    /**
     * get
     *
     * @param url
     * @param listener
     */
    public void get(String url, ApiRequestListener listener) {
        OkhttpFactory.get(url, listener);
    }

}
