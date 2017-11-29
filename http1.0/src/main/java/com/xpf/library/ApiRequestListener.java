package com.xpf.library;

/**
 * Created by xpf on 2017/9/22 :)
 * Function:
 */

public interface ApiRequestListener {
    void success(String result);

    void error(String ex);
}
