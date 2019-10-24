package Test;

import org.eclipse.model.Personne;
import org.eclipse.model.PersonneClasseLocale;

public class Main {

	public static void main(String[] args) 
	{
//		Personne p1 = new Personne("el mouelhi","achref",44);
//		System.out.println(p1);
		PersonneClasseLocale p2 = new PersonneClasseLocale("Biheux","yoann",44);
		p2.afficherDetails();
		

	}

}
