package com.example.mm.service1;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.location.LocationListener;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity {
NewService newService;
Button start , stop;
boolean ibinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

          start = (Button)findViewById(R.id.startbtn);
          stop = (Button)findViewById(R.id.stopbtn);



          start.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
               if(ibinder) {
                   newService.getMessge();
               }
               else
               {
                   Toast.makeText(newService, "No service", Toast.LENGTH_SHORT).show();
               }
              }
          });

          ;

         // stop.setOnClickListener(new View.OnClickListener() {
           //   @Override
             // public void onClick(View view) {

      // newService.getMessge();
              //}
          //});


    }

    @Override
    protected void onStart() {
        super.onStart();


        Intent intent = new Intent(MainActivity.this , NewService.class);
        bindService(intent,serviceconnection,BIND_AUTO_CREATE);


    }


    private ServiceConnection serviceconnection  = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            NewService.Localservice localservice = (NewService.Localservice)iBinder;
            newService = localservice.getService();

            ibinder = true;

        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {

            ibinder = false;
        }
    };

    @Override
    protected void onStop() {
        super.onStop();

         unbindService(serviceconnection);
         ibinder = false;

    }
}

