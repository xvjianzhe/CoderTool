package com.code.jianzhe.codertool.analyse;

import com.code.jianzhe.codertool.common.SearchContentType;
import com.code.jianzhe.codertool.common.SearchType;
import com.code.jianzhe.codertool.factories.AnalyseFactory;

/**
 * Created by JianZhe on 15/12/19.
 * 分析工具
 * <p>
 * 针对用户输入的内容进行分析
 * </p>
 *
 * @author JianZhe
 * @version 1.0
 */
public class AnalyseTool {

    public SearchContentType analyse(SearchType content) {
        SearchContentType type = SearchContentType.NONE;

        IAnalyse analyse = AnalyseFactory.getInstance();

        switch (content) {
            case BINOCTDEL:
                type = analyse.analyseNumber(content.getContent());
                break;
            case API:
                break;
            case KEYWORD:
                break;
            case SYNTAX:
                break;
            case EXPRESSION:
                break;
        }

        if (type != SearchContentType.NONE) {
            return type;
        }
        return type;
    }

}
