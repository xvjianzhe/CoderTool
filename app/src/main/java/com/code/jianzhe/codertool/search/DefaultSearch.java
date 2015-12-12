package com.code.jianzhe.codertool.search;

import com.code.jianzhe.codertool.provider.IDataProvider;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 默认检索器
 *
 * @author JianZhe
 * @version 1.0
 */
public class DefaultSearch implements ISearch {
    /**
     * 进行结果集检索
     *
     * @param provider 检索数据条件提供器
     * @return 检索成功返回检索得到的结果集, 如果检索失败, 返回错误信息
     */
    @Override
    public String search(IDataProvider provider) {
        return null;
    }
}
