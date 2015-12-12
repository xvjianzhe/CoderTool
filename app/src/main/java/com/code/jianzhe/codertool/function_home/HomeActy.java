package com.code.jianzhe.codertool.function_home;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;

import com.code.jianzhe.codertool.R;

/**
 * 首页Activity
 * 该页面提供检索功能
 *
 * @version 1.0
 * @author JianZhe
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
        EventsHandle eventHandle = new EventsHandle(new EventsHandle.ContentCallBack() {
            @Override
            public String getContent() {
                return inputBox.getText().toString();
            }
        });
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
