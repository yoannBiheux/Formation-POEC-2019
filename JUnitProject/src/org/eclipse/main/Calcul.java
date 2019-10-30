package org.eclipse.main;

import org.eclipse.interfaces.CalculService;

public class Calcul 
{
	CalculService calculService;
	
	public Calcul(CalculService calculService)
	{
		this.calculService = calculService;
	}
	
	
	
	public Calcul() {

	}



	public int sommeCarre(int x, int y) 
	{
		return somme(calculService.carre(x), calculService.carre(y));
		//return somme(x*x, y*y);
	}
	public int somme(int x,int y) {
		return x+y;
	}
	
	public double division(int x,int y) {
		if(y!=0)
			return x/y;
		else
			throw new ArithmeticException();
	}

}
