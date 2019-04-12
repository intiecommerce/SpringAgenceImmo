package fr.adaming.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
public class ClasseStandard implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idClasseStandard;
	private String typeBien;
	private String description;
	private String offre;
	private double prixMax;
	private double surfaceMin;
	
	@ManyToMany
	@JoinTable(name = "association_classestandards_client", 
	joinColumns = @JoinColumn(name = "id_client"),
	inverseJoinColumns = @JoinColumn(name = "id_classestandards"))
	@JsonIgnoreProperties("classesStandards")
	private List<Personne> clients;
	
	@OneToMany(mappedBy="classeStandard", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("classeStandard")
	private List<BienImmobilier> biensImmobiliers;

	// Constructeur
	public ClasseStandard() {
		super();
	}

	public ClasseStandard(String typeBien, String description, String offre, double prixMax, double surfaceMin) {
		super();
		this.typeBien = typeBien;
		this.description = description;
		this.offre = offre;
		this.prixMax = prixMax;
		this.surfaceMin = surfaceMin;
	}

	public ClasseStandard(int idClasseStandard, String typeBien, String description, String offre, double prixMax,
			double surfaceMin) {
		super();
		this.idClasseStandard = idClasseStandard;
		this.typeBien = typeBien;
		this.description = description;
		this.offre = offre;
		this.prixMax = prixMax;
		this.surfaceMin = surfaceMin;
	}

	// Getters & Setters
	public int getIdClasseStandard() {
		return idClasseStandard;
	}

	public void setIdClasseStandard(int idClasseStandard) {
		this.idClasseStandard = idClasseStandard;
	}

	public String getTypeBien() {
		return typeBien;
	}

	public void setTypeBien(String typeBien) {
		this.typeBien = typeBien;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getOffre() {
		return offre;
	}

	public void setOffre(String offre) {
		this.offre = offre;
	}

	public double getPrixMax() {
		return prixMax;
	}

	public void setPrixMax(double prixMax) {
		this.prixMax = prixMax;
	}

	public double getSurfaceMin() {
		return surfaceMin;
	}

	public void setSurfaceMin(double surfaceMin) {
		this.surfaceMin = surfaceMin;
	}

	public List<Personne> getClients() {
		return clients;
	}

	public void setClients(List<Personne> clients) {
		this.clients = clients;
	}

	public List<BienImmobilier> getBiensImmobiliers() {
		return biensImmobiliers;
	}

	public void setBiensImmobiliers(List<BienImmobilier> biensImmobiliers) {
		this.biensImmobiliers = biensImmobiliers;
	}

}
