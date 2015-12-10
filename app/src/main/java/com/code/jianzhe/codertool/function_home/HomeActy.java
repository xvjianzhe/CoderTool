package com.code.jianzhe.codertool.function_home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;

import com.code.jianzhe.codertool.R;

/**
 * 首页Activity
 */
public class HomeActy extends AppCompatActivity {
    /**
     * 自动完成输入框
     * 用来输入用户需要检索的内容
     */
    private AutoCompleteTextView inputBox;
    /**
     * 检索按钮
     */
    private ImageButton searchButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_acty);
        init();
        initEvent();
    }

    /**
     * 初始化事件
     */
    private void initEvent() {
        EventsHandle eventHandle = new EventsHandle();
        searchButton.setOnClickListener(eventHandle);
    }

    /**
     * 视图组件初始化
     */
    private void init() {
        inputBox = (AutoCompleteTextView) findViewById(R.id.inputBox);
        searchButton = (ImageButton) findViewById(R.id.search);
    }
}
