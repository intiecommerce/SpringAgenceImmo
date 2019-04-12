package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.BienALouer;

@Service("balService")
@Transactional
public class BienALouerServiceimpl implements IBienALouerService{
	
	IGenericDao<BienALouer> balDao;
	@Autowired
	public void setDao(IGenericDao<BienALouer> daoToSet){
		balDao = daoToSet;
		balDao.setClazz(BienALouer.class);
	}

	@Override
	public BienALouer findOne(int id) {
		
		return balDao.findOne(id);
	}

	@Override
	public List<BienALouer> findAll() {
		
		return balDao.findAll();
	}

	@Override
	public BienALouer create(BienALouer bal) {
		
		return balDao.create(bal);
	}

	@Override
	public BienALouer update(BienALouer bal) {
		// TODO Auto-generated method stub
		return balDao.update(bal);
	}

	@Override
	public int delete(int id) {
		return balDao.delete(id);
	}

}
