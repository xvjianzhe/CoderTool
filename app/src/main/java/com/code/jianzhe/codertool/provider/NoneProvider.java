package com.code.jianzhe.codertool.provider;

import android.text.Html;
import android.text.Spanned;
import android.util.Log;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.context.Context;
import com.code.jianzhe.codertool.exception.CoderToolException;
import com.code.jianzhe.codertool.exception.NoneException;

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
    public String getDataConditions() throws CoderToolException {
        throw new NoneException(Context.getContext().getString(R.string.NoneExceptionMessage), new Exception());
    }
}
