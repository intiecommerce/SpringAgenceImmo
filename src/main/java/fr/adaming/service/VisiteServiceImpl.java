package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.Visite;

@Service("visiteService")
@Transactional
public class VisiteServiceImpl implements IVisiteService{

	IGenericDao<Visite> vDao;
	@Autowired
	public void setDao(IGenericDao<Visite> daoToSet){
		vDao = daoToSet;
		vDao.setClazz(Visite.class);
	}
	


	@Override
	public List<Visite> findAll() {
		// TODO Auto-generated method stub
		return vDao.findAll();
	}

	@Override
	public Visite create(Visite visite) {
		// TODO Auto-generated method stub
		return vDao.create(visite);
	}

	@Override
	public Visite update(Visite visite) {
		// TODO Auto-generated method stub
		return vDao.update(visite);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return vDao.delete(id);
	}

	@Override
	public Visite findOne(int id) {
		// TODO Auto-generated method stub
		return vDao.findOne(id);
	}

}
