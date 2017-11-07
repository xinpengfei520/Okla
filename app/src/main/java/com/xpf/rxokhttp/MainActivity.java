package com.xpf.rxokhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.xpf.library.ApiRequest;
import com.xpf.library.ApiRequestListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void onGet(View v) {
        String url = "http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";
        ApiRequest
                .getInstance()
                .get(url, new ApiRequestListener() {
                    @Override
                    public void success(String s) {
                        Log.e("TAG", "success===" + s);
                        tvResult.setText(s);
                    }

                    @Override
                    public void error(String s) {
                        Log.e("TAG", "error===" + s);
                    }
                });
    }

    public void onPost(View v) {
        String url = "";
        HashMap map = new HashMap();
        ApiRequest
                .getInstance()
                .post(url, map, new ApiRequestListener() {
                    @Override
                    public void success(String s) {
                        Log.e("TAG", "success===" + s);
                        tvResult.setText(s);
                    }

                    @Override
                    public void error(String s) {
                        Log.e("TAG", "error===" + s);
                    }
                });
    }
}
