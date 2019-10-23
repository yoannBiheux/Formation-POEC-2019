package org.eclipse.exceptions;

public class IncorrectStreetNameException extends Exception
{
	public IncorrectStreetNameException(String streetname)
	{
		System.out.println("Le nom de la rue '"+streetname+"'  doit être en majuscule");
	}

}
