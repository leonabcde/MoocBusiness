package com.leon.moocbusiness.activity.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 为我们所有的activity提供公共的行为
 */
public class BaseActivity extends AppCompatActivity {

    /**
     * 输出日志，所需tag
     */
    public String TAG;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TAG = getComponentName().getShortClassName();
    }
}
