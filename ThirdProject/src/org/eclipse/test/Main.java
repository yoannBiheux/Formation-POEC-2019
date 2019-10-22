package org.eclipse.test;

import org.eclipse.model.Enseignant;
import org.eclipse.model.Exemple;
import org.eclipse.model.Humain;
import org.eclipse.model.Operation;
import org.eclipse.model.Personne;
import org.eclipse.model.Vehicule;
import org.eclipse.model.Etudiant;

public class Main {

	public static void main(String[] args) 
	{
		/*Exemple<Integer> ex1 = new Exemple<Integer>();
		ex1.setVar(10);
		System.out.println(ex1.getVar().getClass().getTypeName());
		System.out.println( ex1.getVar().getClass().getTypeName() + " " + ex1.getVar());
		Exemple<String> chaine = new Exemple<String>();
		chaine.setVar("Bonjour");
		System.out.println( chaine.getVar().getClass().getTypeName() + " " + chaine.getVar());
		Personne personne =new Personne("biheux",1,"yoann");
		Exemple<Personne> exemple = new Exemple<Personne>();
		
		Personne personne =new Personne("biheux",1,"yoann");
		Personne personne2 =new Personne("davoust",2,"fabrice");
		
		Operation<Double> op1 =new Operation<Double>(5.2, 4.8);
		
		Operation<Integer> op2 =new Operation<Integer>(11, 8);
		Operation<String> op3 =new Operation<String>("Sa", "lut");
		Operation<Boolean> op4 =new Operation<Boolean>(true, false);
		Operation<Personne> op5 = new Operation<Personne>(personne, personne2);
		op1.plus();
		op2.plus();
		op3.plus();
		op4.plus();
		op5.plus();*/
		
		Humain<Personne> h1 = new Humain();
		Humain<Etudiant> h2 = new Humain();
		Humain<Enseignant> h3 = new Humain();
		//Humain<Vehicule> h4 = new Humain()
		
		
		

	}

}
