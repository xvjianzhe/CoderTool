package com.code.jianzhe.codertool.factories;

import com.code.jianzhe.codertool.search.DefaultSearch;
import com.code.jianzhe.codertool.search.ISearch;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 检索器工厂
 * 根据XML的配置生成对应的检索器对象
 *
 * @author JianZhe
 * @version 1.0
 */
public class SearchFactory {
    /**
     * 根据XML的配置生成对应的检索器
     *
     * @return 生成后的检索器
     */
    public static final ISearch getInstance() {
        return new DefaultSearch();
    }
}
