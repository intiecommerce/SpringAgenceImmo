package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.BienAVendre;

@Service("bavService")
@Transactional
public class BienAVendreServiceImpl implements IBienAVendreService{

	IGenericDao<BienAVendre> bavDao;
	@Autowired
	public void setDao(IGenericDao<BienAVendre> daoToSet){
		bavDao = daoToSet;
		bavDao.setClazz(BienAVendre.class);
	}
	
	@Override
	public BienAVendre findOne(int id) {
		
		return bavDao.findOne(id);
	}

	@Override
	public List<BienAVendre> findAll() {
	
		return bavDao.findAll();
	}

	@Override
	public BienAVendre create(BienAVendre bav) {
		
		return bavDao.create(bav);
	}

	@Override
	public BienAVendre update(BienAVendre bav) {
		
		return bavDao.update(bav);
	}

	@Override
	public int delete(int id) {
		
		return bavDao.delete(id);
	}

}
