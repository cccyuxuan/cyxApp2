package com.example.cyxapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;

public class MyService1 extends Service {
    private MediaPlayer mediaPlayer;
    private int[] musics={
            R.raw.music1,R.raw.music1,R.raw.music1
    };

    public MyService1() {
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d("service","service is onBind...");
        throw new UnsupportedOperationException("Not yet implemented");

    }
    @Override
    public boolean onUnbind(Intent intent) {
        return super.onUnbind(intent);
    }
    @Override
    public void onCreate() {
        Log.d("service","service is onCreate...");
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("service","service is onStartCommand...");

        mediaPlayer=MediaPlayer.create(getApplicationContext(),musics[0]);
        mediaPlayer.start();
        return super.onStartCommand(intent, flags, startId);
    }
    @Override
    public void onDestroy() {
        Log.d("service","service is onDestroy...");
        mediaPlayer.stop();
        super.onDestroy();
    }
}