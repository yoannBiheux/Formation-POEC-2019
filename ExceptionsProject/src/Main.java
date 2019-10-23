import org.eclipse.exceptions.AdresseException;
import org.eclipse.exceptions.IncorrectCodePostalException;
import org.eclipse.exceptions.IncorrectStreetNameException;

public class Main 
{

	public static void main(String[] args)
	{
//		try
//		{
//			int x = 5, y = 0;
//			System.out.print(x/y);
//			
//			
//		}
//		catch(Exception e)
//		{
//			System.out.println("erreur: division par zéro impossible");
//			e.printStackTrace();
//		}
//		System.out.println("Fin de calcul");
		Adresse adresse =null;
		try
		{
			adresse= new Adresse("rebeval", "Paris", "75016");
			
		}
		catch(AdresseException icp)
		{
			icp.printStackTrace();
			
		}
		finally
		{
			System.out.println("Instruction executee systematiquement");
		}
		
		
		
		System.out.println(adresse);
		
		


	}

}
