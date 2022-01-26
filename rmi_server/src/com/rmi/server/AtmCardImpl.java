package com.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AtmCardImpl extends UnicastRemoteObject implements AtmCard{

	private static final long serialVersionUID = 1L;
	
	protected AtmCardImpl() throws RemoteException {
		super();
	}

	@Override
	public boolean isValid(String card) throws RemoteException {
		int val=Integer.parseInt(card);
		return val%2==0;
	}
	
}
