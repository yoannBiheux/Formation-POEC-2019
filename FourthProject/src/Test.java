import java.util.ArrayList;


public class Test 
{
	
	
	

	public static void main(String[] args) 
	{
		ArrayList liste = new ArrayList();
		liste.add(3);
		liste.add("Bonjour");
		liste.add(3.5);
		liste.add('c');
		
		for(int i=0;i<liste.size();i++)
		{
			System.out.println("element d'indice "+i+" = "+liste.get(i));
		}
		
		liste.remove(3);
		liste.set(0, "tutu");
		
		for(int i=0;i<liste.size();i++)
		{
			System.out.println("element d'indice "+i+" = "+liste.get(i));
		}

	}

}
