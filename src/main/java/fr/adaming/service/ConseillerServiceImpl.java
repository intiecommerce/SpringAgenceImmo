package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.Conseiller;

@Service("conseillerService")
@Transactional
public class ConseillerServiceImpl implements IConseillerService {

	IGenericDao<Conseiller> conseillerDao;
	@Autowired
	public void setDao(IGenericDao<Conseiller> daoToSet){
		conseillerDao = daoToSet;
		conseillerDao.setClazz(Conseiller.class);
	}
	
	@Override
	public Conseiller findOne(int id) {
		// TODO Auto-generated method stub
		return conseillerDao.findOne(id);
	}

	@Override
	public List<Conseiller> findAll() {
		// TODO Auto-generated method stub
		return conseillerDao.findAll();
	}

	@Override
	public Conseiller create(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return conseillerDao.create(conseiller);
	}

	@Override
	public Conseiller update(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return conseillerDao.update(conseiller);
	}

	@Override
	public int delete(Conseiller conseiller) {
		// TODO Auto-generated method stub
		return conseillerDao.delete(conseiller);
	}



}
