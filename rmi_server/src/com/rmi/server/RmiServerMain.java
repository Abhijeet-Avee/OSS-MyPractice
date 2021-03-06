package com.rmi.server;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiServerMain {
	public static void main(String[] args) {
		try {
			AtmCardImpl obj = new AtmCardImpl();
			
			Registry registry = LocateRegistry.createRegistry(5000);
			//bind object with registry
			registry.bind("obj",obj);
			System.out.println("Object is bound");
		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (AlreadyBoundException e) {
			e.printStackTrace();
		}	
	}
}
