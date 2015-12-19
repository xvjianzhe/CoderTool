package com.code.jianzhe.codertool.common;

/**
 * Created by JianZhe on 15/12/19.
 * 检索类型
 *
 * @author JianZhe
 * @version 1.0
 */
public enum SearchType {
    /**
     * 关键字
     */
    KEYWORD,
    /**
     * 进制转换
     */
    BINOCTDEL,
    /**
     * API
     */
    API,
    /**
     * 语法
     */
    SYNTAX,
    /**
     * 表达式
     */
    EXPRESSION;
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
