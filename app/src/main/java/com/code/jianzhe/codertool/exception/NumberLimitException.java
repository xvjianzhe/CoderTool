package com.code.jianzhe.codertool.exception;

import android.text.Spanned;

/**
 * Created by JianZhe on 15/12/17.
 * 格式转换异常
 *
 * @version 1.0
 * @author JianZhe
 */
public class NumberLimitException extends CoderToolException {


    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param throwable
     * @param spanned
     */
    public NumberLimitException(String detailMessage, Throwable throwable, Spanned spanned) {
        super(detailMessage, throwable, spanned);
    }

    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param throwable
     */
    public NumberLimitException(String detailMessage, Throwable throwable) {
        super(detailMessage, throwable);
    }

    public NumberLimitException(Spanned spanned, NumberFormatException e) {
        super(spanned.toString(), e, spanned);
    }
}
