package com.code.jianzhe.codertool.function_result;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.function_home.EventsHandle;

public class ResultActy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_acty);
        Bundle bundle = getIntent().getBundleExtra("bundle");
        String searchContent = bundle.getString("content");
        String result = bundle.getString("result");
        final AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.inputBox);

        final TextView resultText = (TextView) findViewById(R.id.result);
        findViewById(R.id.search).setOnClickListener(new EventsHandle(new EventsHandle.ContentCallBack() {
            @Override
            public String getContent() {
                return textView.getText().toString();
            }

            @Override
            public void putResult(String result) {
                resultText.setText(Html.fromHtml(result));
            }
        }));
        textView.setText(searchContent);
        textView.setSelection(searchContent.length());
        resultText.setText(Html.fromHtml(result));
    }
}
