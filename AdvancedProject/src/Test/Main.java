package Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Function;

import org.eclipse.model.Personne;



public class Main {

	public static void main(String[] args) 
	{
//		Personne p1 = new Personne("el mouelhi","achref",44);
//		System.out.println(p1);
//		PersonneClasseLocale p2 = new PersonneClasseLocale("Biheux","yoann",44);
//		p2.afficherDetails();
		
		//interface fonctionnelle
		//expression lambda
//		ICalcul plus = (int x,int y)->x+y;
//		//return implicite
//		ICalcul multiplierCalcul = (int x,int y)-> x*y;
//		//return explicite si on met les accolades
//		ICalcul plus2 = (int x,int y)-> {return x+y;};
//		
//		System.out.println(plus.operationBinaire(3, 5));
//		System.out.println(multiplierCalcul.operationBinaire(3, 5));
//		
//		int i =2,j=3;
//		
//		ICalcul ICalculComplexe = (x,y)->{
//			return x*i+y*j;
//		};
//		
//		Personne personne = new Personne("el mouelhi","achref",34);
//		
//		Function<Personne, String> personneToString = (Personne p)->p.getNom()+" "+p.getPrenom();
//		
//		//ou plus simple
//		
//		Function<Personne, String> personneToString2 = p-> p.getNom()+" "+p.getPrenom();
//		
//		//avec methode apply
//		System.out.println(personneToString.apply(personne));
		
//		List<Personne> personnes = Arrays.asList(
//				new Personne("nom1", "prenom1", 35),
//				new Personne("nom2", "prenom2", 18),
//				new Personne("nom3", "prenom3", 27),
//				new Personne("nom4", "prenom4", 40));
//		
//		
//		
//			System.out.print(listToStrings(personnes));
		
//			Personne p1 = new Personne("yoann", "biheux", 45);
//			
//			Function<Personne, String> personneToString = p->p.getNom()+" "+p.getPrenom();
//			Function<String,Integer> stroInt = str->str.length();
//			
//			Function<Personne,Integer> personneToInt = personneToString.andThen(stroInt);
//			
//			int longueur = personneToInt.apply(p1);
//			
//			System.out.println(longueur);
//			
//			BiFunction<Integer, Integer, Float> somme = (a,b)->(float)a+b;
//			float result = somme.apply(8, 2);
//			System.out.println(result);
//			
//			BinaryOperator<Integer> sommeBinaryOperator = (a,b)->a+b;
//			System.out.println(sommeBinaryOperator.apply(5, 7));
//			
//			Personne p2 = new Personne("yoann", "biheux", 45);			
//			Consumer <Personne> ageIncrement =	p -> p.setAge(p.getAge() + 1);
//			ageIncrement.accept(p2);
//			
//			System.out.println(p2);
			
//			ICalcul iCalcul = Main::somme;
//			
//			
//			System.out.println(iCalcul.operationBinaire(2, 4));
//		testCollections();

//		ex1();
//		ex2();
		testDate();


	}
	
	public static void testCollections()
	{
		List<Integer> liste = new ArrayList<Integer>(Arrays.asList(2, 7, 1, 3));
		//liste.removeIf(elt->elt>6);
		//liste.replaceAll(elt->elt+6);
		
		//liste.forEach(System.out::println);
		
		//liste.stream().forEach(System.out::println);
		
		liste.stream()
		.map(elt->elt+2)
		.forEach(System.out::println);
		
		liste.stream()
		.map(elt->elt+2)
		.filter(elt->elt>3)
		.forEach(System.out::println);
		
		Optional<Integer>sommeOptional = liste.stream()
		.map(elt->elt+2)
		.filter(elt->elt>3)
		.reduce((a,b)->a+b);
		
		if(sommeOptional.isPresent())
			System.out.println(sommeOptional.get());
		
		int somme2 = liste.stream()
				.map(elt->elt+2)
				.filter(elt->elt>3)
				.reduce(0,(a,b)->a+b);
		System.out.println(somme2);
		
		long nbr = liste.stream().map(elt -> elt + 2)
				.filter(elt -> elt > 5)
				.count();
		System.out.println("nombre d'elts");
		System.out.println(nbr);
		
		System.out.println("max de la liste");
		int nbMax = liste.stream()
				.max(Comparator.naturalOrder()).get();
		System.out.println(nbMax);


	}
	
	public static void ex1()
	{
		//supprimer l'avant derniere occurence de 2
		ArrayList<Integer> liste = new ArrayList(Arrays.asList(2, 7, 2, 1, 3, 9, 2, 4, 2));
		//supprimer l'avant derniere occurence de 2
		liste.remove(liste.subList(0,liste.lastIndexOf(2)).lastIndexOf(2));
		liste.forEach(System.out::println);
		
		
		
	}
	
	public static void ex2()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("veuillez saisir un entier");
		int nb=0;
		List<Integer> list = new ArrayList<>();
		do
		{
			nb=sc.nextInt();

			final int i =nb;
			
			list.add(i);
			long count =list.stream().filter(elt->elt==i)
								.count();
			
			System.out.println("le nombre d'occurence de "+nb+" est de "+count);
			
		}
		while(nb>0);
	}
	
	
	public static int somme(int x,int y) 
	{
		return 4;
	}
	
	public static String listToStrings(List<Personne> personnes)
	{
		
		Function<List<Personne>, String> personnesToString=listToStrings->
		{
			String str ="";
			for(Personne p:listToStrings)
			{
				str+=p.getAge()%2==0 ? p.getNom():p.getPrenom();
				str+="\n";
				
			}
			return str;
			
		};
		
		
		
//		for(Personne p:personnes)
//		{
//			noms.add(personneToString.apply(personnes));
//		}
		
		return personnesToString.apply(personnes);

	}
	
	public static void testDate()
	{
		LocalDateTime localDateTime = LocalDateTime.from(ZonedDateTime.now());
		LocalDateTime localDateTime2 = localDateTime.now();
		System.out.println("Date et heure actuelle : " + localDateTime);
		
		LocalDate dateNaissance = LocalDate.of(1974, Month.NOVEMBER, 18);
		System.out.println(dateNaissance);
		
		System.out.println(dateNaissance.plus(2, ChronoUnit.DAYS));
		System.out.println(dateNaissance.plus(1, ChronoUnit.WEEKS));
		// affiche 1974-11-25
		System.out.println(dateNaissance.plus(30, ChronoUnit.YEARS));
		// affiche 2004-11-18
		System.out.println(dateNaissance.plus(1, ChronoUnit.MONTHS));
		// affiche 1974-12-18
		
		System.out.println(dateNaissance.minus(2, ChronoUnit.DAYS));
		// affiche 2004-11-16
		System.out.println(dateNaissance.minus(1, ChronoUnit.WEEKS));
		// affiche 1974-11-11
		
		LocalDate lundiSuivant = dateNaissance.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
		System.out.println(lundiSuivant);
		// affiche 1974-11-25
		
		LocalDate lundiPrecedent = dateNaissance.with(TemporalAdjusters.previous(DayOfWeek.MONDAY));
		System.out.println(lundiPrecedent);
		// affiche 1974-11-11
		
		LocalDateTime dateHeureNaissance = LocalDateTime.of(1974, Month.NOVEMBER,18, 01, 30, 20);
		LocalDateTime dateDuJour = LocalDateTime.now();
		
		System.out.println(dateHeureNaissance.compareTo(dateDuJour));
		// affiche -34 (difference d’annee) car dateHeureNaissance < dateDuJour
		System.out.println(dateDuJour.compareTo(dateHeureNaissance));
		// affiche 34 car dateHeureNaissance > dateDuJour
		System.out.println(dateHeureNaissance.compareTo(dateHeureNaissance));
		// affiche 0 car dateHeureNaissance = dateDuJour
		
		System.out.println(dateHeureNaissance.isAfter(dateDuJour));
		// affiche false
		System.out.println(dateDuJour.isBefore(dateHeureNaissance));
		// affiche false
		System.out.println(dateHeureNaissance.isEqual(dateHeureNaissance));
		// affiche true
		
		System.out.println(ChronoUnit.YEARS.between(dateHeureNaissance, dateDuJour));
		// affiche 44
		
		Period period = Period.between(dateHeureNaissance.toLocalDate(), dateDuJour.toLocalDate());
		System.out.println(period.getYears());
		
		System.out.println(ChronoUnit.SECONDS.between(dateHeureNaissance, dateDuJour));
		
		System.out.println("Fuseau horaire par defaut : " +ZoneId.systemDefault());
		// affiche Fuseau horaire par d´efaut : Europe/Paris
		
		System.out.println("Regles appliquees aux heures : "+ ZoneId.systemDefault().getRules());
				// affiche Regles appliquees aux heures : ZoneRules[currentStandardOffset=+01:00]
		
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		// affiche 2019-09-22T10:33:18.496+02:00[Europe/Paris]
		
		DateTimeFormatter dateTimeFormatter =DateTimeFormatter.ofPattern("'Le' dd ' ' MM ' 'yy");
		System.out.println(zonedDateTime.format(dateTimeFormatter));
				// affiche Le 22 / septembre / 2019
		
		ZoneId.getAvailableZoneIds().forEach(System.out::println);
		// affiche une liste longue de fuseaux horaires
		
		ZoneId paris = ZoneId.of("Europe/Paris");
		ZoneId Los_Angeles = ZoneId.of("America/Los_Angeles");
		ZonedDateTime dateHeureParis = ZonedDateTime.of(LocalDateTime.now(),paris);
		System.out.println(dateHeureParis);
		// affiche 2019-09-22T20:09:27.949+02:00[Europe/Paris]
		
		ZonedDateTime losAngelesDateTime = dateHeureParis.withZoneSameInstant(Los_Angeles);
		System.out.println(losAngelesDateTime);
		// affiche 2019-09-22T14:09:27.949-04:00[US/Michigan]
		
		System.out.println(dateHeureParis.getOffset());
		// affiche +02:00

		
		

		
		
		
		



		
	}

}
