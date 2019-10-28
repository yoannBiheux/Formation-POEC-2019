package org.eclipse.Test;

import java.awt.desktop.ScreenSleepEvent;
import java.util.concurrent.Semaphore;



public class Test {

	public static void main(String[] args)
	{
//		MonThread A = new MonThread("A");
//		MonThread B = new MonThread("B");
//		MonThread C = new MonThread("C");
//		
//		A.start();
//		B.start();
//		C.start();
//		System.out.println(Thread.currentThread().
//		getName() + " : j’ai fini");
		
		
//		Thread A = new Thread(new TonThread("A"));
//		Thread B = new Thread(new TonThread("B"));
//		Thread C = new Thread(new TonThread("C"));
//		A.start();
//		B.start();
//		C.start();
//		System.out.println(Thread.currentThread().
//		getName() + " : j’ai fini");
		
//		Thread thread = new Thread("A") 
//		{
//			@Override
//			public void run() {
//				for (int i = 0; i < 5; i++)
//				{
//					System.out.print(getName() + " ");
//				}
//				
//			}
//		};
//		thread.start();
//		
//		Runnable runnable = ()->{
//			for(int i=0;i<5;i++) {
//				System.out.println("A");
//			}
//		};
//		
//		Thread th = new Thread(runnable);
//		
//		th.start();
		
//		Thread A = new Thread(new TonThread("A"));
//		Thread B = new Thread(new TonThread("B"));
//		Thread C = new Thread(new TonThread("C"));
//		A.start();
//		B.start();
//		C.start();
//		try {
//			A.join();
//			B.join();
//			C.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(Thread.currentThread().
//		getName() + " : j’ai fini");
		
		// TODO Auto-generated method stub
//		Thread A = new Thread(new TonThread("A"));
//		Thread B = new Thread(new TonThread("B"));
//		Thread C = new Thread(new TonThread("C"));
//		A.start();
//		B.start();
//		C.start();
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println(Thread.currentThread().getName() +" : j’ai fini");
		
//		Thread C1 = new Compteur();
//		Thread C2 = new Compteur();
//		Thread C3 = new Compteur();
//		Thread C4 = new Compteur();
//		Thread C5 = new Compteur();
//		
//		C1.start();
//		C2.start();
//		C3.start();
//		C4.start();
//		C5.start();
		Semaphore sem = new Semaphore(1);
		MonCompteur tCompteur = new MonCompteur();
//		Thread t1 = new Thread(new TestThread(tCompteur,"t1"));
//		Thread t2 = new Thread(new TestThread(tCompteur,"t2"));
//		Thread t3 = new Thread(new TestThread(tCompteur,"t3"));
		
		Thread t1 = new Thread(new TestThread(tCompteur,"t1",sem));
		Thread t2 = new Thread(new TestThread(tCompteur,"t2",sem));
		Thread t3 = new Thread(new TestThread(tCompteur,"t3",sem));
		
		t1.start();
		t2.start();
		t3.start();

	}
	

	
	

	

}
