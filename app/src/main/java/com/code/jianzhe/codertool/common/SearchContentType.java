package com.code.jianzhe.codertool.common;

/**
 * Created by JianZhe on 15/12/19.
 */
public enum SearchContentType {
    /**
     * 关键字
     */
    KEYWORD,
    /**
     * 十进制整数
     */
    DECIMALISM,
    /**
     * 二进制
     */
    BINARY,
    /**
     * 八进制
     */
    OCTONARY,
    /**
     * 十六进制
     */
    HEXADECIMAL,
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
    EXPRESSION,
    /**
     * 无匹配
     */
    NONE;
    /**
     * 分析完成后,保存的分析样本
     */
    private String content;

    /**
     * 设置分析样本
     *
     * @param content 分析样本
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取分析样本
     *
     * @return 之前保存的分析样本
     */
    public String getContent() {
        return this.content;
    }
}
