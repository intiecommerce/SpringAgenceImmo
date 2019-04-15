package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.BienImmobilier;
import fr.adaming.model.ClasseStandard;
import fr.adaming.model.Client;

@Service("clientService")
@Transactional
public class ClientServiceImpl implements IClientService{

	@Autowired
	IClientDao cDao;
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
	public int delete(int id) {
		// TODO Auto-generated method stub
		return cDao.delete(id);
	}
	@Override
	public List<ClasseStandard> findAllClasseStandardByClient(int id) {
		// TODO Auto-generated method stub
		return cDao.findAllClasseStandardByClient(id);
	}
	@Override
	public List<Client> findAllClientByClassStandard(int id) {
		// TODO Auto-generated method stub
		return cDao.findAllClientByClassStandard(id);
	}
	@Override
	public List<BienImmobilier> findAllBienImmoByClassStandard(int id) {
		// TODO Auto-generated method stub
		return cDao.findAllBienImmoByClassStandard(id);
	}
}
