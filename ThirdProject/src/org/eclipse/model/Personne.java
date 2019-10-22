package org.eclipse.model;

public class Personne 
{
	private String nomString;
	private int num;
	private String prenomString;
	private static int nbPers;
	private Adresse adr;
	
	
	public Adresse getAdr() {
		return adr;
	}
	public void setAdr(Adresse adr) {
		this.adr = adr;
	}
	public String getNomString() {
		return nomString;
	}
	public void setNomString(String nomString) {
		this.nomString = nomString;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		if(num>=1)
			this.num = num;
	}
	public String getPrenomString() {
		return prenomString;
	}
	public void setPrenomString(String prenomString) {
		this.prenomString = prenomString;
	}

	public Personne(String nomString, int num, String prenomString) 
	{
		this.nomString = nomString;
		this.setNum(num);
		this.prenomString = prenomString;
		this.nbPers++;
	}
	
	
	public Personne(String nomString, int num, String prenomString, Adresse adr) {

		this.nomString = nomString;
		this.setNum(num);
		this.prenomString = prenomString;
		this.adr = adr;
		nbPers++;
	}
	public static int getNbPers() {
		return nbPers;
	}

	public Personne() 
	{
		nbPers++;
	}
	@Override
	public String toString() {
		return "Personne [nom:" + nomString + ", num:" + num + ", prenom:" + prenomString + ", adresse:"+adr+"]";
	}
	
	
	
	
	
	

	
	
	

}
