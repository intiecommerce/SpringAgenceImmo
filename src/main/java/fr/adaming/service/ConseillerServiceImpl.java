package fr.adaming.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IConseillerDao;
import fr.adaming.model.Proprietaire;

@Service
@Transactional
public class ConseillerServiceImpl implements IConseillerService {

	@Autowired
	private IConseillerDao cDao;
	
	
	public void setcDao(IConseillerDao cDao) {
		this.cDao = cDao;
	}

	@Override
	public List<Proprietaire> afficherTousProprietaire() {
		// TODO Auto-generated method stub
		return cDao.afficherTousProprietaire();
	}

	@Override
	public Proprietaire ajouterProprietaire(Proprietaire pro) {
		// TODO Auto-generated method stub
		return cDao.ajouterProprietaire(pro);
	}

	@Override
	public Proprietaire modifierProprietaire(Proprietaire pro) {
		// TODO Auto-generated method stub
		return cDao.modifierProprietaire(pro);
	}

	@Override
	public void supprimerProprietaire(int id) {
		cDao.supprimerProprietaire(id);
		
	}

	@Override
	public Proprietaire chercherProprietaireParId(int id) {
		// TODO Auto-generated method stub
		return cDao.chercherProprietaireParId(id);
	}

}
