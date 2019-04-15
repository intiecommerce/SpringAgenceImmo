package fr.adaming.service;

import java.util.List;

import fr.adaming.model.BienImmobilier;
import fr.adaming.model.ClasseStandard;
import fr.adaming.model.Client;



public interface IClientService {

	public Client findOne (int id);
	
	public List<Client> findAll();
	
	public Client create(Client client);
	
	public Client update(Client client);
	

	public int delete(int id);

	public int delete(Client client);
	
	public List<ClasseStandard> findAllClasseStandardByClient(int id);
	
	public List<Client> findAllClientByClassStandard(int id);
	
	public List<BienImmobilier> findAllBienImmoByClassStandard(int id);

}
