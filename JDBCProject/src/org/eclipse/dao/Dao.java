package org.eclipse.dao;

import java.util.List;

import javax.sound.sampled.LineListener;

public interface Dao<T> 
{
	int save (T obj);
	void remove (T obj);
	void update (T obj);
	T findById(int id);
	List<T> getAll();
	

}
