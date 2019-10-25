package org.eclipse.interfaces;

@FunctionalInterface
public interface IMiseEnforme 
{
	public void afficherDetails();
	default public void afficherNomComplet(String nom,String prenom)
	{
		System.out.println(nom + " " + prenom);
	}

}
