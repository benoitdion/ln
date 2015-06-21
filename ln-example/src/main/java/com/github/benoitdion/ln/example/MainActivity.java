package com.github.benoitdion.ln.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.benoitdion.ln.Ln;
import com.github.benoitdion.ln.NaturalLog;

public class MainActivity extends AppCompatActivity {

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
