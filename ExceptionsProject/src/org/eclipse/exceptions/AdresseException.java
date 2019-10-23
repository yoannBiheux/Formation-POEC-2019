package org.eclipse.exceptions;

public class AdresseException extends Exception
{
	
	public AdresseException(String cp, String nomRue)
	{
		if(cp.length()!=5)
			System.out.println("Le code Postal '"+cp+"' doit contenir 5 chiffres");
		
		if(!nomRue.equals(nomRue.toUpperCase()))
			System.out.println("Le nom de la rue '"+nomRue+"'  doit être en majuscule");
		
	}
	
	public AdresseException(int excp, String valeur)
	{
		if(excp==1)
			System.out.println("Le code Postal '"+valeur+"' doit contenir 5 chiffres");
		
		else
			System.out.println("Le nom de la rue '"+valeur+"'  doit être en majuscule");
		
	}

}
