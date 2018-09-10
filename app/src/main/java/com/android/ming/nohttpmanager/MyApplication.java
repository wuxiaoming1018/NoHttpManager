package com.android.ming.nohttpmanager;

import android.app.Application;

import com.yanzhenjie.nohttp.NoHttp;
import com.yanzhenjie.nohttp.OkHttpNetworkExecutor;
import com.yanzhenjie.nohttp.rest.RequestQueue;

public class MyApplication extends Application {

    //请求队列
    private static RequestQueue mRequestQueue;

    private static RequestQueue getRequestQueue() {
        return mRequestQueue;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        NoHttp.initialize(this, new NoHttp.Config()
                .setNetworkExecutor(new OkHttpNetworkExecutor())
                .setConnectTimeout(8000));
        mRequestQueue = NoHttp.newRequestQueue();
    }
}
