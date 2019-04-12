package fr.adaming.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@SuppressWarnings("serial")
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BienImmobilier implements Serializable {

	// Attributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int idBienImmobilier;
	protected String titre;
	protected String description;
	protected String statut;
	protected double superficie;
	protected double prix;
	protected String offre;
	protected String type;
	@Temporal(TemporalType.DATE)
	protected Date dateMiseEnVente;
	@Temporal(TemporalType.DATE)
	protected Date dateDisponibilité;
	protected double revenuCadastral;
	protected int nombreChambre;
	
	@Lob
	protected String photo;


	@Embedded
	protected Adresse adresse;

	@ManyToOne
	@JoinColumn(name = "id_proprietaire", referencedColumnName = "id")
	@JsonIgnoreProperties("biensImmobilier")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Personne proprietaire;

	@ManyToOne
	@JoinColumn(name = "id_conseiller", referencedColumnName = "id")
	@JsonIgnoreProperties("biens")
	@LazyCollection(LazyCollectionOption.FALSE)
	private Personne conseillerResponsable;

	@ManyToOne
	@JoinColumn(name = "id_classeStandard", referencedColumnName = "idClasseStandard")
	@JsonIgnoreProperties("biensImmobiliers")
	@LazyCollection(LazyCollectionOption.FALSE)
	private ClasseStandard classeStandard;

	
	@OneToMany(mappedBy = "bienImmobilier", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("bienImmobilier")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Visite> visites;

	
	@OneToMany(mappedBy = "bienImmobilier", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("bienImmobilier")
	@LazyCollection(LazyCollectionOption.FALSE)
	private List<Dossier> dossiers;

	// Constructeurs
	public BienImmobilier() {
		super();
	}

	public BienImmobilier(String titre, String description, String statut, double superficie, double prix, String offre,
			String type, Date dateMiseEnVente, Date dateDisponibilité, double revenuCadastral, int nombreChambre,
			String photo, Adresse adresse) {
		super();
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.superficie = superficie;
		this.prix = prix;
		this.offre = offre;
		this.type = type;
		this.dateMiseEnVente = dateMiseEnVente;
		this.dateDisponibilité = dateDisponibilité;
		this.revenuCadastral = revenuCadastral;
		this.nombreChambre = nombreChambre;
		this.photo = photo;
		this.adresse = adresse;
	}

	public BienImmobilier(int idBienImmobilier, String titre, String description, String statut, double superficie,
			double prix, String offre, String type, Date dateMiseEnVente, Date dateDisponibilité,
			double revenuCadastral, int nombreChambre, String photo, Adresse adresse) {
		super();
		this.idBienImmobilier = idBienImmobilier;
		this.titre = titre;
		this.description = description;
		this.statut = statut;
		this.superficie = superficie;
		this.prix = prix;
		this.offre = offre;
		this.type = type;
		this.dateMiseEnVente = dateMiseEnVente;
		this.dateDisponibilité = dateDisponibilité;
		this.revenuCadastral = revenuCadastral;
		this.nombreChambre = nombreChambre;
		this.photo = photo;
		this.adresse = adresse;
	}

	// Getters & Setters
	public int getIdBienImmobilier() {
		return idBienImmobilier;
	}

	public void setIdBienImmobilier(int idBienImmobilier) {
		this.idBienImmobilier = idBienImmobilier;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public String getOffre() {
		return offre;
	}

	public void setOffre(String offre) {
		this.offre = offre;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateMiseEnVente() {
		return dateMiseEnVente;
	}

	public void setDateMiseEnVente(Date dateMiseEnVente) {
		this.dateMiseEnVente = dateMiseEnVente;
	}

	public Date getDateDisponibilité() {
		return dateDisponibilité;
	}

	public void setDateDisponibilité(Date dateDisponibilité) {
		this.dateDisponibilité = dateDisponibilité;
	}

	public double getRevenuCadastral() {
		return revenuCadastral;
	}

	public void setRevenuCadastral(double revenuCadastral) {
		this.revenuCadastral = revenuCadastral;
	}

	public int getNombreChambre() {
		return nombreChambre;
	}

	public void setNombreChambre(int nombreChambre) {
		this.nombreChambre = nombreChambre;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Personne getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Personne proprietaire) {
		this.proprietaire = proprietaire;
	}

	public Personne getConseillerResponsable() {
		return conseillerResponsable;
	}

	public void setConseillerResponsable(Personne conseillerResponsable) {
		this.conseillerResponsable = conseillerResponsable;
	}

	public List<Visite> getVisites() {
		return visites;
	}

	public void setVisites(List<Visite> visites) {
		this.visites = visites;
	}

	public List<Dossier> getDossiers() {
		return dossiers;
	}

	public void setDossiers(List<Dossier> dossiers) {
		this.dossiers = dossiers;
	}

	public ClasseStandard getClasseStandard() {
		return classeStandard;
	}

	public void setClasseStandard(ClasseStandard classeStandard) {
		this.classeStandard = classeStandard;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
