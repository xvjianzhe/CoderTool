package com.code.jianzhe.codertool.provider;

import android.text.Html;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.context.Context;
import com.code.jianzhe.codertool.exception.NumberLimitException;

/**
 * Created by JianZhe on 15/12/12.
 * <p>
 * 整数检索条件提供器
 */
public class NumberProvider extends BaseProvider<Long> {
    /**
     * 返回检索的条件数据
     *
     * @return 数据条件
     */
    @Override
    public Long getDataConditions() throws NumberLimitException {
        Long value = 0L;
        try {
            value = Long.parseLong(getContent());
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw new NumberLimitException(Context.getContext().getString(R.string.NumberLimitExceptionMessage), e);
        }

        return value;
    }
}
