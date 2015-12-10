package com.code.jianzhe.codertool.analyse;

import android.support.annotation.NonNull;

/**
 * Created by JianZhe on 15/12/10.
 * 关键字分析器
 */
public class KeyWordAnalyse extends AnalyseTool{
    @Override
    public ISearchModel analyse(@NonNull String content) {
        String[] keywords = content.split(" ");
        KeyWordBean keyWordBean = new KeyWordBean();
        keyWordBean.setKeyWords(keywords);
        return keyWordBean;
    }
}
