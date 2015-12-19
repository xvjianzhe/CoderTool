package com.code.jianzhe.codertool.common_acty;

import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.common.SearchType;

/**
 * Created by JianZhe on 15/12/19.
 */
public abstract class SearchBaseActy extends AppCompatActivity {
    /**
     * 检索的内容类型,默认使用进制转换
     */
    protected SearchType type = SearchType.BINOCTDEL;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.global_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.api_search:
                showCurrentCategory("API");
                getInputBox().setHint("API");
                type = SearchType.API;
                break;
            case R.id.binhexoct:
                getInputBox().setHint("请输入需要转换的数字格式");
                showCurrentCategory("进制转换");
                type = SearchType.BINOCTDEL;
                break;
            case R.id.keyword_search:
                showCurrentCategory("关键字");
                getInputBox().setHint("关键字");
                type = SearchType.KEYWORD;
                break;
            case R.id.calculate_expression:
                showCurrentCategory("表达式计算");
                getInputBox().setHint("表达式");
                type = SearchType.EXPRESSION;
                break;
            case R.id.syntax_search:
                showCurrentCategory("语法解析");
                getInputBox().setHint("程式语句");
                type = SearchType.SYNTAX;
                break;
        }
        return true;
    }

    /**
     * 显示当前选择查询的类型
     *
     * @param message 消息
     */
    private void showCurrentCategory(String message) {
        String msg = "当前选择的是%1$s查询方式";
        Toast.makeText(this, String.format(msg, message), Toast.LENGTH_SHORT).show();
    }

    protected abstract AutoCompleteTextView getInputBox();

}
