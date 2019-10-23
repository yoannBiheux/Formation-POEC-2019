package org.eclipse.exceptions;

public class IncorrectCodePostalException extends Exception 
{

	public IncorrectCodePostalException(String cp) 
	{

		System.out.println("Le code Postal '"+cp+"' doit contenir 5 chiffres");
	}


	

}
