package com.example.mm.service1;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

public class NewService extends Service {

private  Binder Binds = new Localservice();


    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return Binds;
    }


public class Localservice extends Binder
{
    NewService getService()
    {
        return NewService.this;
    }
}

public void getMessge()
{
    Toast.makeText(this, "Hello Everyone", Toast.LENGTH_SHORT).show();
}



}


