package com.ihor.helloservice;

import android.os.RemoteException;
import android.os.ServiceManager;

public class HelloServiceManager {
  private static final String SERVICE_NAME = "HelloService";
  private final IHelloServiceInterface helloInterface;

  public static HelloServiceManager getInstance() {
    return new HelloServiceManager();
  }

  public boolean max(int a, int b){
    try {
      return helloInterface.max(a,b);
    } catch (RemoteException e) {
      e.printStackTrace();
      return true;
    }
  }

  public HelloServiceManager(){
    this.helloInterface = IHelloServiceInterface.Stub.asInterface(ServiceManager.getService(SERVICE_NAME));
    if (this.helloInterface == null) {
      throw new IllegalStateException("Failed to find IHelloSystemInterface!");
    }
  }
}
