package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Conseiller;
import fr.adaming.model.Dossier;

public interface IDossierService {

	public Dossier findOne (int id);
	
	public List<Dossier> findAll();
	
	public Dossier create(Dossier dossier);
	
	public Dossier update(Dossier dossier);
	
	public int delete(Dossier dossier);
}
