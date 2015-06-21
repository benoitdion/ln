package com.github.benoitdion.ln;

import android.text.*;
import android.util.*;

public abstract class BaseLn implements NaturalLog {
    private static final ThreadLocal<String> TAG = new ThreadLocal<>();
    private static final ThreadLocal<Ln.Context> CONTEXT = new ThreadLocal<>();
    private static final ThreadLocal<Integer> DEPTH = new ThreadLocal<>();

    protected void println(int priority, boolean report, Throwable throwable, String message, Object... args) {
        message = args.length == 0 ? message : String.format(message, args);
        if (TextUtils.isEmpty(message)) {
            if (throwable != null) {
                message = formatThrowable(throwable);
            } else {
                // Nothing to log
                clearExtra();
                return;
            }
        } else if (throwable != null) {
            message += '\n' + formatThrowable(throwable);
        }
        if (report) {
            report(throwable, message);
        }

        Ln.Context context = CONTEXT.get();
        if (context != null) {
            CONTEXT.remove();
            String contextString = context.get();
            if (contextString != null) {
                log(priority, getTag(), contextString + " " + formatMessage(message));
                return;
            }
        }
        log(priority, getTag(), formatMessage(message));
    }

    protected String formatMessage(String message) {
        return message;
    }

    protected void log(int priority, String tag, String message) {
        Log.println(priority, tag, message);
    }

    @Override
    public void report(Throwable throwable, String message) {
    }

    protected String formatThrowable(Throwable ex) {
        return Log.getStackTraceString(ex);
    }

    protected void clearExtra() {
        TAG.remove();
        CONTEXT.remove();
        DEPTH.remove();
    }

    public void tag(final String tag) {
        TAG.set(tag);
    }

    void extra(Ln.Context context, String tag, int depth) {
        CONTEXT.set(context);
        tag(tag);
        DEPTH.set(depth);
    }

    private String getTag() {
        String tag = TAG.get();
        if (tag != null) {
            TAG.remove();
            DEPTH.remove();
            return tag;
        }

        int depth = DEPTH.get() == null ? 0 : DEPTH.get();
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        if (stackTrace.length < 5 + depth) {
            // Not enough elements in the stacktrace.
            return null;
        }
        StackTraceElement trace = stackTrace[4 + depth];
        tag = trace.getClassName();
        return tag.substring(tag.lastIndexOf('.') + 1) + ":" + trace.getLineNumber();
    }
}
