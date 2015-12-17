package com.code.jianzhe.codertool.analyse;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by JianZhe on 15/12/14.
 * 默认分析器测试类
 */
public class DefaultAnalyseTest {
    private DefaultAnalyse analyse;

    @Before
    public void setUp() throws Exception {
        analyse = new DefaultAnalyse();
    }

    /**
     * 测试整数的验证
     * 输入:123
     * 期望:true
     */
    @Test
    public void testAnalyseNumber01() throws Exception {
        Assert.assertEquals(true, analyse.analyseNumber("123"));
    }

    /**
     * 测试整数的验证
     * 输入:123.3
     * 期望:false
     */
    @Test
    public void testAnalyseNumber02() throws Exception {
        Assert.assertEquals(false, analyse.analyseNumber("123.3"));
    }

    /**
     * 测试整数的验证
     * 输入:null
     * 期望:false
     */
    @Test
    public void testAnalyseNumber03() throws Exception {
        Assert.assertEquals(true, analyse.analyseNumber(null));
    }

    /**
     * 测试整数的验证
     * 输入:""
     * 期望:false
     */
    @Test
    public void testAnalyseNumber04() throws Exception {
        Assert.assertEquals(false, analyse.analyseNumber(""));
    }

    /**
     * 测试整数的验证
     * 输入:-123
     * 期望:false
     */
    @Test
    public void testAnalyseNumber05() throws Exception {
        Assert.assertEquals(true, analyse.analyseNumber("-123"));
    }

    @Test
    public void testAnalyseKeyword() throws Exception {

    }

    @Test
    public void testAnalyseAPI() throws Exception {

    }

    @Test
    public void testAnalyseExpression() throws Exception {

    }

    @Test
    public void testAnalyseSyntax() throws Exception {

    }
}