package fr.adaming.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public abstract class AbstractJpaDao<T extends Serializable> {

	private Class<T> clazz;

	@PersistenceContext
	EntityManager entityManager;

	public void setClazz(Class<T> clazzToSet) {
		this.clazz = clazzToSet;
	}

	public T findOne(int id) {
		return entityManager.find(clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findAll() {
		return entityManager.createQuery("from " + clazz.getName()).getResultList();
	}

	public T create(T entity) {
		entityManager.persist(entity);
		return(entity);
	}

	public T update(T entity) {
		return entityManager.merge(entity);
	}

	public int delete(int id) {
		T entity = entityManager.find(clazz, id);
		String test1 = entityManager.createQuery("from " + clazz.getName()).getResultList().toString();
		entityManager.remove(entity);
		String test2 = entityManager.createQuery("from " + clazz.getName()).getResultList().toString();
		if (test1 != test2) {
			return 1;
		} else {
			return 0;
		}
	}

}
