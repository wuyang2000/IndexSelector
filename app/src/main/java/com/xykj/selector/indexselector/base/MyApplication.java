package com.xykj.selector.indexselector.base;

import android.app.Application;

/**
 * Created by WuYang on 2019/8/14.
 */
public class MyApplication extends Application {

    private static MyApplication instance;

    public static synchronized MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
