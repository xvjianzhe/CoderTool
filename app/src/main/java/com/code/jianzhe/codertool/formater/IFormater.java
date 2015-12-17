package com.code.jianzhe.codertool.formater;

import android.text.Spanned;

/**
 * Created by JianZhe on 15/12/11.
 */
public interface IFormater {
    /**
     * 格式化结果字符串,具体格式取决于子类的实现
     *
     * @param result 需要格式化的内容
     * @return 格式后的内容
     */
    String formaterResult(String result);
}
