package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.BienALouer;
import fr.adaming.model.BienAVendre;
import fr.adaming.model.Client;
import fr.adaming.model.Dossier;
import fr.adaming.model.Visite;
import fr.adaming.service.IBienALouerService;
import fr.adaming.service.IBienAVendreService;
import fr.adaming.service.IClientService;
import fr.adaming.service.IDossierService;
import fr.adaming.service.IVisiteService;

@RestController
@RequestMapping("/client")

@CrossOrigin(origins = "http://localhost:4200")
public class ClientRest {

	@Autowired
	private IClientService clService;

	@Autowired
	private IBienALouerService balService;

	@Autowired
	private IBienAVendreService bavService;

	@Autowired
	private IVisiteService vService;

	@Autowired
	private IDossierService dService;

	// ============================================ Client
	// ================================================================
	@RequestMapping(value = "/ajoutCli", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Client ajouterClient(Client cli) {
		return clService.create(cli);
	}

	@RequestMapping(value = "/modifCli", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Client modifierClient(Client cli) {
		return clService.update(cli);
	}


	// ============================================ Bien A Louer
	// ================================================================

	@RequestMapping(value = "/listeBaL", method = RequestMethod.GET, produces = "application/json")
	public List<BienALouer> afficherTousBaL() {
		return balService.findAll();
	}

	@RequestMapping(value = "/recBaL", method = RequestMethod.GET, produces = "application/json")
	public BienALouer chercherBaLParId(int id) {
		return balService.findOne(id);
	}

	// ============================================ Bien A Vendre
	// ================================================================

	@RequestMapping(value = "/listeBaV", method = RequestMethod.GET, produces = "application/json")
	public List<BienAVendre> afficherTousBaV() {
		return bavService.findAll();
	}

	@RequestMapping(value = "/recBaV", method = RequestMethod.GET, produces = "application/json")
	public BienAVendre chercherBaVParId(int id) {
		return bavService.findOne(id);
	}

	// ============================================ Visite
	// ================================================================

	@RequestMapping(value = "/listeVis", method = RequestMethod.GET, produces = "application/json")
	public List<Visite> afficherTousVis() {
		return vService.findAll();
	}

	@RequestMapping(value = "/recVis", method = RequestMethod.GET, produces = "application/json")
	public Visite chercherVisParId(int id) {
		return vService.findOne(id);
	}

	// ============================================ Dossier
	// ================================================================

	@RequestMapping(value = "/listeDos", method = RequestMethod.GET, produces = "application/json")
	public List<Dossier> afficherTousDos() {
		return dService.findAll();
	}

	@RequestMapping(value = "/recDos", method = RequestMethod.GET, produces = "application/json")
	public Dossier chercherDosParId(int id) {
		return dService.findOne(id);
	}
}
