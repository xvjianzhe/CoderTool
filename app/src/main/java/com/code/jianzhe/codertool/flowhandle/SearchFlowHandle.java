package com.code.jianzhe.codertool.flowhandle;

import android.support.annotation.NonNull;

import com.code.jianzhe.codertool.analyse.AnalyseTool;
import com.code.jianzhe.codertool.analyse.IAnalyse;
import com.code.jianzhe.codertool.common.SearchContentType;
import com.code.jianzhe.codertool.common.SearchType;
import com.code.jianzhe.codertool.exception.CoderToolException;
import com.code.jianzhe.codertool.exception.NoneException;
import com.code.jianzhe.codertool.exception.NumberLimitException;
import com.code.jianzhe.codertool.factories.FormaterFactory;
import com.code.jianzhe.codertool.factories.SearchFactory;
import com.code.jianzhe.codertool.formater.IFormater;
import com.code.jianzhe.codertool.provider.APIProvider;
import com.code.jianzhe.codertool.provider.ExpressionProvider;
import com.code.jianzhe.codertool.provider.IDataProvider;
import com.code.jianzhe.codertool.provider.KeywordProvider;
import com.code.jianzhe.codertool.provider.NoneProvider;
import com.code.jianzhe.codertool.provider.NumberProvider;
import com.code.jianzhe.codertool.provider.SyntaxProvider;
import com.code.jianzhe.codertool.search.ISearch;

/**
 * Created by JianZhe on 15/12/11.
 *
 * 处理检索流程
 *
 * @author JianZhe
 *
 * @version 1.0
 */
public class SearchFlowHandle {

    /**
     * 检索流程处理的构建器
     *
     * @see com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Builder
     */
    private Builder builder;

    /**
     * 处理检索
     *
     * @param content 检索的类型及内容
     * @return 检索结果
     */
    public final String handleSearch(SearchType content) {
        //匹配模式
        String result = "";
        try {
            SearchContentType mode = builder.analyse.analyse(content);
            IDataProvider provider = analyseHandle(mode);
            result = formarter(searchResult(provider));
        } catch (CoderToolException e) {
            e.printStackTrace();
            if (e instanceof NumberLimitException) {
                result = e.getMessage();
            } else if (e instanceof NoneException) {
                result = e.getMessage();
            }
        }
        return result;

    }

    /**
     * 检索流程处理器的构造器
     * <p>
     * 默认构造器为私有化的,需要借助{@link com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Builder 构建器}<br>
     * 创建实例
     * </p>
     *
     * @param builder {@link com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Builder 构建器}
     */
    private SearchFlowHandle(Builder builder) {
        this.builder = builder;
    }

    /**
     * 对传入的内容进行格式化,具体格式化的方式视使用的格式化器而定
     *
     * @param s 需要格式化的内容
     * @return 格式后的结果
     */
    private String formarter(String s) {

        return builder.formater.formaterResult(s);
    }

    /**
     * 检索结果,根据数据条件进行结果检索
     *
     * @param provider 数据条件
     * @return 检索后的结果集
     */
    private String searchResult(IDataProvider provider) throws CoderToolException {
        return builder.search.search(provider);
    }

    /**
     * 分析处理
     * 根据传入的模式进行分析器的选择,返回分析器处理的数据检索条件
     *
     * @param mode 模式
     * @return 数据条件
     */
    private IDataProvider analyseHandle(SearchContentType mode) {
        IDataProvider provider = null;
        switch (mode) {
            case BINARY:
            case OCTONARY:
            case HEXADECIMAL:
            case DECIMALISM:
                provider = new NumberProvider();
                break;
            case KEYWORD:
                provider = new KeywordProvider();
                break;
            case API:
                provider = new APIProvider();
                break;
            case EXPRESSION:
                provider = new ExpressionProvider();
                break;
            case SYNTAX:
                provider = new SyntaxProvider();
                break;
            case NONE:
                provider = new NoneProvider();
                break;
        }
        provider.setContentType(mode);
        return provider;
    }

    /**
     * 模式匹配
     * 根据内容匹配出对应的模式,具体请查看@see com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Mode
     *
     * @param content 匹配内容
     * @return 匹配后的模式, 模式中包含检索内容
     */
//    private Mode matchedProcessing(String content) {
//        Mode mode = Mode.NONE;
//        if (builder.analyse.analyseNumber(content)) {
//            mode = Mode.NUMBER;
//        } else if (builder.analyse.analyseKeyword(content)) {
//            mode = Mode.KEYWORD;
//        } else if (builder.analyse.analyseAPI(content)) {
//            mode = Mode.API;
//        } else if (builder.analyse.analyseExpression(content)) {
//            mode = Mode.EXPRESSION;
//        } else if (builder.analyse.analyseSyntax(content)) {
//            mode = Mode.SYNTAX;
//        }
//        mode.content = content;
//        return mode;
//    }

    /**
     * 处理流程的构建器
     *
     * @author JianZhe
     * @version 1.0
     */
    public static class Builder {
        /**
         * 分析器
         *
         * @see IAnalyse
         */
        private AnalyseTool analyse;
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

        /**
         * 默认构造器
         * <p>
         * 初始化检索器{@link IAnalyse IAnalyse},格式化器{@link IFormater IFormater},<br>
         * 检索器{@link ISearch ISearch}.
         * </p>
         */
        public Builder() {
            analyse = new AnalyseTool();
            formater = FormaterFactory.getInstance();
            search = SearchFactory.getInstance();
        }

//        /**
//         * 设置自定义构建器
//         *
//         * @param analyse {@link IAnalyse 构建器}
//         * @return {@link com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Builder 构建器}
//         */
//        public Builder setAnalyse(@NonNull IAnalyse analyse) {
//            this.analyse = analyse;
//            return this;
//        }

        /**
         * 设置自定义{@link IFormater 格式化器}
         *
         * @param formater {@link IFormater 格式化器}
         * @return {@link com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Builder 构建器}
         */
        public Builder setFormater(@NonNull IFormater formater) {
            this.formater = formater;
            return this;
        }

        /**
         * 设置自定义自定义{@link ISearch 检索器}
         *
         * @param search {@link ISearch 检索器}
         * @return {@link com.code.jianzhe.codertool.flowhandle.SearchFlowHandle.Builder 构建器}
         */
        public Builder setSearch(@NonNull ISearch search) {
            this.search = search;
            return this;
        }

        /**
         * 构建{@link SearchFlowHandle 检索流程处理器}
         *
         * @return {@link SearchFlowHandle 检索流程处理器}的实例
         */
        public SearchFlowHandle create() {
            return new SearchFlowHandle(this);
        }
    }
}
