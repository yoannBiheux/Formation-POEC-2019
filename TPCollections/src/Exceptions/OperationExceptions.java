package Exceptions;

public class OperationExceptions extends Exception
{
	public OperationExceptions()
	{
		System.out.println("La division par z�ro est impossible");
	}
	
	public OperationExceptions(int exc)
	{
		if(exc==1)
			System.out.println("La division par z�ro est impossible");
		else
			System.out.println("la somme des valeurs est inferieure � 0");
	}

}
