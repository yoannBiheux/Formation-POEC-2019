package org.eclipse.test;

import org.eclipse.model.Adresse;
import org.eclipse.model.Enseignant;
import org.eclipse.model.Etudiant;
import org.eclipse.model.Personne;

public class Main {

	public static void main(String[] args) 
	{
		Personne p1 = new Personne();

		p1.setNomString("biheux");
		p1.setPrenomString("yoann");
		p1.setNum(0);
		System.out.println(p1);
		System.out.println(Personne.getNbPers());
		Personne p2 = new Personne("briffoteaux",2,"john");
		System.out.println(p2);
		System.out.println(Personne.getNbPers());
		
		Adresse ad1 = new Adresse("rebeval", "Paris", "75019");
		Personne p3 = new Personne("bullock",9,"Sandra",ad1);
		System.out.println(p3);
		System.out.println(Personne.getNbPers());
		
		Enseignant profEnseignant =new Enseignant();
		profEnseignant.setNum(4);
		profEnseignant.setPrenomString("camelia");
		profEnseignant.setNomString("jordana");
		profEnseignant.setSalaire(2200);
		System.out.println(Personne.getNbPers());
		
		Etudiant etud1 = new Etudiant("tutu", 4, "toto", 40);
		Personne etud2 = new Etudiant("demay", 14, "sabrina", 90);
		
		System.out.println(profEnseignant);
		Enseignant prof2 = new Enseignant("toto",12,"cutugno",4000);
		System.out.println(prof2);
		
		System.out.println(p2 instanceof Enseignant);
		
		Personne[] personnes = {profEnseignant,prof2,etud1,etud2};
		
		for(Personne perso:personnes)
		{
			System.out.println(perso);
		}
	}

	

}


