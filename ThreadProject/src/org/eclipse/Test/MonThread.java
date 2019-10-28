package org.eclipse.Test;

public class MonThread extends Thread
{
	public MonThread(String name)
	{
		super(name);
	}
	
	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++) 
		{
		System.out.print(this.getName() + " ");
		}
	}


}
