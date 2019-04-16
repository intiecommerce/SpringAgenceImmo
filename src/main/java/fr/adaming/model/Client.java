package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@DiscriminatorValue(value = "Client")
@Entity
public class Client extends Personne {

	// Attributs
	private boolean acquereur;

	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("client")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Dossier> dossiers;

	@ManyToMany(mappedBy="clients", cascade=CascadeType.ALL,targetEntity=ClasseStandard.class)
	@JsonIgnoreProperties({"clients","visites","dossiers"})
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<ClasseStandard> classesStandards;
	
	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	@JsonIgnoreProperties({"client","classesStandards","dossiers"})
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Visite> visites;

	// Constructeurs
	public Client() {
		super();
	}

	public Client(String nom, String prenom, String mail, String mdp, String telephone, String role, boolean active,
			Adresse adresse, boolean acquereur) {
		super(nom, prenom, mail, mdp, telephone, role, active, adresse);
		this.acquereur = acquereur;
	}

	public Client(int id, String nom, String prenom, String mail, String mdp, String telephone, String role,
			boolean active, Adresse adresse, boolean acquereur) {
		super(id, nom, prenom, mail, mdp, telephone, role, active, adresse);
		this.acquereur = acquereur;
	}

	// Getters & Setters
	public boolean isAcquereur() {
		return acquereur;
	}

	public void setAcquereur(boolean acquereur) {
		this.acquereur = acquereur;
	}

	public List<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

	public List<ClasseStandard> getClassesStandards() {
		return classesStandards;
	}

	public void setClassesStandards(List<ClasseStandard> classesStandards) {
		this.classesStandards = classesStandards;
	}

	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}

	@Override
	public String toString() {
		return "Client [acquereur=" + acquereur + ", id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail="
				+ mail + ", mdp=" + mdp + ", telephone=" + telephone + ", role=" + role + ", active=" + active
				+ ", adresse=" + adresse + "]";
	}
	
	
	
}
