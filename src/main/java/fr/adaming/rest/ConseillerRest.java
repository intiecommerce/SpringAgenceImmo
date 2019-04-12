package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.dao.IBienALouerDao;
import fr.adaming.dao.IBienAVendreDao;
import fr.adaming.model.Client;
import fr.adaming.model.Proprietaire;
import fr.adaming.service.IBienALouerService;
import fr.adaming.service.IBienAVendreService;
import fr.adaming.service.IClientService;
import fr.adaming.service.IConseillerService;
import fr.adaming.service.IDossierService;

@RestController
@RequestMapping("/conseiller")

@CrossOrigin(origins="http://localhost:4200")
public class ConseillerRest {
	
	@Autowired
	private IConseillerService coService;
	
	@Autowired
	private IProprietaireService pService;
	
	@Autowired
	private IClientService clService;
	
	@Autowired
	private IBienALouerService balService;
	
	@Autowired
	private IBienAVendreService bavService;
	
	@Autowired
	private IDossierService dService;
	
	@Autowired 
	private IVisite vService;
	
	@RequestMapping(value="/listePro", method=RequestMethod.GET,produces="application/json")
	public List<Proprietaire> afficherTousProprietaire(){
		return pService.findAll();
	}

	@RequestMapping(value="/ajoutPro", method=RequestMethod.POST,produces="application/json", consumes="application/json")
	public Proprietaire ajouterProprietaire(Proprietaire pro){
		return pService.add(pro);
	}
	
	@RequestMapping(value="/modifPro", method=RequestMethod.PUT,produces="application/json", consumes="application/json")
	public Proprietaire modifierProprietaire(Proprietaire pro){
		return pService.update(pro);
	}
	
	@RequestMapping(value="/supprPro", method=RequestMethod.DELETE)
	public void supprimerProprietaire(int id){
		pService.delete(id);
	}
	
	@RequestMapping(value="/recPro", method=RequestMethod.GET,produces="application/json")
	public Proprietaire chercherProprietaireParId(int id){
		return pService.findOne(id);
	}
	
	//======================================================================================================================================
	
	@RequestMapping(value="/listeCl", method=RequestMethod.GET,produces="application/json")
	public List<Client> afficherTousClient(){
		return clService.findAll();
	}

	@RequestMapping(value="/ajoutPro", method=RequestMethod.POST,produces="application/json", consumes="application/json")
	public Client ajouterClient(Client cli){
		return clService.create(cli);
	}
	
	@RequestMapping(value="/modifPro", method=RequestMethod.PUT,produces="application/json", consumes="application/json")
	public Client modifierClient(Client cli){
		return clService.update(cli);
	}
	
	@RequestMapping(value="/supprPro", method=RequestMethod.DELETE)
	public void supprimerClient(Client cli){
		clService.delete(cli);
	}
	
	@RequestMapping(value="/recPro", method=RequestMethod.GET,produces="application/json")
	public Client chercherClientParId(int id){
		return clService.findOne(id);
	}

}
