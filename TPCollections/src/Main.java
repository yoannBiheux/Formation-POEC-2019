import java.util.Scanner;

import Exceptions.OperationExceptions;

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
		boolean arreter =true;
		
		while (arreter==true)
		{
			Scanner scanner = new Scanner(System.in);
			Nombre nb1 = new Nombre();
			Operation op = new Operation(nb1);
			
			System.out.println("Veuillez entrer un 1er chiffre");
			nb1.setVar1(scanner.nextInt());
			
			
			System.out.println("Veuillez entrer un 2e chiffre");
			nb1.setVar2(scanner.nextInt());
			
			System.out.println("Veuillez saisir 1 si vous voulez le résultat de la division et 2 si vous voulez le résultat de la racine carée de la somme");
			int opChoisie = scanner.nextInt();
		
			double result=0;
			
			try 
			{
				if(opChoisie==1)
				{
					result = op.division();
					
				}
				else if (opChoisie==2)
				{
					result=op.racineDeLaSomme();
		
				}
				else
					System.out.println("Vous n'avez saisi ni 1 ni 2!!");
				
			} catch (OperationExceptions e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(result);
			
			System.out.println("Voulez-vous recommencer? O/N");
			char rep = scanner.next().charAt(0);
			
			if(rep=='O')
				arreter=true;
			else
				arreter=false;
		}
		
		
		
		
		
		
		
		
		

		


	}

}
