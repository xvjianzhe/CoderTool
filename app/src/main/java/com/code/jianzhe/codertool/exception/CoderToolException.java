package com.code.jianzhe.codertool.exception;

import android.text.Spanned;

/**
 * Created by JianZhe on 15/12/17.
 */
public class CoderToolException extends Exception {
    private Spanned spanned;

    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param throwable
     */
    public CoderToolException(String detailMessage, Throwable throwable, Spanned spanned) {
        super(detailMessage, throwable);
        this.spanned = spanned;
    }

    /**
     * Constructs a new {@code Exception} with the current stack trace, the
     * specified detail message and the specified cause.
     *
     * @param detailMessage the detail message for this exception.
     * @param throwable
     */
    public CoderToolException(String detailMessage, Throwable throwable) {
        this(detailMessage, throwable, null);
    }

    public Spanned getSpanned() {
        return spanned;
    }

    public void setSpanned(Spanned spanned) {
        this.spanned = spanned;
    }
}
