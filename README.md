# RxOkhttp

RxOkhttp

update on 2017-11-29 : http 2.0

update on 2018-03-28 : http 2.0 add overload method.


## 1.初始化

在Application中：

```
ApiClient.getInstance().init(this);
```

提示：默认已经配置好**HttpDns**域名解析和**https**请求。

## 2.请求示例

### 2.1 GET请求

```
	Api.request()
		.get(url, new ApiRequestListener() {
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

### 2.2 POST请求

此种方式支持将map键值对传入，内部进行Json序列化转换，只支持简单的数据类型，不支持Value为集合或者数组的情况！

```
	Api.request()
		.post(url, map, new ApiRequestListener() {
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

### 2.3 POST Json String 

此种方式是为了弥补2.2中的缺陷，使用此种方式可以使用第三方框架，如 **Gson** 等，现将Post的内容转换为Json串之后再传入请求网络。

```
	Api.request()
		.post(url, postJson, new ApiRequestListener() {
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