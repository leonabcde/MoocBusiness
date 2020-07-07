package com.leon.moocbusiness.application;

import android.app.Application;

/**
 * 1、是整个程序的入口，
 * 2、初始化工作
 * 3、为整个应用的其他模块提供上下文
 * 要使用的话，需要在manifest中去添加声明
 */
public class MoocApplication extends Application {
    private static MoocApplication mApplication = null;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplication = this;
    }

    public static MoocApplication getInstance() {
        return mApplication;
    }
}
