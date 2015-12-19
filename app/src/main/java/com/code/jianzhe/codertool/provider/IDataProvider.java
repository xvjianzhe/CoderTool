package com.code.jianzhe.codertool.provider;

import android.support.annotation.NonNull;

import com.code.jianzhe.codertool.common.SearchContentType;
import com.code.jianzhe.codertool.exception.CoderToolException;
import com.code.jianzhe.codertool.exception.NoneException;
import com.code.jianzhe.codertool.exception.NumberLimitException;

/**
 * Created by JianZhe on 15/12/11.
 */
public interface IDataProvider<T> {
    /**
     * 返回检索的条件数据
     * @return 数据条件
     */
    T getDataConditions() throws CoderToolException;

    /**
     * 设置检索的内容
     *
     * @param content 检索的内容
     */
    void setContentType(SearchContentType content);
}
