package com.burakiren.androidmvvmdaggerandtest.base;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Apple on 3.12.2018.
 */

@Singleton
@Component(modules = {
        ApplicationModule.class
})
public interface ApplicationComponent {
}
