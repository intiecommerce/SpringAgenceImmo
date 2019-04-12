package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Proprietaire;

public interface IConseillerService {
	
	public List<Proprietaire> afficherTousProprietaire();
	
	public Proprietaire ajouterProprietaire(Proprietaire pro);
	
	public Proprietaire modifierProprietaire(Proprietaire pro);
	
	public void supprimerProprietaire(int id);
	
	public Proprietaire chercherProprietaireParId(int id);

}
