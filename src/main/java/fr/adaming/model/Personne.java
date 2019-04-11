package fr.adaming.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "fonction")
@DiscriminatorValue(value = "Personne")
public class Personne implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int id;
	protected String nom;
	protected String prenom;
	protected String mail;
	protected String mdp;
	protected String telephone;
	protected String role;
	protected boolean active;

	@Embedded
	protected Adresse adresse;

	public Personne() {
		super();
	}

	// Constructeur
	public Personne(String nom, String prenom, String mail, String mdp, String telephone, String role, boolean active,
			Adresse adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.mdp = mdp;
		this.telephone = telephone;
		this.role = role;
		this.active = active;
		this.adresse = adresse;
	}

	public Personne(int id, String nom, String prenom, String mail, String mdp, String telephone, String role,
			boolean active, Adresse adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.mdp = mdp;
		this.telephone = telephone;
		this.role = role;
		this.active = active;
		this.adresse = adresse;
	}

	// Getters & Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
