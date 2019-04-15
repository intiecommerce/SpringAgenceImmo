package fr.adaming.service;

import java.util.List;

import fr.adaming.model.BienImmobilier;

public interface IBienImmobilierService {

	public BienImmobilier findOne(int id);

	public List<BienImmobilier> findAll();

	public BienImmobilier create(BienImmobilier b);

	public BienImmobilier update(BienImmobilier b);

	public int delete(int id);
}