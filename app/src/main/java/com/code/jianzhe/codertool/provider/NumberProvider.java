package com.code.jianzhe.codertool.provider;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.common.SearchContentType;
import com.code.jianzhe.codertool.context.Context;
import com.code.jianzhe.codertool.exception.NumberLimitException;

import junit.framework.Assert;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 整数检索条件提供器
 */
public class NumberProvider extends BaseProvider<String> {



    /**
     * 返回检索的条件数据
     *
     * @return 数据条件
     */
    @Override
    public String getDataConditions() throws NumberLimitException {

        String value = "";
        SearchContentType searchContentType = getContentType();
//        String[] vals = searchContentType.getContent().split(" ");
        String vals = searchContentType.getContent();
        switch (searchContentType) {
            case DECIMALISM:
                value = vals;
                break;
            case OCTONARY:
                value = "" + Long.parseLong(vals, 8);
                break;
            case HEXADECIMAL:
                value = "" + Long.parseLong(vals, 16);
                break;
            case BINARY:
                value = "" + Long.parseLong(vals, 2);
                break;
            default:
                throw new NumberLimitException(Context.getContext().getString(R.string.NumberLimitExceptionMessage), new Exception());
        }
        return value;
    }
}
