package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.BienALouer;
import fr.adaming.model.BienAVendre;
import fr.adaming.model.Client;
import fr.adaming.model.Conseiller;
import fr.adaming.model.Dossier;
import fr.adaming.model.Proprietaire;
import fr.adaming.model.Visite;
import fr.adaming.service.IBienALouerService;
import fr.adaming.service.IBienAVendreService;
import fr.adaming.service.IClientService;
import fr.adaming.service.IConseillerService;
import fr.adaming.service.IDossierService;
import fr.adaming.service.IProprietaireService;
import fr.adaming.service.IVisiteService;

@RestController
@RequestMapping("/conseiller")

@CrossOrigin(origins = "http://localhost:4200")
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
	private IVisiteService vService;

	// ============================================ Conseiller
	// ================================================================

	@RequestMapping(value = "/modifCon", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Conseiller modifierConseiller(@RequestBody Conseiller con) {
		return coService.update(con);
	}

	// ============================================ Propriétaire
	// ================================================================

	@RequestMapping(value = "/listePro", method = RequestMethod.GET, produces = "application/json")
	public List<Proprietaire> afficherTousProprietaire() {
		return pService.findAll();
	}

	@RequestMapping(value = "/ajoutPro", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Proprietaire ajouterProprietaire(@RequestBody Proprietaire pro) {
		return pService.create(pro);
	}

	@RequestMapping(value = "/modifPro", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Proprietaire modifierProprietaire(@RequestBody Proprietaire pro) {
		return pService.update(pro);
	}

	@RequestMapping(value = "/supprPro", method = RequestMethod.DELETE)
	public void supprimerProprietaire(@RequestParam("pId") int id) {
		pService.delete(id);
	}

	@RequestMapping(value = "/recPro", method = RequestMethod.GET, produces = "application/json")
	public Proprietaire chercherProprietaireParId(@RequestParam("pId") int id) {
		return pService.findOne(id);
	}

	// ============================================ Client
	// ================================================================

	@RequestMapping(value = "/listeCli", method = RequestMethod.GET, produces = "application/json")
	public List<Client> afficherTousClient() {
		return clService.findAll();
	}

	@RequestMapping(value = "/ajoutCli", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Client ajouterClient(@RequestBody Client cli) {
		return clService.create(cli);
	}

	@RequestMapping(value = "/modifCli", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Client modifierClient(@RequestBody Client cli) {
		return clService.update(cli);
	}

	@RequestMapping(value = "/supprCli", method = RequestMethod.DELETE)
	public void supprimerClient(@RequestParam("pId") int id) {
		clService.delete(id);
	}

	@RequestMapping(value = "/recCli", method = RequestMethod.GET, produces = "application/json")
	public Client chercherClientParId(@RequestParam("pId") int id) {
		return clService.findOne(id);
	}

	// ============================================ Bien A Louer
	// ================================================================

	@RequestMapping(value = "/listeBaL", method = RequestMethod.GET, produces = "application/json")
	public List<BienALouer> afficherTousBaL() {
		return balService.findAll();
	}

	@RequestMapping(value = "/ajoutBaL", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public BienALouer ajouterBaL(@RequestBody BienALouer bal) {
		return balService.create(bal);
	}

	@RequestMapping(value = "/modifBaL", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public BienALouer modifierBaL(@RequestBody BienALouer bal) {
		return balService.update(bal);
	}

	@RequestMapping(value = "/supprBaL", method = RequestMethod.DELETE)
	public void supprimerBaL(@RequestParam("pId") int id) {
		balService.delete(id);
	}

	@RequestMapping(value = "/recBaL", method = RequestMethod.GET, produces = "application/json")
	public BienALouer chercherBaLParId(@RequestParam("pId") int id) {
		return balService.findOne(id);
	}

	// ============================================ Bien A Vendre
	// ================================================================

	@RequestMapping(value = "/listeBaV", method = RequestMethod.GET, produces = "application/json")
	public List<BienAVendre> afficherTousBaV() {
		return bavService.findAll();
	}

	@RequestMapping(value = "/ajoutBaV", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public BienAVendre ajouterBaV(@RequestBody BienAVendre bal) {
		return bavService.create(bal);
	}

	@RequestMapping(value = "/modifBaV", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public BienAVendre modifierBaV(@RequestBody BienAVendre bal) {
		return bavService.update(bal);
	}

	@RequestMapping(value = "/supprBaV", method = RequestMethod.DELETE)
	public void supprimerBaV(@RequestParam("pId") int id) {
		bavService.delete(id);
	}

	@RequestMapping(value = "/recBaV", method = RequestMethod.GET, produces = "application/json")
	public BienAVendre chercherBaVParId(@RequestParam("pId") int id) {
		return bavService.findOne(id);
	}

	// ============================================ Visite
	// ================================================================

	@RequestMapping(value = "/listeVis", method = RequestMethod.GET, produces = "application/json")
	public List<Visite> afficherTousVis() {
		return vService.findAll();
	}

	@RequestMapping(value = "/ajoutVis", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Visite ajouterVis(@RequestBody Visite v) {
		return vService.create(v);
	}

	@RequestMapping(value = "/modifVis", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Visite modifierVis(@RequestBody Visite v) {
		return vService.update(v);
	}

	@RequestMapping(value = "/supprVis", method = RequestMethod.DELETE)
	public void supprimerVis(@RequestParam("pId") int id) {
		vService.delete(id);
	}

	@RequestMapping(value = "/recVis", method = RequestMethod.GET, produces = "application/json")
	public Visite chercherVisParId(@RequestParam("pId") int id) {
		return vService.findOne(id);
	}

	// ============================================ Dossier
	// ================================================================

	@RequestMapping(value = "/listeDos", method = RequestMethod.GET, produces = "application/json")
	public List<Dossier> afficherTousDos() {
		return dService.findAll();
	}

	@RequestMapping(value = "/ajoutDos", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Dossier ajouterDos(@RequestBody Dossier dos) {
		return dService.create(dos);
	}

	@RequestMapping(value = "/modifDos", method = RequestMethod.PUT, produces = "application/json", consumes = "application/json")
	public Dossier modifierDos(@RequestBody Dossier dos) {
		return dService.update(dos);
	}

	@RequestMapping(value = "/supprDos", method = RequestMethod.DELETE)
	public void supprimerDos(@RequestParam("pId") int id) {
		dService.delete(id);
	}

	@RequestMapping(value = "/recDos", method = RequestMethod.GET, produces = "application/json")
	public Dossier chercherDosParId(@RequestParam("pId") int id) {
		return dService.findOne(id);
	}

}
