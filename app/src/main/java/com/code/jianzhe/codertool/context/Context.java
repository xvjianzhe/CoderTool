package com.code.jianzhe.codertool.context;

import android.app.Application;

/**
 * Created by JianZhe on 15/12/17.
 */
public class Context {
    private static Context context;
    private static Application application;

    public static void init(Application application) {
        context = new Context(application);
    }


    public Context(Application application) {
        Context.application = application;
    }

    public static Application getContext() {
        return application;
    }

}
