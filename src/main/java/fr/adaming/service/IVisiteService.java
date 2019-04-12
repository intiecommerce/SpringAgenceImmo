package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Visite;

public interface IVisiteService {
	
public Visite findOne (int id);
	
	public List<Visite> findAll();
	
	public Visite create(Visite visite);
	
	public Visite update(Visite visite);
	
	public int delete(int id);

}
