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


	public BienAVendre(String titre, String description, String statut, double superficie, double prix, String offre,
			String type, Date dateMiseEnVente, Date dateDisponibilité, double revenuCadastral, int nombreChambre,
			String photo, Adresse adresse, String etat) {
		super(titre, description, statut, superficie, prix, offre, type, dateMiseEnVente, dateDisponibilité,
				revenuCadastral, nombreChambre, photo, adresse);
		this.etat = etat;
	}

	public BienAVendre(int idBienImmobilier, String titre, String description, String statut, double superficie,
			double prix, String offre, String type, Date dateMiseEnVente, Date dateDisponibilité,
			double revenuCadastral, int nombreChambre, String photo, Adresse adresse, String etat) {
		super(idBienImmobilier, titre, description, statut, superficie, prix, offre, type, dateMiseEnVente,
				dateDisponibilité, revenuCadastral, nombreChambre, photo, adresse);
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
