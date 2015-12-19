package com.code.jianzhe.codertool.search;

import android.text.TextUtils;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.analyse.AnalyseConstant;
import com.code.jianzhe.codertool.common.SearchContentType;
import com.code.jianzhe.codertool.context.Context;
import com.code.jianzhe.codertool.exception.CoderToolException;
import com.code.jianzhe.codertool.exception.NumberLimitException;
import com.code.jianzhe.codertool.provider.IDataProvider;
import com.code.jianzhe.codertool.provider.NoneProvider;
import com.code.jianzhe.codertool.provider.NumberProvider;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;

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
            /*
                如果是进制转换
                1.保存检索的内容
                2.计算转换结果
                3.将检索内容和计算转换结果拼接
             */
            result = getNumberSearchResult(((NumberProvider) provider).getDataConditions(), ((NumberProvider) provider).getContentType());
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
    private String getNumberSearchResult(String condition, SearchContentType type) {
        String result = "";
        Long val = Long.parseLong(condition);
        if (type == SearchContentType.BINARY) {
            result = Context.getContext().getString(R.string.num_result_binary);
            result = String.format(result, Long.toBinaryString(val) + "", Long.toOctalString(val) + "", val + "", Long.toHexString(val) + "");
        } else if (type == SearchContentType.OCTONARY) {
            result = Context.getContext().getString(R.string.num_result_octonary);
            result = String.format(result, Long.toOctalString(val) + "", Long.toBinaryString(val) + "", val + "", Long.toHexString(val) + "");
        } else if (type == SearchContentType.HEXADECIMAL) {
            result = Context.getContext().getString(R.string.num_result_hexadecimal);
            result = String.format(result, Long.toHexString(val) + "", Long.toBinaryString(val) + "", Long.toOctalString(val) + "", val + "");
        } else {
            result = Context.getContext().getString(R.string.num_result_decimalism);
            result = String.format(result, val + "", Long.toBinaryString(val) + "", Long.toOctalString(val) + "", Long.toHexString(val) + "");
        }
        return result;
    }
}
