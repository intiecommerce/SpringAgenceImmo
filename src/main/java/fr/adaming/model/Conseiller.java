package fr.adaming.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@SuppressWarnings("serial")
@DiscriminatorValue(value="Conseiller")
@Entity
public class Conseiller extends Personne {

	// Attributs
	@OneToMany(mappedBy="conseillerVisite", cascade=CascadeType.ALL)
	private List<Visite> visites;
	
	@OneToMany(mappedBy="conseillerResponsable", cascade=CascadeType.ALL)
	private List<BienImmobilier> biens;
	
	@OneToMany(mappedBy="conseiller", cascade=CascadeType.ALL)
	private List<Dossier> dossiers;

	// Getters & Setters
	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}

	public List<BienImmobilier> getBiens() {
		return biens;
	}

	public void setBiens(List<BienImmobilier> biens) {
		this.biens = biens;
	}

	public List<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}
	
}