package com.example.cyxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("life","activity4 is onPostResume...");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life","activity4 is onStart...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life","activity4 is onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life","activity4 is onDestroy...");
    }
    @Override
    public void finish() {
        super.finish();
        Log.d("life","activity4 is finish...");
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("life","activity4 is finishActivity...");
    }
}