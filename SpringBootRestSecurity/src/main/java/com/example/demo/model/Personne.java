package com.example.demo.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personnes")
public class Personne  
{
	@Id 
	@GeneratedValue
	private Long num;
	private String nom;
	private String prenom;
//	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.REFRESH},fetch = FetchType.EAGER)
//	private List<Adresse> adresses = new ArrayList<Adresse>();
//	
//	public List<Adresse> getAdresses() {
//		return adresses;
//	}
//	public void setAdresses(List<Adresse> adresses) {
//		this.adresses = adresses;
//	}
	private static final long serialVersionUID = 1L;
	
	
//	public Personne(String nom,	String prenom,	List<Adresse> adresses) {
//
//		this.nom = nom;
//		this.prenom = prenom;
//		this.adresses = adresses;
//	}
	public Personne() 
	{ 
		
	}
	public Personne(String nom,	String prenom)
	{
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
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
	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom +  "]";
	}
//	public boolean add(Adresse e) {
//		return adresses.add(e);
//	}
//	public boolean remove(Adresse o) {
//		return adresses.remove(o);
//	}
	
	


	
	
	

}
