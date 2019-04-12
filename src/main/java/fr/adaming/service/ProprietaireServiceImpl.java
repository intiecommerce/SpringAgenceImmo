package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.Proprietaire;

@Service("proprietaireService")
@Transactional
public class ProprietaireServiceImpl implements IProprietaireService{

	IGenericDao<Proprietaire> pDao;
	@Autowired
	public void setDao(IGenericDao<Proprietaire> daoToSet){
		pDao = daoToSet;
		pDao.setClazz(Proprietaire.class);
	}
	
	@Override
	public Proprietaire findOne(int id) {
		// TODO Auto-generated method stub
		return pDao.findOne(id);
	}

	@Override
	public List<Proprietaire> findAll() {
		// TODO Auto-generated method stub
		return pDao.findAll();
	}

	@Override
	public Proprietaire create(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		return pDao.create(proprietaire);
	}

	@Override
	public Proprietaire update(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		return pDao.update(proprietaire);
	}

	@Override
	public int delete(Proprietaire proprietaire) {
		// TODO Auto-generated method stub
		return pDao.delete(proprietaire);
	}

}
