package org.eclipse.FirstSpringMvc.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
public class Adresse implements Serializable{
	
	@Id 
	@GeneratedValue
	private long id;
	private String rue;
	private String ville;
	private String codePostal;
	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER,mappedBy="adresses")
	private List<Personne> personnes = new ArrayList<Personne>();

	
	
	
	public List<Personne> getPersonnes() {
		return personnes;
	}
	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public Adresse(int id, String rue, String ville, String codePostal) {

		this.id = id;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	public Adresse() {

		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Adresse [id=" + id + ", rue=" + rue + ", ville=" + ville + ", codePostal=" + codePostal + "]";
	}
	public boolean add(Personne e) {
		return personnes.add(e);
	}
	public boolean remove(Object o) {
		return personnes.remove(o);
	}
	
	
	
	

}
