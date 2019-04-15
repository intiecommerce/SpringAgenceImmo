package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IGenericDao;
import fr.adaming.model.BienImmobilier;

@Service("bService")
@Transactional
public class BienImmobilierServiceImpl implements IBienImmobilierService {

	IGenericDao<BienImmobilier> bavDao;

	@Autowired
	public void setDao(IGenericDao<BienImmobilier> daoToSet) {
		bavDao = daoToSet;
		bavDao.setClazz(BienImmobilier.class);
	}

	@Override
	public BienImmobilier findOne(int id) {

		return bavDao.findOne(id);
	}

	@Override
	public List<BienImmobilier> findAll() {

		return bavDao.findAll();
	}

	@Override
	public BienImmobilier create(BienImmobilier b) {

		return bavDao.create(b);
	}

	@Override
	public BienImmobilier update(BienImmobilier b) {

		return bavDao.update(b);
	}

	@Override
	public int delete(int id) {

		return bavDao.delete(id);
	}

}
