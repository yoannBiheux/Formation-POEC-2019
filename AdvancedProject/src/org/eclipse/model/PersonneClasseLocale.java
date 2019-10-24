package org.eclipse.model;

public class PersonneClasseLocale 
{
	private String nom;
	private String prenom;
	private int age;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	public PersonneClasseLocale(String nom, String prenom, int age) 
	{

		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	public void afficherDetails() 
	{
		class Categorie 
		{
			private String majoriteSexuelle;
			private String periode;
			public Categorie() 
			{
				if (age >= 18) 
				{
					majoriteSexuelle = "majeur";
					periode = "adulte";
				} 
				else 
					majoriteSexuelle = "mineur";
				
				if (age < 2)
					periode = "b´eb´e";
				else if(age < 12)
					periode = "enfant";
				else
					periode = "adolescent";
			}

			@Override
			public String toString() 
			{
				return "majoriteSexuelle=" + majoriteSexuelle + ", periode=" + periode;
			}
		}
		Categorie categorie = new Categorie();
		System.out.println("nom= " + nom + ", prenom = " + prenom + ", " + categorie);
		}

}
