package com.xpf.library;

import android.content.Context;
import android.util.Log;

import com.alibaba.sdk.android.httpdns.HttpDns;
import com.alibaba.sdk.android.httpdns.HttpDnsService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

import okhttp3.Dns;

/**
 * Created by xpf on 2017/6/6 :)
 * Function:OkHttpDns domain name parser
 */

public class OkHttpDns implements Dns {

    private static final Dns SYSTEM = Dns.SYSTEM;
    private HttpDnsService httpdns; // httpdns 解析服务

    private static OkHttpDns instance = null;

    private OkHttpDns(Context context) {
        this.httpdns = HttpDns.getService(context, "164485");
    }

    public static OkHttpDns getInstance(Context context) {
        if (instance == null) {
            instance = new OkHttpDns(context);
        }
        return instance;
    }

    @Override
    public List<InetAddress> lookup(String hostname) throws UnknownHostException {
        String ip = httpdns.getIpByHost(hostname);
        if (ip != null) {
            List<InetAddress> inetAddresses = Arrays.asList(InetAddress.getAllByName(ip));
            Log.i("XLog", "inetAddresses:" + inetAddresses);
            return inetAddresses;
        }
        return SYSTEM.lookup(hostname);
    }

}
