package fr.adaming.dao;

import org.springframework.stereotype.Repository;

import fr.adaming.model.Client;

@Repository
public class ClientDaoImpl extends AbstractJpaDao<Client> implements IClientDao {

}