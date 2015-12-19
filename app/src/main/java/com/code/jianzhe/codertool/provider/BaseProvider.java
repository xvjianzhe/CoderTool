package com.code.jianzhe.codertool.provider;

import com.code.jianzhe.codertool.common.SearchContentType;

/**
 * Created by JianZhe on 15/12/12.
 * 数据条件提供器基类
 *
 * @author JianZhe
 * @version 1.0
 */
public abstract class BaseProvider<T> implements IDataProvider<T> {
    /**
     * 需要解析的内容
     */
    private SearchContentType contentType;

    /**
     * 获取检索内容
     *
     * @return 检索内容
     */

    public SearchContentType getContentType() {
        return contentType;
    }

    /**
     * 设置检索内容
     *
     * @param content 检索内容
     */
    @Override
    public void setContentType(SearchContentType content) {
        this.contentType = content;
    }
}
