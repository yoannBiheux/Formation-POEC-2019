package org.eclipse.Test;

import java.util.Random;

public class Compteur extends Thread 
{
	private static int t =1;

	public void run()
	{
		
		for(int i=1;i<=7;i++)
		{
			System.out.println(this.getName()+" itération "+i);
			
			try {
				this.sleep((long)Math.random()*3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		t++;
		
		System.out.println(this.getName()+" a fini de compter en position "+t);
		
	}

}
