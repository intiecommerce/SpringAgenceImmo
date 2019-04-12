package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Proprietaire;
import fr.adaming.service.IConseillerService;

@RestController
@RequestMapping("/conseiller")

@CrossOrigin(origins="http://localhost:4200")
public class ConseillerRest {
	
	@Autowired
	private IConseillerService cService;
	
	@RequestMapping(value="/listeProprietaire", method=RequestMethod.GET,produces="application/json")
	public List<Proprietaire> afficherTousProprietaire(){
		return cService.afficherTousProprietaire();
	}

	@RequestMapping(value="/ajouterProprietaire", method=RequestMethod.POST,produces="application/json", consumes="application/json")
	public Proprietaire ajouterProprietaire(Proprietaire pro){
		return cService.ajouterProprietaire(pro);
	}
	
	@RequestMapping(value="/modifierProprietaire", method=RequestMethod.PUT,produces="application/json", consumes="application/json")
	public Proprietaire modifierProprietaire(Proprietaire pro){
		return cService.modifierProprietaire(pro);
	}
	
	@RequestMapping(value="/supprimerProprietaire", method=RequestMethod.DELETE)
	public void supprimerProprietaire(int id){
		cService.supprimerProprietaire(id);
	}
	
	@RequestMapping(value="/chercherProprietaire", method=RequestMethod.GET,produces="application/json")
	public Proprietaire chercherProprietaireParId(int id){
		return cService.chercherProprietaireParId(id);
	}

}
