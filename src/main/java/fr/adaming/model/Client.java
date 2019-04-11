package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@DiscriminatorValue(value = "Client")
@Entity
public class Client extends Personne {

	// Attributs
	private boolean acquereur;

	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
	private List<Dossier> dossiers;

	@ManyToMany(mappedBy="clients", cascade=CascadeType.ALL)
	private List<ClasseStandard> classesStandards;
	
	@OneToMany(mappedBy="client", cascade=CascadeType.ALL)
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
	
}
