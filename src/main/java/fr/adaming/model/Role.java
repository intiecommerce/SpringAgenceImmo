package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Role implements Serializable {

	// Attrbuts
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_r")
	private int idRole;
	private String roleName;
	
	@ManyToOne
	@JoinColumn(name="p_id", referencedColumnName="id" )
	private Personne personne;

	// Getters & Setters	
	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Personne getPersonne() {
		return personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
}
