package com.rulerbug.toilte.Utils;

import android.util.Log;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

import com.rulerbug.toilte.Application.App;

public class JsUtils {
    @JavascriptInterface
    public void register(String msg) {
        Toast.makeText(App.getContext(), msg, Toast.LENGTH_LONG).show();
        Log.e("1123", msg);
    }
}
