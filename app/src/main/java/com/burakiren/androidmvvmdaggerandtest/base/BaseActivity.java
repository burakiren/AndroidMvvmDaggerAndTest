package com.burakiren.androidmvvmdaggerandtest.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.burakiren.androidmvvmdaggerandtest.di.Injector;

import java.util.UUID;

/**
 * Created by Apple on 4.12.2018.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private static final String INSTANCE_ID_KEY = "instance_id";
    private String instanceId;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {

        if (savedInstanceState != null) {
            instanceId = savedInstanceState.getString(INSTANCE_ID_KEY);
        } else {
            instanceId = UUID.randomUUID().toString();
        }
        Injector.inject(this);
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(INSTANCE_ID_KEY, instanceId);
    }

    public String getInstanceId() {
        return instanceId;
    }
}
