package com.xpf.rxokhttp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.anloq.http.Api;
import com.anloq.http.ApiRequestListener;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private TextView tvResult;
    private Button btnGet;
    private Button btnPost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvResult = findViewById(R.id.tvResult);
        btnGet = findViewById(R.id.btnGet);
        btnPost = findViewById(R.id.btnPost);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for (int i = 0; i < 100; i++) {
                    onGet(i);
                }
            }
        });
        btnPost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onPost();
            }
        });
    }

    public void onGet(final int i) {
        String url = "http://m.maoyan.com/movie/list.json?type=hot&offset=0&limit=1000";
        Api.request().get(url, new ApiRequestListener() {
            @Override
            public void onSuccess(String result) {
                Log.e("TAG" + i, "success===" + result);
                tvResult.setText(result);
            }

            @Override
            public void onError(String ex) {
                Log.e("TAG", "error===" + ex);
            }
        });
    }

    public void onPost() {
        String url = "";
        if (!TextUtils.isEmpty(url)) {
            HashMap<String, Object> map = new HashMap<>();
            Api.request().post(url, map, new ApiRequestListener() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "success===" + result);
                    tvResult.setText(result);
                }

                @Override
                public void onError(String ex) {
                    Log.e("TAG", "error===" + ex);
                }
            });
        }
    }
}
