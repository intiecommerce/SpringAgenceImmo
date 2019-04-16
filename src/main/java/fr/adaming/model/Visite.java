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

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
public class Visite implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idVisite;
	
	@Temporal(TemporalType.DATE)
	private Date dateVisite;
	
	@Temporal(TemporalType.TIME)
	private Date heureVisite;
	
	@ManyToOne
	@JoinColumn(name="id_client", referencedColumnName="id")
	@JsonIgnoreProperties({"visites","classesStandards","dossiers"})
	@LazyCollection(LazyCollectionOption.FALSE)
	private Personne client;
	
	@ManyToOne
	@JoinColumn(name="id_conseiller", referencedColumnName="id")
	@JsonIgnoreProperties("visites")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Personne conseillerVisite;
	
	@ManyToOne
	@JoinColumn(name="id_bienImmobilier", referencedColumnName="idBienImmobilier")
	@JsonIgnoreProperties("visites")
	@LazyCollection(LazyCollectionOption.FALSE)
	private BienImmobilier bienImmobilier;

	public Visite() {
		super();
	}
	
	public Visite(Date dateVisite, Date heureVisite, Client client, Conseiller conseillerVisite,
			BienImmobilier bienImmobilier) {
		super();
		this.dateVisite = dateVisite;
		this.heureVisite = heureVisite;
		this.client = client;
		this.conseillerVisite = conseillerVisite;
		this.bienImmobilier = bienImmobilier;
	}

	public Visite(int idVisite, Date dateVisite, Date heureVisite, Client client, Conseiller conseillerVisite,
			BienImmobilier bienImmobilier) {
		super();
		this.idVisite = idVisite;
		this.dateVisite = dateVisite;
		this.heureVisite = heureVisite;
		this.client = client;
		this.conseillerVisite = conseillerVisite;
		this.bienImmobilier = bienImmobilier;
	}

	public int getIdVisite() {
		return idVisite;
	}

	public void setIdVisite(int idVisite) {
		this.idVisite = idVisite;
	}

	public Date getDateVisite() {
		return dateVisite;
	}

	public void setDateVisite(Date dateVisite) {
		this.dateVisite = dateVisite;
	}

	public Date getHeureVisite() {
		return heureVisite;
	}

	public void setHeureVisite(Date heureVisite) {
		this.heureVisite = heureVisite;
	}

	public Personne getClient() {
		return client;
	}

	public void setClient(Personne client) {
		this.client = client;
	}

	public Personne getConseillerVisite() {
		return conseillerVisite;
	}

	public void setConseillerVisite(Personne conseillerVisite) {
		this.conseillerVisite = conseillerVisite;
	}

	public BienImmobilier getBienImmobilier() {
		return bienImmobilier;
	}

	public void setBienImmobilier(BienImmobilier bienImmobilier) {
		this.bienImmobilier = bienImmobilier;
	}

}
