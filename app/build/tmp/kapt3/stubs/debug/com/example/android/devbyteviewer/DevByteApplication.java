package com.example.android.devbyteviewer;

import java.lang.System;

/**
 * Override application to setup background work via WorkManager
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lcom/example/android/devbyteviewer/DevByteApplication;", "Landroid/app/Application;", "()V", "onCreate", "", "app_debug"})
public final class DevByteApplication extends android.app.Application {
    
    public DevByteApplication() {
        super();
    }
    
    /**
     * onCreate is called before the first screen is shown to the user.
     *
     * Use it to setup any background tasks, running expensive setup operations in a background
     * thread to avoid delaying app start.
     */
    @java.lang.Override()
    public void onCreate() {
    }
}