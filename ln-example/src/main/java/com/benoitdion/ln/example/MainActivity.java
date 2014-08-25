package com.benoitdion.ln.example;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import com.benoitdion.ln.*;

public class MainActivity extends ActionBarActivity {

    NaturalLog ln = Ln.get(new Ln.Context() {
        @Override
        public String get() {
            return "Ln Example App";
        }
    }, "Main Activity");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ln.i("onCreate");
        ln.i("onCreate");

        ln.e(new Throwable());
    }
}
