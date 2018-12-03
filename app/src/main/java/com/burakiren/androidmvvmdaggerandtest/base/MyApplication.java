package com.burakiren.androidmvvmdaggerandtest.base;

import android.app.Application;

/**
 * Created by Apple on 3.12.2018.
 */

public class MyApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }
}
