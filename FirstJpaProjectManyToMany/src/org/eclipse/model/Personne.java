package org.eclipse.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;


/**
 * The persistent class for the personne database table.
 * 
 */
@Entity
@NamedQueries({@NamedQuery(name="findByNomPrenom"
,query="SELECT p FROM Personne p WHERE p.nom = :nom and p.prenom = :prenom")
,@NamedQuery(name="findByPrenom",query="SELECT p FROM Personne p WHERE p.prenom =:prenom")})
public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int num;
	private String nom;
	private String prenom;
	//@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	@OneToMany(cascade={CascadeType.PERSIST,CascadeType.REMOVE}, fetch = FetchType.EAGER)
	private List<Adresse> adresses = new ArrayList <Adresse>();
	@ManyToMany(cascade={CascadeType.PERSIST, CascadeType.REMOVE})
	private List<Sport> sports =new ArrayList<Sport>();

	public List<Sport> getSports() {
		return sports;
	}

	public void setSports(List<Sport> sports) {
		this.sports = sports;
	}
	
	public void removeSport(Sport sport) {
		this.sports.remove(sport);
	}
	
	public void addSport(Sport sport) {
		this.sports.add(sport);
	}

	public List<Adresse> getAdresse() {
		return adresses;
	}

	public void setAdresses(List<Adresse> adresses) {
		this.adresses = adresses;
	}



	public void removeAdresse(Adresse adresse) {
		this.adresses.remove(adresse);
	}
	
	public void addAdresse(Adresse adresse) {
		this.adresses.add(adresse);
	}

	public Personne() {
	}
	
	





	@Override
	public String toString() {
		return "Personne [num=" + num + ", nom=" + nom + ", prenom=" + prenom + ", adresses=" + adresses + "]";
	}

	public int getNum() {
		return this.num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}



}