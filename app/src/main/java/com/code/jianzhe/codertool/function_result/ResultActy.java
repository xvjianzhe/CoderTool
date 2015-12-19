package com.code.jianzhe.codertool.function_result;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.common.SearchType;
import com.code.jianzhe.codertool.common_acty.SearchBaseActy;
import com.code.jianzhe.codertool.function_home.EventsHandle;

public class ResultActy extends SearchBaseActy {


    private AutoCompleteTextView inputBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_acty);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String searchContent = bundle.getString("content");
        String result = bundle.getString("result");
        inputBox = (AutoCompleteTextView) findViewById(R.id.inputBox);

        final TextView resultText = (TextView) findViewById(R.id.result);
        findViewById(R.id.search).setOnClickListener(new EventsHandle(new EventsHandle.ContentCallBack() {
            @Override
            public SearchType getContent() {
                type.setContent(inputBox.getText().toString());
                return type;
            }

            @Override
            public void putResult(String result) {
                resultText.setText(Html.fromHtml(result));
            }
        }));
        inputBox.setText(searchContent);
        inputBox.setSelection(searchContent.length());
        resultText.setText(Html.fromHtml(result));
    }

    @Override
    protected AutoCompleteTextView getInputBox() {
        return inputBox;
    }
}
