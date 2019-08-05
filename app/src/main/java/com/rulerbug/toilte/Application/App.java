package com.rulerbug.toilte.Application;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static Context mc;

    @Override
    public void onCreate() {
        super.onCreate();
        mc = this;
    }

    public static Context getContext() {
        return mc;
    }
}
