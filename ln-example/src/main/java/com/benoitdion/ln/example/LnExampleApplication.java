package com.benoitdion.ln.example;

import android.app.*;
import android.content.pm.*;
import com.benoitdion.ln.*;

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
