# RxOkhttp

RxOkhttp

update on 2017-11-29 : http 2.0


##1.初始化

在Application中：

```
ApiClient.getInstance().init(this);
```

提示：默认已经配置好**HttpDns**域名解析和**https**请求。

##2.请求示例

###2.1 GET请求

```
	Api.request().get(url, new ApiRequestListener() {
            @Override
            public void onSuccess(String result) {
                Log.e("TAG" + i, "success===" + result);
            }

            @Override
            public void onError(String ex) {
                Log.e("TAG", "error===" + ex);
            }
        });
```

###2.2 POST请求

```
	Api.request().post(url, map, new ApiRequestListener() {
                @Override
                public void onSuccess(String result) {
                    Log.e("TAG", "success===" + result);
                }

                @Override
                public void onError(String ex) {
                    Log.e("TAG", "error===" + ex);
                }
            });
```