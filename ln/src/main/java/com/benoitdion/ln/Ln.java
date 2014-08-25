package com.benoitdion.ln;

public class Ln {
    private static NaturalLog ln;

    private Ln() {
    }

    public static void initialize(NaturalLog ln) {
        Ln.ln = ln;
    }

    public static NaturalLog get(final Context context, final String tag) {
        return new ContextLn(context, tag);
    }

    public static NaturalLog get(final Context context) {
        return new ContextLn(context, null);
    }

    public static NaturalLog get(final String tag) {
        return new ContextLn(null, tag);
    }

    public static void v(Throwable t) {
        ln.v(t);
    }

    public static void v(String message, Object... args) {
        ln.v(message, args);
    }

    public static void v(Throwable throwable, String message, Object... args) {
        ln.v(throwable, message, args);
    }

    public static void d(Throwable t) {
        ln.d(t);
    }

    public static void d(String message, Object... args) {
        ln.d(message, args);
    }

    public static void d(Throwable throwable, String message, Object... args) {
        ln.d(throwable, message, args);
    }

    public static void i(Throwable t) {
        ln.i(t);
    }

    public static void i(String message, Object... args) {
        ln.i(message, args);
    }

    public static void i(Throwable throwable, String message, Object... args) {
        ln.i(throwable, message, args);
    }

    public static void w(Throwable t) {
        ln.w(t);
    }

    public static void w(String message, Object... args) {
        ln.w(message, args);
    }

    public static void w(Throwable throwable, String message, Object... args) {
        ln.w(throwable, message, args);
    }

    public static void w(boolean withReport, Throwable t) {
        ln.w(withReport, t);
    }

    public static void w(boolean withReport, String message, Object... args) {
        ln.w(withReport, message, args);
    }

    public static void w(boolean withReport, Throwable throwable, String message, Object... args) {
        ln.w(withReport, throwable, message, args);
    }

    public static void e(Throwable t) {
        ln.e(t);
    }

    public static void e(String message, Object... args) {
        ln.e(message, args);
    }

    public static void e(Throwable throwable, String message, Object... args) {
        ln.e(throwable, message, args);
    }

    public static void e(boolean report, Throwable t) {
        ln.e(report, t);
    }

    public static void e(boolean report, String message, Object... args) {
        ln.e(report, message, args);
    }

    public static void e(boolean report, Throwable throwable, String message, Object... args) {
        ln.e(report, throwable, message, args);
    }

    public static void report(Throwable throwable, String message) {
        ln.report(throwable, message);
    }

    public static boolean isDebugEnabled() {
        return ln.isDebugEnabled();
    }

    public static boolean isVerboseEnabled() {
        return ln.isVerboseEnabled();
    }

    public static NaturalLog tag(String tag) {
        if (ln instanceof BaseLn) {
            ((BaseLn) ln).tag(tag);
        }
        return ln;
    }

    private static void extra(Context context, String tag, int depth) {
        if (ln instanceof BaseLn) {
            ((BaseLn) ln).extra(context, tag, depth);
        }
    }

    public interface Context {
        String get();
    }

    private static class ContextLn implements NaturalLog {
        private final Context context;
        private final String tag;

        public ContextLn(Context context, String tag) {
            this.context = context;
            this.tag = tag;
        }

        @Override
        public void v(Throwable throwable) {
            Ln.extra(context, tag, 1);
            Ln.v(throwable);
        }

        @Override
        public void v(String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.v(message, args);
        }

        @Override
        public void v(Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.v(throwable, message, args);
        }

        @Override
        public void d(Throwable throwable) {
            Ln.extra(context, tag, 1);
            Ln.d(throwable);
        }

        @Override
        public void d(String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.d(message, args);
        }

        @Override
        public void d(Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.d(throwable, message, args);
        }

        @Override
        public void i(Throwable throwable) {
            Ln.extra(context, tag, 1);
            Ln.i(throwable);
        }

        @Override
        public void i(Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.i(throwable, message, args);
        }

        @Override
        public void i(String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.i(message, args);
        }

        @Override
        public void w(Throwable throwable) {
            Ln.extra(context, tag, 1);
            Ln.w(throwable);
        }

        @Override
        public void w(Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.w(throwable, message, args);
        }

        @Override
        public void w(String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.w(message, args);
        }

        @Override
        public void w(boolean report, Throwable throwable) {
            Ln.extra(context, tag, 1);
            Ln.w(report, throwable);
        }

        @Override
        public void w(boolean report, Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.w(report, throwable, message, args);
        }

        @Override
        public void w(boolean report, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.w(report, message, args);
        }

        @Override
        public void e(Throwable t) {
            Ln.extra(context, tag, 1);
            Ln.e(t);
        }

        @Override
        public void e(Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.e(throwable, message, args);
        }

        @Override
        public void e(String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.e(message, args);
        }

        @Override
        public void e(boolean report, Throwable throwable) {
            Ln.extra(context, tag, 1);
            Ln.e(report, throwable);
        }

        @Override
        public void e(boolean report, Throwable throwable, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.e(report, throwable, message, args);
        }

        @Override
        public void e(boolean report, String message, Object... args) {
            Ln.extra(context, tag, 1);
            Ln.e(report, message, args);
        }

        @Override
        public void report(Throwable throwable, String message) {
            Ln.report(throwable, message);
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
}
