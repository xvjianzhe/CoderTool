package com.code.jianzhe.codertool.formater;

import android.text.Html;
import android.text.Spanned;

import com.code.jianzhe.codertool.search.DefaultSearch;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 默认格式化器,将内容格式化成HTML格式
 *
 * @author JianZhe
 * @version 1.0
 */
public class DefaultFormater implements IFormater {
    /**
     * 格式化结果字符串,具体格式取决于子类的实现
     *
     * @param result 需要格式化的内容
     * @return 格式后的内容
     */
    @Override
    public String formaterResult(String result) {

        String[] temp = result.split(DefaultSearch.SP);
        StringBuilder builder = new StringBuilder();
        for (int i = 0, len = temp.length; i < len; i++) {
            if (i == 0) {
                builder.append("<h3><font color='red'>" + temp[i] + "</font></h3>");
            } else {
                builder.append("<p>" + temp[i] + "</p>");
            }
        }
        return builder.toString();
    }
}
