package com.code.jianzhe.codertool.function_home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spanned;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.ImageButton;
import android.widget.Toast;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.common.SearchContentType;
import com.code.jianzhe.codertool.common.SearchType;
import com.code.jianzhe.codertool.common_acty.SearchBaseActy;
import com.code.jianzhe.codertool.function_result.ResultActy;

/**
 * 首页Activity
 * 该页面提供检索功能
 *
 * @version 1.0
 * @author JianZhe
 */
public class HomeActy extends SearchBaseActy {
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
            public SearchType getContent() {
                type.setContent(inputBox.getText().toString());
                return type;
            }

            @Override
            public void putResult(String result) {
                Intent intent = new Intent(getApplicationContext(), ResultActy.class);
                Bundle bundle = new Bundle();
                bundle.putString("content", inputBox.getText().toString());
                bundle.putString("result", result);
                intent.putExtra("bundle", bundle);
                startActivity(intent);
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

    @Override
    protected AutoCompleteTextView getInputBox() {
        return inputBox;
    }

}
