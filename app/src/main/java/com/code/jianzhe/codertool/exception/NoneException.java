package com.code.jianzhe.codertool.exception;

import android.text.Html;
import android.text.Spanned;
import android.util.Log;

/**
 * Created by JianZhe on 15/12/17.
 */
public class NoneException extends CoderToolException {


    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param throwable
     */
    public NoneException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param throwable
     * @param spanned
     */
    public NoneException(String detailMessage, Throwable throwable, Spanned spanned) {
        super(detailMessage, throwable, spanned);
    }

    public NoneException(Spanned spanned, Exception throwable) {
        super(spanned.toString(), throwable, spanned);
        Log.d(this.getClass().getName(), Html.toHtml(spanned));
    }
}
