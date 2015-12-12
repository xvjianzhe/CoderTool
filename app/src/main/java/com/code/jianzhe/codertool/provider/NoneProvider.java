package com.code.jianzhe.codertool.provider;

/**
 * Created by JianZhe on 15/12/12.
 * 无匹配时返回该提供器
 *
 * @author JianZhe
 * @version 1.0
 */
public class NoneProvider extends BaseProvider<String> {
    /**
     * 返回检索的条件数据
     *
     * @return 数据条件
     */
    @Override
    public String getDataConditions() {
        return null;
    }
}
