package org.eclipse.main;

public interface  IMiseEnforme 
{
	public abstract void afficherDetails();
	default public void afficherNomComplet(String nom,String prenom)
	{
		System.out.println(nom+" "+prenom);
	}

}
