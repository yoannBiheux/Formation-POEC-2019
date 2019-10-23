import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;






public class Test 
{

	public static void main(String[] args) 
	{
		//parcourirListe();
		//parcourirAvecIterator();
		
		
//		Integer [] tab = {2, 3, 5, 1, 9};
//		List<Integer> listeIntegers =new LinkedList<Integer>(Arrays.asList(tab));
//		for(Object elt:listeIntegers)
//		{
//			System.out.print(elt+" ");
//		}
//		
//		//ou plus simple
//		List<Integer> entIntegers = Arrays.asList(tab);
//		//ou
//		List<Integer> entIntegers2 = Arrays.asList(2,8,6,1);
		
		//hashSetIterator();
		//treeSet();
		
		//HashTable();
		
		//exercice2();
		methodesUtiles();

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
	
	public static void hashSetIterator()
	{
		//pas de doublon possible 
		HashSet hs = new HashSet();
		hs.add("bonjour");
		hs.add("bonjour");
		hs.add(2);
		hs.add('c');
		hs.add('c');
		hs.add(9);
		
		Iterator it = hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
	}
	
	public static void treeSet()
	{
		//liste triée
		TreeSet ts = new TreeSet();
		ts.add(5);
		ts.add(8);
		ts.add(1);
		ts.add(47);
		ts.add(28);

		
		Iterator iterator =ts.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		TreeSet ts2 = new TreeSet();
		ts2.add('r');
		ts2.add('a');
		ts2.add('b');
		ts2.add('z');
		ts2.add('j');

		
		Iterator iterator2 =ts2.iterator();
		while(iterator2.hasNext())
		{
			System.out.println(iterator2.next());
		}
	}
	
	public static void HashTable()
	{
		//hashtable fonctionne avec couple (clé,valeur), n'accepte pas null et clé doit être unique
		// parcourir avec objet enumeration
		
		Hashtable ht = new Hashtable();
		ht.put(1, "Java");
		ht.put(5, "PHP");
		ht.put(3, "C++");
		ht.put(4, "Pascal");
		Enumeration e = ht.elements();
		while(e.hasMoreElements())
		{
			System.out.println("hascode= "+e.hashCode()+" elt= "+e.nextElement());

		}
		
	}
	
	public static void hashMap()
	{
		// fonctionne aussi avec couple (clé,valeur), utilise aussi une table de hachage(tri par clé), accepte null,CLE DOIT ETRE UNIQUE
		// parcourir avec set
		
		
		HashMap<Integer, String> hm = new HashMap();
		hm.put(1, "Java");
		hm.put(5, "PHP");
		hm.put(3, "C++");
		hm.put(4, "Pascal");
		hm.put(null, "c#");
		
		Set s = hm.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());

	}
	
	public static void exercice1() 
	{
		Map<String,Integer> repetition = new HashMap();
		repetition.put("Java", 2);
		repetition.put("PHP", 5);
		repetition.put("C++", 1);
		repetition.put("HTML", 4);
		
		
		
		for(Entry<String,Integer> e: repetition.entrySet())
		{
			for(int i=0;i<e.getValue();i++)
				System.out.print(e.getKey());
			
			System.out.print(" ");
		}

	}
	
	public static void exercice2()
	{
		List list = Arrays.asList(2,5,"Bonjour",10f,true,'c',"3","b",false,10);
		
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		
		for(Object elt:list)
		{
			String classe = elt.getClass().getSimpleName();
			if(hashMap.containsKey(classe))
				hashMap.replace(classe, hashMap.get(classe)+1);
			else
				hashMap.put(classe, 1);
			
		}
		Set s = hashMap.entrySet();
		
		Iterator it = s.iterator();
		
		while(it.hasNext())
			System.out.println(it.next());
		
		
	}
	
	public static void methodesUtiles()
	{
		List<String> lettres = new ArrayList<String>();
		lettres.add("d");
		lettres.add("b");
		lettres.add("a");
		lettres.add("c");
		Collections.sort(lettres); // pour trier la liste
		System.out.println(lettres);
		Collections.shuffle(lettres); // pour desordonner la liste
		System.out.println(lettres);
		List<String> sub = lettres.subList(1, 3); // extraire une sousliste
		System.out.println("sous-liste: "+sub);
		Collections.reverse(lettres); // pour trier la liste dans le sens decroissant
		System.out.println(lettres);

	}
	/*ArrayList est plus rapide pour l operation de recherche (get)
	LinkedList est plus rapide pour des operations d’insertion et de suppression
	LinkedList utilise un chainage double (deux pointeurs) d’ou une
	consommation de memoire plus elevee.*/
	


}
