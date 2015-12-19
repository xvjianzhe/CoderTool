package com.code.jianzhe.codertool.analyse;

/**
 * Created by JianZhe on 15/12/18.
 * 分析验证的常量列表
 *
 * @author JianZhe
 * @version 1.0
 */
public class AnalyseConstant {
    /**
     * 十进制的正则验证
     */
    public static final String NUM_DECIMALISM = "^-?[1-9]\\d*$";
    /**
     * 二进制的正则验证
     */
    public static final String NUM_BINARY = "^2\\s*[0-1]*$";
    /**
     * 八进制的正则验证
     */
    public static final String NUM_OCTONARY = "^8\\s*[0-7]*$";
    /**
     * 十六进制的正则验证
     */
    public static final String NUM_HEXADECIMAL = "^16\\s*[0-9a-fA-F]*$";
    /**
     * 匹配至少一个空格
     */
    public static final String REPLACE_SPACE = "\\s+";

}
