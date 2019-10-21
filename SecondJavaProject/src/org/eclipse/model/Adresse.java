package org.eclipse.model;

public class Adresse 
{
	
	private String rueString;
	private String villeString;
	private String codePostalString;
	
	public String getRueString() {
		return rueString;
	}
	public void setRueString(String rueString) {
		this.rueString = rueString;
	}
	public String getVilleString() {
		return villeString;
	}
	public void setVilleString(String villeString) {
		this.villeString = villeString;
	}
	public String getCodePostalString() {
		return codePostalString;
	}
	public void setCodePostalString(String codePostalString) {
		this.codePostalString = codePostalString;
	}
	public Adresse(String rueString, String villeString, String codePostalString) {
		
		this.rueString = rueString;
		this.villeString = villeString;
		this.codePostalString = codePostalString;
	}
	@Override
	public String toString() {
		return "rue=" + rueString + ", ville=" + villeString + ", codePostal="
				+ codePostalString ;
	}
	
	
	
	

}
