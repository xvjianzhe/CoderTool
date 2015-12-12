package com.code.jianzhe.codertool.provider;

import com.code.jianzhe.codertool.flowhandle.SearchFlowHandle;

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
    private String content;

    /**
     * 获取检索内容
     *
     * @return 检索内容
     */

    public String getContent() {
        return content;
    }

    /**
     * 设置检索内容
     *
     * @param content 检索内容
     */
    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
