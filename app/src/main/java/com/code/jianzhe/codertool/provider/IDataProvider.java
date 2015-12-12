package com.code.jianzhe.codertool.provider;

import android.support.annotation.NonNull;

/**
 * Created by JianZhe on 15/12/11.
 */
public interface IDataProvider<T> {
    /**
     * 返回检索的条件数据
     * @return 数据条件
     */
    T getDataConditions();

    /**
     * 设置检索的内容
     *
     * @param content 检索的内容
     */
    void setContent(@NonNull String content);
}
