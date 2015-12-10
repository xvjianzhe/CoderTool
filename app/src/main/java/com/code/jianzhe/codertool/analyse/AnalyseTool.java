package com.code.jianzhe.codertool.analyse;

/**
 * Created by JianZhe on 15/12/10.
 * 分析工具
 */
public abstract class AnalyseTool {
    /**
     * 分析功能
     * @param content 需要分析的内容
     * @return 分析后生成的检索模型
     */
    public abstract ISearchModel analyse(String content);

}
