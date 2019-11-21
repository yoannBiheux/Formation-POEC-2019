package org.eclipse.model;

import java.util.List;

public class Personne {
	private int id;
	private String nom;
	private Adresse adresse;
	//private List<String>sports; 

	public Personne() {
	}

	public Personne(int id, String nom) {
		this.id = id;
		this.nom = nom;
	}
	
//	public List<String> getSports() {
//		return sports;
//	}
//
//	public void setSports(List<String> sports) {
//		this.sports = sports;
//	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void afficher(){
		System.out.println(this.id+" "+this.nom+" "+this.adresse);

		}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", adresse=" + adresse + "]";
	}






	
	
	
	
	
	

}
