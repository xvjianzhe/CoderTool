package com.code.jianzhe.codertool.search;

import com.code.jianzhe.codertool.exception.CoderToolException;
import com.code.jianzhe.codertool.exception.NumberLimitException;
import com.code.jianzhe.codertool.provider.IDataProvider;
import com.code.jianzhe.codertool.provider.NoneProvider;
import com.code.jianzhe.codertool.provider.NumberProvider;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 默认检索器
 *
 * @author JianZhe
 * @version 1.0
 */
public class DefaultSearch implements ISearch {
    public static final String SP = "-br-";
    /**
     * 进行结果集检索
     *
     * @param provider 检索数据条件提供器
     * @return 检索成功返回检索得到的结果集, 如果检索失败, 返回错误信息
     */
    @Override
    public String search(IDataProvider provider) throws CoderToolException {
        String result = "";
        if (provider instanceof NumberProvider) {
            result = getNumberSearchResult(((NumberProvider) provider).getDataConditions());
        } else if (provider instanceof NoneProvider) {
            result = ((NoneProvider) provider).getDataConditions();
        }
        return result;
    }

    /**
     * 获取整数的检索结果
     *
     * @param condition 需要转换的内容
     * @return 转换后的内容
     */
    private String getNumberSearchResult(Long condition) {
        String result = condition + SP + "二进制:" + Long.toBinaryString(condition) + SP + "八进制:" + Long.toOctalString(condition)
                + SP + "十六进制:" + Long.toHexString(condition);
        return result;
    }


}
