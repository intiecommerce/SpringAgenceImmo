package fr.adaming.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import fr.adaming.model.ClasseStandard;
import fr.adaming.model.Client;

@Repository
public class ClientDaoImpl extends AbstractJpaDao<Client> implements IClientDao {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<ClasseStandard> findAllClasseStandardByClient(int id) {
		// ====================requete SQL pour un seul objet.
		String reqListeSQL = "SELECT * FROM personne AS p,classestandard AS c,association_classestandards_client AS t WHERE p.id=? AND p.id=t.id_client AND t.id_classesstandard=c.idClasseStandard";

		Query querySQLListe = entityManager.createNativeQuery(reqListeSQL);
		// passage des params
		querySQLListe.setParameter(1, id);

		// envoyer la requete et recup le resultat
		@SuppressWarnings("unchecked")
		List<ClasseStandard> listeSQL = querySQLListe.getResultList();

		return listeSQL;
	}

}