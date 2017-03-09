package com.ntkduy1604.androidtemplate_intentservice.services;

import android.app.IntentService;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/**
 * Created by NTKDUY on 3/9/2017
 * for PIGGY HOUSE
 * you can contact me at: ntkduy1604@gmail.com
 */

public class MyService extends IntentService {
    private static final String TAG = "MyService";

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param: there is no params in this example
     */
    public MyService() {
        super("MyService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        /**
         * Get the sent data when this intent is called
         */
        Uri uri = intent.getData();
        Log.i(TAG, "onHandleIntent: " + uri.toString());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "onCreate");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy");
    }
}
