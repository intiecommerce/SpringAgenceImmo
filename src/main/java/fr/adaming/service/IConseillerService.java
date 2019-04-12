package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Conseiller;

public interface IConseillerService {
	
	public Conseiller findOne (int id);
	
	public List<Conseiller> findAll();
	
	public Conseiller create(Conseiller conseiller);
	
	public Conseiller update(Conseiller conseiller);
	
	public int delete(Conseiller conseiller);

}
