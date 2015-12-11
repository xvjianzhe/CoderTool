package com.code.jianzhe.codertool.flowhandle;

import com.code.jianzhe.codertool.analyse.IAnalyse;
import com.code.jianzhe.codertool.formater.IFormater;
import com.code.jianzhe.codertool.provider.IDataProvider;
import com.code.jianzhe.codertool.search.ISearch;

/**
 * Created by JianZhe on 15/12/11.
 *
 * @author JianZhe
 *         处理检索流程
 * @version 1.0
 */
public class SearchFlowHandle {
    /**
     * 匹配模式
     * 用于作为分析器对输入内容分析的结果输出
     */
    enum Mode {
        /**
         * 关键字
         */
        KEYWORD,
        /**
         * 整数
         */
        NUMBER,
        /**
         * 表达式
         */
        EXPRESSION,
        /**
         * API
         */
        API,
        /**
         * 语法
         */
        SYNTAX,
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

    /**
     * 处理检索
     *
     * @param content 检索的内容
     * @return 检索结果
     */
    public final String handleSearch(String content) {
        //匹配模式
        Mode mode = matchedProcessing(content);
        IDataProvider provider = analyseHandle(mode);
        return formarter(searchResult(provider));
    }

    /**
     * 对传入的内容进行格式化,具体格式化的方式视使用的格式化器而定
     *
     * @param s 需要格式化的内容
     * @return 格式后的结果
     */
    private String formarter(String s) {
        return null;
    }

    /**
     * 检索结果,根据数据条件进行结果检索
     *
     * @param provider 数据条件
     * @return 检索后的结果集
     */
    private String searchResult(IDataProvider provider) {
        return null;
    }

    /**
     * 分析处理
     * 根据传入的模式进行分析器的选择,返回分析器处理的数据检索条件
     *
     * @param mode 模式
     * @return 数据条件
     */
    private IDataProvider analyseHandle(Mode mode) {
        return null;
    }

    /**
     * 模式匹配
     * 根据内容匹配出对应的模式,具体请查看@see com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Mode
     *
     * @param content 匹配内容
     * @return 匹配后的模式
     */
    private Mode matchedProcessing(String content) {
        return null;
    }

    /**
     * 处理流程的构建器
     *
     * @author JianZhe
     * @version 1.0
     */
    static class Builder {
        /**
         * 分析器
         *
         * @see IAnalyse
         */
        private IAnalyse analyse;
        /**
         * 格式化器
         *
         * @see IFormater
         */
        private IFormater formater;
        /**
         * 检索
         *
         * @see ISearch
         */
        private ISearch search;

    }
}
