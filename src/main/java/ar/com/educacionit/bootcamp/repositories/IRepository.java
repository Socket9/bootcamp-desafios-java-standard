package ar.com.educacionit.bootcamp.repositories;

import java.util.Collection;
import java.util.List;

public interface IRepository<T> {

	public Collection<T> findAll();
	public void saveList(Collection<T> entity);
}
