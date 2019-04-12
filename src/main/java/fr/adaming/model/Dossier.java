package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Dossier implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idDossier;
	@Temporal(TemporalType.DATE)
	private Date dateAcquisition;
	
	@ManyToOne
	@JoinColumn(name="client_id", referencedColumnName="id")
	private Personne client;
	
	@ManyToOne
	@JoinColumn(name="id_conseiller", referencedColumnName="id")
	private Personne conseiller;
	
	@ManyToOne
	@JoinColumn(name="id_bienImmobilier", referencedColumnName="idBienImmobilier")
	private BienImmobilier bienImmobilier;

	// Constructeurs
	public Dossier() {
		super();
	}

	public Dossier(Date dateAcquisition) {
		super();
		this.dateAcquisition = dateAcquisition;
	}

	public Dossier(int idDossier, Date dateAcquisition) {
		super();
		this.idDossier = idDossier;
		this.dateAcquisition = dateAcquisition;
	}

	// Getters & Setters
	public int getIdDossier() {
		return idDossier;
	}

	public void setIdDossier(int idDossier) {
		this.idDossier = idDossier;
	}

	public Date getDateAcquisition() {
		return dateAcquisition;
	}

	public void setDateAcquisition(Date dateAcquisition) {
		this.dateAcquisition = dateAcquisition;
	}

	public Personne getClient() {
		return client;
	}

	public void setClient(Personne client) {
		this.client = client;
	}

	public Personne getConseiller() {
		return conseiller;
	}

	public void setConseiller(Personne conseiller) {
		this.conseiller = conseiller;
	}

	public BienImmobilier getBienImmobilier() {
		return bienImmobilier;
	}

	public void setBienImmobilier(BienImmobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}
	
}