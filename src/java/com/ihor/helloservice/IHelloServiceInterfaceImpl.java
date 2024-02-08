package com.ihor.helloservice;

import android.os.RemoteException;

public class IHelloServiceInterfaceImpl extends IHelloServiceInterface.Stub {
  @Override
  public boolean max(int a, int b) throws RemoteException {
  return a > b;
  }
}
