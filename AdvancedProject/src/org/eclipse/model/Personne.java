package org.eclipse.model;

public class Personne 
{
	private String nom;
	private String prenom;
	private int age;
	private Categorie categorie;
	
	
	
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
	public Personne(String nom, String prenom, int age) 
	{
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		categorie = new Categorie();
		
	}
	@Override

	public String toString() 
	{
		return "Personne [nom = " + nom + ", prenom = " + prenom + ", age =	" + age + ", categorie = " + categorie + "]";
	}
	
	public class Categorie 
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
			{
				majoriteSexuelle = "mineur";
				if (age < 2)
				periode = "bebe";
				else if(age < 12)
				periode = "enfant";
				else
				periode = "adolescent";
		}
		}
		@Override
		public String toString() 
		{
			return "Categorie [majoriteSexuelle = " + majoriteSexuelle + ",periode = " + periode + "]";
		}
	}
	
	
	
	
	
	

	
	
	

}
