package com.code.jianzhe.codertool.analyse;

import com.code.jianzhe.codertool.common.SearchContentType;

/**
 * Created by JianZhe on 15/12/11.
 * 分析器的行为定义
 */
public interface IAnalyse {


    /**
     * 分析整数
     * 对输入内容进行判断,如果输入的是整数则返回结果为分析后的检索内容类型
     * {@link SearchContentType SearchContentType}
     *
     * @param content 需要分析的内容
     * @return 分析后的检索内容类型 {@link SearchContentType SearchContentType}
     */
    SearchContentType analyseNumber(String content);

    /**
     * 分析关键字
     * 对输入的内容进行判断,如果输入的是一个关键字,则返回结果为true,否则为false
     *
     * @param content 需要分析的内容
     * @return 分析后的检索内容类型 {@link SearchContentType SearchContentType}
     */
    SearchContentType analyseKeyword(String content);

    /**
     * 分析API
     * 对输入的内容进行判断,如果不是数字并且不是关键字,同时又是单一英文
     * 单词的时候,则表明其是一个API类,返回分析后的检索内容类型 {@link SearchContentType SearchContentType}
     *
     * @param content 需要分析的内容
     * @return 分析后的检索内容类型 {@link SearchContentType SearchContentType}
     */
    SearchContentType analyseAPI(String content);

    /**
     * 分析表达式
     * 对输入的内容进行判断,如果符合表达式的语法,则表明其是一个表达式,返回分析后的检索内容类型
     * {@link SearchContentType SearchContentType}
     *
     * @param content 需要分析的内容
     * @return 分析后的检索内容类型 {@link SearchContentType SearchContentType}
     */
    SearchContentType analyseExpression(String content);

    /**
     * 分析语法
     * 对输入的内容进行判断,如果符合语法分析,则表明其是一个语法,返回分析后的检索内容类型
     * {@link SearchContentType SearchContentType}
     *
     * @param content 需要分析的内容
     * @return 分析后的检索内容类型 {@link SearchContentType SearchContentType}
     */
    SearchContentType analyseSyntax(String content);
}
