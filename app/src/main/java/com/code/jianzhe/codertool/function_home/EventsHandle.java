package com.code.jianzhe.codertool.function_home;

import android.support.annotation.NonNull;
import android.view.View;

import com.code.jianzhe.codertool.R;
import com.code.jianzhe.codertool.flowhandle.SearchFlowHandle;

/**
 * Created by JianZhe on 15/12/10.
 * 事件统一处理
 */
public class EventsHandle implements View.OnClickListener{
    /**
     * 检索内容回调接口对象
     *
     * @see com.code.jianzhe.codertool.function_home.EventsHandle.ContentCallBack
     */
    private ContentCallBack callBack;

    /**
     * HOME页事件集中处理器
     *
     * @param callBack 回调函数接口,不允许为Null
     */
    public EventsHandle(@NonNull ContentCallBack callBack) {
        this.callBack = callBack;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.search:
                SearchFlowHandle searchFlowHandle = new SearchFlowHandle.Builder().create();
                searchFlowHandle.handleSearch(callBack.getContent());
                break;
        }
    }

    /**
     * 检索内容回调接口
     * 用来接收需要检索的内容
     *
     * @author JianZhe
     * @version 1.0
     */
    public interface ContentCallBack {
        String getContent();
    }
}
