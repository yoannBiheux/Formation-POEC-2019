package org.eclipse.model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Sport
 *
 */
@Entity
public class Sport implements Serializable {

	   
	@Id
	private String nom;
	private String type;
	private static final long serialVersionUID = 1L;

	public Sport() {
		super();
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Sport [nom=" + nom + ", type=" + type + "]";
	}
	public Sport(String nom, String type) {
		super();
		this.nom = nom;
		this.type = type;
	}
	
	
   
}
