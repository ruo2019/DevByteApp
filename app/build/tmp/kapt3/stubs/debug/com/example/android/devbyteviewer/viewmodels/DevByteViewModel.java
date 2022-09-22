package com.example.android.devbyteviewer.viewmodels;

import java.lang.System;

/**
 * DevByteViewModel designed to store and manage UI-related data in a lifecycle conscious way. This
 * allows data to survive configuration changes such as screen rotations. In addition, background
 * work such as fetching network results can continue through configuration changes and deliver
 * results after the new Fragment or Activity is available.
 *
 * @param application The application that this viewmodel is attached to, it's safe to hold a
 * reference to applications across rotation since Application is never recreated during actiivty
 * or fragment lifecycle events.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lcom/example/android/devbyteviewer/viewmodels/DevByteViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "_eventNetworkError", "Landroidx/lifecycle/MutableLiveData;", "", "_isNetworkErrorShown", "_playlist", "", "Lcom/example/android/devbyteviewer/domain/DevByteVideo;", "eventNetworkError", "Landroidx/lifecycle/LiveData;", "getEventNetworkError", "()Landroidx/lifecycle/LiveData;", "isNetworkErrorShown", "playlist", "getPlaylist", "onNetworkErrorShown", "", "refreshDataFromNetwork", "Lkotlinx/coroutines/Job;", "Factory", "app_debug"})
public final class DevByteViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * A playlist of videos that can be shown on the screen. This is private to avoid exposing a
     * way to set this value to observers.
     */
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.android.devbyteviewer.domain.DevByteVideo>> _playlist = null;
    
    /**
     * Event triggered for network error. This is private to avoid exposing a
     * way to set this value to observers.
     */
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _eventNetworkError;
    
    /**
     * Flag to display the error message. This is private to avoid exposing a
     * way to set this value to observers.
     */
    private androidx.lifecycle.MutableLiveData<java.lang.Boolean> _isNetworkErrorShown;
    
    public DevByteViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.android.devbyteviewer.domain.DevByteVideo>> getPlaylist() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getEventNetworkError() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> isNetworkErrorShown() {
        return null;
    }
    
    /**
     * Refresh data from the repository. Use a coroutine launch to run in a
     * background thread.
     */
    private final kotlinx.coroutines.Job refreshDataFromNetwork() {
        return null;
    }
    
    /**
     * Resets the network error flag.
     */
    public final void onNetworkErrorShown() {
    }
    
    /**
     * Factory for constructing DevByteViewModel with parameter
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/example/android/devbyteviewer/viewmodels/DevByteViewModel$Factory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "app", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApp", "()Landroid/app/Application;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
    public static final class Factory implements androidx.lifecycle.ViewModelProvider.Factory {
        @org.jetbrains.annotations.NotNull()
        private final android.app.Application app = null;
        
        public Factory(@org.jetbrains.annotations.NotNull()
        android.app.Application app) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.app.Application getApp() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
        java.lang.Class<T> modelClass) {
            return null;
        }
    }
}