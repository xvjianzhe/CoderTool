package com.code.jianzhe.codertool.analyse;

/**
 * Created by JianZhe on 15/12/10.
 * 关键字实体
 */
public class KeyWordBean implements ISearchModel{
    /**
     * 关键字集合
     */
    private String[] keyWords;

    @Override
    public String[] getKeyWords() {
        return new String[0];
    }

    public void setKeyWords(String[] keyWords) {
        this.keyWords = keyWords;
    }
}
