package fr.adaming.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Embeddable;

@Embeddable
@Access(AccessType.FIELD)
public class Adresse {

	// Attributs
	private String nomAdresse;
	private String codePostal;
	private String ville;
	private String pays;
	
	// Constructeurs
	public Adresse() {
		super();
	}

	public Adresse(String nomAdresse, String codePostal, String ville, String pays) {
		super();
		this.nomAdresse = nomAdresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
	}

	// Getters & Setters
	public String getNomAdresse() {
		return nomAdresse;
	}

	public void setNomAdresse(String nomAdresse) {
		this.nomAdresse = nomAdresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}
	
}
