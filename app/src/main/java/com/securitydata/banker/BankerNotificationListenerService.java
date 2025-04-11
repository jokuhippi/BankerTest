package com.securitydata.banker;

import android.service.notification.NotificationListenerService;
import android.util.Log;

/**
 * Service that can read device's notifications.
 */
public class BankerNotificationListenerService extends NotificationListenerService {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("", "BankerNotificationListener.onCreate()");
    }

    @Override
    public void onListenerConnected() {
        super.onListenerConnected();
        Log.d("", "BankerNotificationListener.onListenerConnected()");
    }
}
