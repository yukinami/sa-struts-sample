package org.seasar.sastruts.sample.repository;

import java.io.Serializable;

public interface CrudRepositoryBase <T, ID extends Serializable>{

	<S extends T> S save(S entity);
	
	T findOne(ID id);

	public Iterable<T> findAll(); 
	
	void delete(ID id);
	
	void delete(T entity);
}
