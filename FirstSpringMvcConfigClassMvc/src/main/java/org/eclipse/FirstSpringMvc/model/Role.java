package org.eclipse.FirstSpringMvc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titre;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Role() {

		// TODO Auto-generated constructor stub
	}

	public Role(String titre) {
		super();
		this.titre = titre;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", titre=" + titre + "]";
	}
	
	
	
	

}
