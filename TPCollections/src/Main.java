import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import Exceptions.OperationExceptions;

import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) 
	{
//		Map<Integer, String> stringIn = new HashMap<Integer, String>();
//		stringIn.put(7,"Paris");
//		stringIn.put(5,"Rome" ) ;
//		stringIn.put (1,"Manchester") ;
//		stringIn.put (3,"Barcelone") ;
//		String chaineCaractereString ="Manchester ou Barcelone mais jamais Paris ni Rome";
//		StringTokenizer st = new StringTokenizer(chaineCaractereString," ,.");
//		String newString ="";
//		
//		while(st.hasMoreTokens())
//		{
//
//			String sousChaineString = st.nextToken();
//			
//			if(stringIn.containsValue(sousChaineString))
//			{
//				for(Entry<Integer,String> e: stringIn.entrySet())
//				{
//					
//					if (sousChaineString.equals(e.getValue().toString())) 
//					{
//						newString = newString + e.getKey().toString() + " ";
//					}
//					
//				}
//			}
//			else
//			{
//				newString = newString+ sousChaineString+" ";
//			}
//		}
//		
//		System.out.println(newString);
		
//		Personne p1 = new Personne(1,"Biheux","yoann");
//		Personne p2 = new Personne(2,"Richard","nathalie");
//		Personne p3 = new Personne(3,"Davoust","fabrice");
//		Personne p4 = new Personne(4,"Canonne","philippe");
//		Personne p5 = new Personne(5,"Zinetti","victoire");
//		
//		Map<String, Personne> personnes = new HashMap();
//		personnes.put(p1.getNomPrenom(), p1);
//		personnes.put(p2.getNomPrenom(), p2);
//		personnes.put(p3.getNomPrenom(), p3);
//		personnes.put(p4.getNomPrenom(), p4);
//		personnes.put(p5.getNomPrenom(), p5);
//		
//		int compteur=1;
//		
//		for(Entry<String,Personne> e: personnes.entrySet())
//		{
//			
//			if(compteur%2==0)
//				System.out.println(e.getKey());
//			else
//				System.out.println(e.getValue().toString());
//			compteur++;
//		
////			if(e.getValue().getNum()%2==0)
////				System.out.println(e.getKey());
////			else
////				System.out.println(e.getValue().toString());
//	
//		}
		
		Nombre nb1 = new Nombre(-9,7);
		Operation op = new Operation(nb1);
		try 
		{
			op.division();
		} catch (OperationExceptions e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		

		


	}

}
