package org.eclipse.model;

public class Enseignant extends Personne 
{
	private float salaire;

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}
	



	public Enseignant(String nomString, int num, String prenomString, float salaire) {
		super(nomString, num, prenomString);
		this.salaire = salaire;
	}
	
	



	public Enseignant() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Enseignant ["+super.toString()+",salaire=" + salaire + "]";
	}
	

}
