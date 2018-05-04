package com.example.brayany.testsyncadapter.syncadapter;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class SyncService extends Service {
    private static final Object sSyncAdapterLock = new Object();
    private static SyncAdapter sSyncAdapter = null;
    @Override
    public void onCreate() {
        super.onCreate();
        synchronized (sSyncAdapterLock) {
            if (sSyncAdapter == null) {
                sSyncAdapter = new SyncAdapter(getApplicationContext(), true);
            }
        } }
    @Override
    public IBinder onBind(Intent intent) {
        return sSyncAdapter.getSyncAdapterBinder();
    }
}