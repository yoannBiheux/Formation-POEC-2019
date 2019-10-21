package org.eclipse.model;

public class Etudiant extends Personne 
{
	private int niveau;

	public int getNiveau() {
		return niveau;
	}

	public void setNiveauString(int niveau) {
		this.niveau = niveau;
	}

	public Etudiant(String nomString, int num, String prenomString, int niveau) {
		super(nomString, num, prenomString);
		this.niveau = niveau;
	}

	@Override
	public String toString() {
		return "Etudiant ["+super.toString()+",niveau=" + niveau + "]";
	}
	
	public String afficherDetail()
	{
		return "Etudiant:"+this.niveau;
	}
	
	
	

}
