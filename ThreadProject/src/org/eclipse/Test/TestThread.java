package org.eclipse.Test;

import java.util.concurrent.Semaphore;

public class TestThread implements Runnable {
	MonCompteur TC;
	private String name;
	
	private Semaphore sem;

	public TestThread(MonCompteur tC, String name) {

		TC = tC;
		this.name = name;
	}
	
	

	public TestThread(MonCompteur tC, String name, Semaphore sem) {
		super();
		TC = tC;
		this.name = name;
		this.sem = sem;
	}



	@Override
	public void run() 
	{
		try
		{
			for(int i = 0; i < 3; i++)
			{
				sem.acquire();
				//synchronized(TC){
				if(TC.getCompteur() > 0){
				TC.decrementerCompteur();
				System.out.println("Operation reussie " + TC.getCompteur()
				+ " demandee par " + name);
				Thread.sleep(500);
				} else
				System.out.println("´Echec " + TC.getCompteur() + " demandee par " + name);
				//}
				sem.release();
			}
		} 
		catch(InterruptedException e) {
			System.out.println(e.getMessage());
			}
		}



}
