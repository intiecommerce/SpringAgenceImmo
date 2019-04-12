package fr.adaming.model;

import java.util.Date;

import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class BienALouer extends BienImmobilier {

	// Attributs
	private double caution;
	private double loyer;
	private double charge;
	private String typeBail;
	private String garniture;
	
	// Constructeurs
	public BienALouer() {
		super();
	}

	public BienALouer(String titre, String description, String statut, double superficie, double prix, String offre,
			String type, Date dateMiseEnVente, Date dateDisponibilité, double revenuCadastral, int nombreChambre,
			String photo, Adresse adresse, double caution, double loyer, double charge, String typeBail,
			String garniture) {
		super(titre, description, statut, superficie, prix, offre, type, dateMiseEnVente, dateDisponibilité,
				revenuCadastral, nombreChambre, photo, adresse);
		this.caution = caution;
		this.loyer = loyer;
		this.charge = charge;
		this.typeBail = typeBail;
		this.garniture = garniture;
	}


	public BienALouer(int idBienImmobilier, String titre, String description, String statut, double superficie,
			double prix, String offre, String type, Date dateMiseEnVente, Date dateDisponibilité,
			double revenuCadastral, int nombreChambre, String photo, Adresse adresse, double caution, double loyer,
			double charge, String typeBail, String garniture) {
		super(idBienImmobilier, titre, description, statut, superficie, prix, offre, type, dateMiseEnVente,
				dateDisponibilité, revenuCadastral, nombreChambre, photo, adresse);
		this.caution = caution;
		this.loyer = loyer;
		this.charge = charge;
		this.typeBail = typeBail;
		this.garniture = garniture;
	}

	// Getters & Setters
	public double getCaution() {
		return caution;
	}

	public void setCaution(double caution) {
		this.caution = caution;
	}

	public double getLoyer() {
		return loyer;
	}

	public void setLoyer(double loyer) {
		this.loyer = loyer;
	}

	public double getCharge() {
		return charge;
	}

	public void setCharge(double charge) {
		this.charge = charge;
	}

	public String getTypeBail() {
		return typeBail;
	}

	public void setTypeBail(String typeBail) {
		this.typeBail = typeBail;
	}

	public String getGarniture() {
		return garniture;
	}

	public void setGarniture(String garniture) {
		this.garniture = garniture;
	} 
	
}
