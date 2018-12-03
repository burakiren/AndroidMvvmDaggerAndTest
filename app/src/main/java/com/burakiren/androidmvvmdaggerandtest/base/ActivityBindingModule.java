package com.burakiren.androidmvvmdaggerandtest.base;

import android.app.Activity;

import com.burakiren.androidmvvmdaggerandtest.home.MainActivity;
import com.burakiren.androidmvvmdaggerandtest.home.MainActivityComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by Apple on 3.12.2018.
 */

@Module(subcomponents = {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
}
