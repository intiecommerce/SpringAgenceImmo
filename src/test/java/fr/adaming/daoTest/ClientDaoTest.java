package fr.adaming.daoTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import fr.adaming.dao.IClientDao;
import fr.adaming.model.Client;

@RunWith(SpringJUnit4ClassRunner.class)//cette annotation sert à preciser que le lancement des tests 
//sera fait grace à la classe fourni par le module test de spring
@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext.xml"})
public class ClientDaoTest {

	
	
	@Autowired
	private IClientDao clientDao; 
	
	//=====================Test Ajout Voyage
	//Vérifier que le voyage est bien ajouté à la liste des voyages
	@Test
	@Transactional
	@Rollback(true)//Des que le test est terminé la base de donnée doit revenir à son état initial
	public void testAjouterClient(){
		Client cIn = new Client();
		cIn.setAcquereur(true);
		
		
		//récupéerer la taille de la liste avant l'ajout
		int taillerelle=clientDao.findAll().size();
		
		clientDao.create(cIn);
		
		assertEquals(taillerelle+1, clientDao.findAll().size());
	
	}
}
