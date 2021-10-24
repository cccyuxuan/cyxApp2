package com.example.cyxapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private Button button1,button2,button3,button4,button5,button6;
    private MyService2.Mybinder mybinder;
    private ServiceConnection connection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("life","activity1 is onCreate...");
        //Toast.makeText(this,"activity is onCreate",Toast.LENGTH_LONG).show();
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);
        button5=findViewById(R.id.button5);
        button6=findViewById(R.id.button6);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MyService1.class);
                /*intent.putExtra("teacher","cyx1");
                startActivityForResult(intent,1);
                //startActivity(intent);*/
                startService(intent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MainActivity2.this,MyService1.class);
                /*intent.putExtra("teacher","cyx2");
                startActivityForResult(intent,2);*/
                //startActivity(intent);
                stopService(intent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity2.this,MyService2.class);
                connection=new ServiceConnection() {
                    @Override
                    public void onServiceConnected(ComponentName name, IBinder service) {
                        mybinder= (MyService2.Mybinder) service;
                        mybinder.play();
                    }

                    @Override
                    public void onServiceDisconnected(ComponentName name) {

                    }
                };
                bindService(intent,connection, Context.BIND_AUTO_CREATE);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                unbindService(connection);
            }
        });

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode==31){
            String state=data.getStringExtra("state");
            Log.d("life",state);
        }

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("life","activity1 is onStart...");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.d("life","activity1 is onPostResume...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("life","activity1 is onReStart...");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("life","activity1 is onPause...");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("life","activity1 is onStop...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("life","activity1 is onDestroy...");
    }
    @Override
    public void finish() {
        super.finish();
        Log.d("life","activity1 is finish...");
    }

    @Override
    public void finishActivity(int requestCode) {
        super.finishActivity(requestCode);
        Log.d("life","activity1 is finishActivity...");
    }

}