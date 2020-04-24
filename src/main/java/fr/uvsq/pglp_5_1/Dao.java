package fr.uvsq.pglp_5_1;

import java.util.ArrayList;

public interface Dao<T> {
	
	void add(T object);
	
	T get(int id);
	
	void update(T object);
	
	void remove(T object);
	
}
