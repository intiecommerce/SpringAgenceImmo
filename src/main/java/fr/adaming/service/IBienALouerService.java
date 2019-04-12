package fr.adaming.service;

import java.util.List;

import fr.adaming.model.BienALouer;


public interface IBienALouerService {
	

	
	public BienALouer findOne (int id);
	
	public List<BienALouer> findAll();
	
	public BienALouer create(BienALouer bal);
	
	public BienALouer update(BienALouer bal);
	
	public int delete(int id);

}
