package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@DiscriminatorValue(value="Proprietaire")
@Entity
public class Proprietaire extends Personne {

	// Attributs
	private String telephonePro;
	
	@OneToMany(mappedBy="proprietaire", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("proprietaire")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<BienImmobilier> biensImmobilier;

	// Constructeurs
	public Proprietaire() {
		super();
	}

	public Proprietaire(String nom, String prenom, String mail, String mdp, String telephone, String role,
			boolean active, Adresse adresse, String telephonePro) {
		super(nom, prenom, mail, mdp, telephone, role, active, adresse);
		this.telephonePro = telephonePro;
	}

	public Proprietaire(int id, String nom, String prenom, String mail, String mdp, String telephone, String role,
			boolean active, Adresse adresse, String telephonePro) {
		super(id, nom, prenom, mail, mdp, telephone, role, active, adresse);
		this.telephonePro = telephonePro;
	}

	// Getters & Setters
	public String getTelephonePro() {
		return telephonePro;
	}

	public void setTelephonePro(String telephonePro) {
		this.telephonePro = telephonePro;
	}

	public List<BienImmobilier> getBiensImmobilier() {
		return biensImmobilier;
	}

	public void setBiensImmobilier(List<BienImmobilier> biensImmobilier) {
		this.biensImmobilier = biensImmobilier;
	}
	
}
