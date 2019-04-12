package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import fr.adaming.model.Proprietaire;

@Repository
public class ConseillerDaoImpl implements IConseillerDao {

	@Autowired
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Proprietaire> afficherTousProprietaire() {
		
		//creation de la requete
		String req="FROM Proprietaire as pro";
		Query query=em.createQuery(req);
		
		//envoie de la requete et reception du resultat
		List<Proprietaire> proprietaires=query.getResultList();
		
		return proprietaires;
	}

	@Override
	public Proprietaire ajouterProprietaire(Proprietaire pro) {
		
		em.persist(pro);
		return pro;
	}

	@Override
	public Proprietaire modifierProprietaire(Proprietaire pro) {
				
		em.merge(pro);
		return null;
	}

	@Override
	public void supprimerProprietaire(int id) {

		Proprietaire pro=chercherProprietaireParId(id);			
		em.remove(pro);
		
	}

	@Override
	public Proprietaire chercherProprietaireParId(int id) {
		
		Proprietaire pro=em.find(Proprietaire.class, id);
		return pro;
	}

}
