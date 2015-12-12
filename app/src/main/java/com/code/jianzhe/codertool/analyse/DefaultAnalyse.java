package com.code.jianzhe.codertool.analyse;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 默认分析器
 *
 * @author JianZhe
 * @version 1.0
 */
public class DefaultAnalyse implements IAnalyse {
    /**
     * 分析整数
     * 对输入内容进行判断,如果输入的是整数则返回结果为true,否则为false
     *
     * @param content 需要分析的内容
     * @return true或false
     */
    @Override
    public boolean analyseNumber(String content) {
        return false;
    }

    /**
     * 分析关键字
     * 对输入的内容进行判断,如果输入的是一个关键字,则返回结果为true,否则为false
     *
     * @param content 需要分析的内容
     * @return true或false
     */
    @Override
    public boolean analyseKeyword(String content) {
        return false;
    }

    /**
     * 分析API
     * 对输入的内容进行判断,如果不是数字并且不是关键字,同时又是单一英文
     * 单词的时候,则表明其是一个API类,返回true,否则返回false
     *
     * @param content 需要分析的内容
     * @return true或false
     */
    @Override
    public boolean analyseAPI(String content) {
        return false;
    }

    /**
     * 分析表达式
     * 对输入的内容进行判断,如果符合表达式的语法,则表明其是一个表达式,返回true,否则返回false
     *
     * @param content 需要分析的内容
     * @return true或false
     */
    @Override
    public boolean analyseExpression(String content) {
        return false;
    }

    /**
     * 分析语法
     * 对输入的内容进行判断,如果符合语法分析,则表明其是一个语法,返回true,否则返回false
     *
     * @param content 需要分析的内容
     * @return true或false
     */
    @Override
    public boolean analyseSyntax(String content) {
        return false;
    }
}
