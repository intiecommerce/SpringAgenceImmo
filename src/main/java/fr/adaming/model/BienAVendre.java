package fr.adaming.model;

import java.util.Date;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class BienAVendre extends BienImmobilier {

	// Attributs
	private String etat;

	// Constructeurs
	public BienAVendre() {
		super();
	}

	public BienAVendre(String statut, double superficie, double prix, String offre, String type, Date dateMiseEnVente,
			Date dateDisponibilité, double revenuCadastral, int nombreChambre, Adresse adresse, String etat) {
		super(statut, superficie, prix, offre, type, dateMiseEnVente, dateDisponibilité, revenuCadastral, nombreChambre,
				adresse);
		this.etat = etat;
	}

	public BienAVendre(int idBienImmobilier, String statut, double superficie, double prix, String offre, String type,
			Date dateMiseEnVente, Date dateDisponibilité, double revenuCadastral, int nombreChambre, Adresse adresse,
			String etat) {
		super(idBienImmobilier, statut, superficie, prix, offre, type, dateMiseEnVente, dateDisponibilité,
				revenuCadastral, nombreChambre, adresse);
		this.etat = etat;
	}

	// Getters & Setters
	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
	
}
