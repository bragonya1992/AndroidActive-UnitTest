package com.example.brayany.testsyncadapter.application;

import com.activeandroid.ActiveAndroid;

public class MasterApp extends com.activeandroid.app.Application {

        @Override
        public void onCreate() {
            super.onCreate();
            ActiveAndroid.initialize(this);
        }
}
