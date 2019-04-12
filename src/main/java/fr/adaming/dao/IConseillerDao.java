package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Proprietaire;

public interface IConseillerDao {

	public List<Proprietaire> afficherTousProprietaire();
	
	public Proprietaire ajouterProprietaire(Proprietaire pro);
	
	public Proprietaire modifierProprietaire(Proprietaire pro);
	
	public void supprimerProprietaire(int id);
	
	public Proprietaire chercherProprietaireParId(int id);
}
