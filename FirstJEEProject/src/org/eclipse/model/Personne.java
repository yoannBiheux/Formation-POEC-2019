package org.eclipse.model;

import java.io.Serializable;

public class Personne implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num;
	private String nom;
	private String prenom; // tous les champs sont private
	
	public int getNum() 
	{
		return num;
	}
	public void setNum(int num) 
	{
		this.num = num;
	}
	public String getNom() 
	{
		return nom;
	}// des getters/setters public pour tous les champs
	public void setNom(String nom) 
	{
		this.nom = nom;
	}
	public String getPrenom() 
	{
		return prenom;
	}
	public void setPrenom(String prenom) 
	{
		this.prenom = prenom;
	}
	@Override
	public String toString() 
	{
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + "]";
	}
	public Personne() 
	{

		// TODO Auto-generated constructor stub
	}
	public Personne(int num, String nom, String prenom) 
	{
		this.num = num;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	
	
	
	

}
