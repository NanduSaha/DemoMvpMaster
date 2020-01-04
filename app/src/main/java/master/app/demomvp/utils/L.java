package master.app.demomvp.utils;

import android.util.Log;

import master.app.demomvp.BuildConfig;

public class L {

    private static final String TAG = "NANDITA";

    private L() {
    }

    public static void e(Object object) {
        if (BuildConfig.DEBUG)
            Log.i(TAG, String.valueOf(object));

    }
}
