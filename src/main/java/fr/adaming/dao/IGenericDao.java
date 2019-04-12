package fr.adaming.dao;

import java.io.Serializable;
import java.util.List;

public interface IGenericDao<T extends Serializable> {
 
   T findOne(final int id);
 
   List<T> findAll();
 
   T create(final T entity);
 
   T update(final T entity);
 
   int delete(final T entity);
   
   void setClazz(Class<T> clazzToSet);
}