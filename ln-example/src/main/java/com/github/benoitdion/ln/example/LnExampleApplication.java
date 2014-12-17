package com.github.benoitdion.ln.example;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import com.github.benoitdion.ln.DebugLn;
import com.github.benoitdion.ln.Ln;
import com.github.benoitdion.ln.ReleaseLn;

public class LnExampleApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        final int applicationFlags = getApplicationInfo().flags;
        if ((applicationFlags & ApplicationInfo.FLAG_DEBUGGABLE) != 0) {
            Ln.initialize(new DebugLn());
        } else {
            Ln.initialize(new ReleaseLn() {
                @Override
                public void report(Throwable throwable, String message) {
                    // TODO: Report to external service.
                }
            });
        }
    }
}
