package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Client;



public interface IClientService {

	public Client findOne (int id);
	
	public List<Client> findAll();
	
	public Client create(Client client);
	
	public Client update(Client client);
	
	public int delete(Client client);
}
