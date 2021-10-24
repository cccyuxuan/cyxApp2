package com.example.cyxapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity3 extends AppCompatActivity {
    private Intent intent1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.d("life","activity2 is onCreate...");

        Intent intent=getIntent();
        String teacher=intent.getStringExtra("teacher");
        if(teacher.equals("cyx1")){
            intent1=new Intent();
            intent1.putExtra("state","安卓");
        }else{
            if(teacher.equals("cyx2")){
                intent1=new Intent();
                intent1.putExtra("state","JAVA");
            }
        };

        setResult(31,intent1);

    }
    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("life","activity2 is onPostResume...");
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life","activity2 is onStart...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life","activity2 is onReStart...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life","activity2 is onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life","activity2 is onDestroy...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life","activity2 is onPause...");
    }
    @Override
    public void finish() {
        super.finish();
        Log.d("life","activity2 is finish...");
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("life","activity2 is finishActivity...");
    }
}