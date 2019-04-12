package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.Dossier;

@Service("dossierService")
@Transactional
public class DossierServiceImpl implements IDossierService{

	IGenericDao<Dossier> dDao;
	@Autowired
	public void setDao(IGenericDao<Dossier> daoToSet){
		dDao = daoToSet;
		dDao.setClazz(Dossier.class);
	}
	
	@Override
	public Dossier findOne(int id) {
		// TODO Auto-generated method stub
		return dDao.findOne(id);
	}

	@Override
	public List<Dossier> findAll() {
		// TODO Auto-generated method stub
		return dDao.findAll();
	}

	@Override
	public Dossier create(Dossier dossier) {
		// TODO Auto-generated method stub
		return dDao.create(dossier);
	}

	@Override
	public Dossier update(Dossier dossier) {
		// TODO Auto-generated method stub
		return dDao.update(dossier);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return dDao.delete(id);
	}

}
