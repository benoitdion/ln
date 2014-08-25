package com.benoitdion.ln;

import android.util.*;

public class InfoLn extends BaseLn {
    @Override
    public void v(Throwable throwable) {
        clearExtra();
    }

    @Override
    public void v(String message, Object... args) {
        clearExtra();
    }

    @Override
    public void v(Throwable throwable, String message, Object... args) {
        clearExtra();
    }

    @Override
    public void d(Throwable throwable) {
        clearExtra();
    }

    @Override
    public void d(String message, Object... args) {
        clearExtra();
    }

    @Override
    public void d(Throwable throwable, String message, Object... args) {
        clearExtra();
    }

    @Override
    public void i(Throwable throwable) {
        println(Log.INFO, false, throwable, null);
    }

    @Override
    public void i(Throwable throwable, String message, Object... args) {
        println(Log.INFO, false, throwable, message, args);
    }

    @Override
    public void i(String message, Object... args) {
        println(Log.INFO, false, null, message, args);
    }

    @Override
    public void w(Throwable throwable) {
        println(Log.WARN, true, throwable, null);
    }

    @Override
    public void w(Throwable throwable, String message, Object... args) {
        println(Log.WARN, true, throwable, message, args);
    }

    @Override
    public void w(String message, Object... args) {
        println(Log.WARN, true, null, message, args);
    }

    @Override
    public void w(boolean report, Throwable throwable) {
        println(Log.WARN, report, throwable, null);
    }

    @Override
    public void w(boolean report, Throwable throwable, String message, Object... args) {
        println(Log.WARN, report, throwable, message, args);
    }

    @Override
    public void w(boolean report, String message, Object... args) {
        println(Log.WARN, report, null, message, args);
    }

    @Override
    public void e(Throwable throwable) {
        println(Log.ERROR, true, throwable, null);
    }

    @Override
    public void e(Throwable throwable, String message, Object... args) {
        println(Log.ERROR, true, throwable, message, args);
    }

    @Override
    public void e(String message, Object... args) {
        println(Log.ERROR, true, null, message, args);
    }

    @Override
    public void e(boolean report, Throwable t) {
        println(Log.ERROR, report, null, null);
    }

    @Override
    public void e(boolean report, Throwable throwable, String message, Object... args) {
        println(Log.ERROR, report, throwable, message, args);
    }

    @Override
    public void e(boolean report, String message, Object... args) {
        println(Log.ERROR, report, null, message, args);
    }

    @Override
    public boolean isDebugEnabled() {
        return false;
    }

    @Override
    public boolean isVerboseEnabled() {
        return false;
    }
}
