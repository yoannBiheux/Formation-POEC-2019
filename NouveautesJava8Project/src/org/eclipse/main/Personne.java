package org.eclipse.main;

public class Personne 
{
	private String nom;
	private String prenom;
	private int age;
	public IMiseEnforme iMiseEnForme = new IMiseEnforme() 
	{
		@Override
		public void afficherDetails() 
		{
		// TODO Auto-generated method stub
		System.out.println("nom = " + nom + ", prenom = " + prenom);
		}
	};
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		}

	

}
