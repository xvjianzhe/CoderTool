package com.code.jianzhe.codertool.factories;

import com.code.jianzhe.codertool.analyse.DefaultAnalyse;
import com.code.jianzhe.codertool.analyse.IAnalyse;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 分析器工厂
 * 通过解析XML文件的形式构建对应的分析器
 *
 * @author JianZhe
 * @version 1.0
 */
public class AnalyseFactory {
    /**
     * 根据XML配置返回对应的分析器
     *
     * @return 生成后的分析器
     */
    public static final IAnalyse getInstance() {
        return new DefaultAnalyse();
    }

}
