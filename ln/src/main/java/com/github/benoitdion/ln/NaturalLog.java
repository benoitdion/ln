package com.github.benoitdion.ln;

public interface NaturalLog {
    void v(Throwable throwable);

    void v(String message, Object... args);

    void v(Throwable throwable, String message, Object... args);

    void d(Throwable throwable);

    void d(String message, Object... args);

    void d(Throwable throwable, String message, Object... args);

    void i(Throwable throwable);

    void i(Throwable throwable, String message, Object... args);

    void i(String message, Object... args);

    void w(Throwable throwable);

    void w(Throwable throwable, String message, Object... args);

    void w(String message, Object... args);

    void w(boolean report, Throwable throwable);

    void w(boolean report, Throwable throwable, String message, Object... args);

    void w(boolean report, String message, Object... args);

    void e(Throwable t);

    void e(Throwable throwable, String message, Object... args);

    void e(String message, Object... args);

    void e(boolean report, Throwable throwable);

    void e(boolean report, Throwable throwable, String message, Object... args);

    void e(boolean report, String message, Object... args);

    void report(Throwable throwable, String message);

    boolean isDebugEnabled();

    boolean isVerboseEnabled();
}
