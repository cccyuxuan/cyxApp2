package com.example.cyxapp;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;

public class MyService2 extends Service {
    private MediaPlayer mediaPlayer;
    public MyService2() {
        Log.d("service","service2 is MyService2...");
    }

    @Override
    public IBinder onBind(Intent intent) {
        return new Mybinder();
    }
    protected class Mybinder extends Binder {

        public void play(){
            mediaPlayer= MediaPlayer.create(getApplicationContext(),R.raw.music1);
            mediaPlayer.start();
        }
    }
    @Override
    public void onDestroy() {
        Log.d("service","service2 is onDestroy...");
        super.onDestroy();
    }


}