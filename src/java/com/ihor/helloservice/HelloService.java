package com.ihor.helloservice;

import android.os.ServiceManager;
import android.util.Log;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class HelloService extends Service {
  private final String TAG = HelloService.class.getSimpleName();
  private static final String SERVICE_NAME = "HelloService";
  private IHelloServiceInterfaceImpl helloSystemInterfaceImpl;

  public void onCreate() {
    super.onCreate();
    this.helloSystemInterfaceImpl = new IHelloServiceInterfaceImpl();
    Log.i("HelloService", "OnCreate of service has been called!");
    ServiceManager.addService(SERVICE_NAME, this.helloSystemInterfaceImpl);
  }

  @Override
  public IBinder onBind(final Intent intent){
    Log.d(TAG, "onBind: " + intent);
    return helloSystemInterfaceImpl.asBinder();
  }
}
