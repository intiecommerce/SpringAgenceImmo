package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import fr.adaming.dao.IGenericDao;
import fr.adaming.model.Client;

@Service("clientService")
@Transactional
public class ClientServiceImpl implements IClientService{

	IGenericDao<Client> cDao;
	@Autowired
	public void setDao(IGenericDao<Client> daoToSet){
		cDao = daoToSet;
		cDao.setClazz(Client.class);
	}
	@Override
	public Client findOne(int id) {
		// TODO Auto-generated method stub
		return cDao.findOne(id);
	}
	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		return cDao.findAll();
	}
	@Override
	public Client create(Client client) {
		// TODO Auto-generated method stub
		return cDao.create(client);
	}
	@Override
	public Client update(Client client) {
		// TODO Auto-generated method stub
		return cDao.update(client);
	}
	@Override
	public int delete(Client client) {
		// TODO Auto-generated method stub
		return cDao.delete(client);
	}
}
