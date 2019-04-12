package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Proprietaire;

public interface IProprietaireService {

	public Proprietaire findOne (int id);
	
	public List<Proprietaire> findAll();
	
	public Proprietaire create(Proprietaire proprietaire);
	
	public Proprietaire update(Proprietaire proprietaire);
	
	public int delete(int id);
}
