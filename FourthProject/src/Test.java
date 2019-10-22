import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;


public class Test 
{

	public static void main(String[] args) 
	{
		//parcourirListe();
		parcourirAvecIterator();
		


		

	}
	
	public static void parcourirListe()
	{
		/*ArrayList liste = new ArrayList();
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
		}*/
		
		ArrayList liste2 = new ArrayList();
		liste2.add(0);
		liste2.add("Bonjour");
		liste2.add(2);
		liste2.remove(1);
		liste2.set(1, "Bonsoir");
		
		for(Object elt:liste2)
		{
			System.out.print(elt+" ");
		}
		
	}
	
	public static void parcourirAvecIterator()
	{
		LinkedList listeLiee = new LinkedList();
		listeLiee.add(5);
		listeLiee.add("Bonjour ");
		listeLiee.add(7.5);
		listeLiee.addFirst("toto");
		listeLiee.addLast("Fin");
		ListIterator li = listeLiee.listIterator();
		while(li.hasNext())
		{
			System.out.println(li.next());
		}
	}

}
