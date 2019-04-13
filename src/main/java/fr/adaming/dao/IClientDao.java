package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.BienImmobilier;
import fr.adaming.model.ClasseStandard;
import fr.adaming.model.Client;

public interface IClientDao extends IGenericDao<Client> {

	public List<ClasseStandard> findAllClasseStandardByClient(int id);
	public List<Client> findAllClientByClassStandard(int id);
	public List<BienImmobilier> findAllBienImmoByClassStandard(int id);
	
	
}
