package fr.adaming.service;

import java.util.List;

import fr.adaming.model.BienAVendre;

public interface IBienAVendreService {

	public BienAVendre findOne (int id);
	
	public List<BienAVendre> findAll();
	
	public BienAVendre create(BienAVendre bav);
	
	public BienAVendre update(BienAVendre bav);
	
	public int delete(int id);
}
