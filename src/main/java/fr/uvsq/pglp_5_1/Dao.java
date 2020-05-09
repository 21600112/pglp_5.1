package fr.uvsq.pglp_5_1;

import java.util.ArrayList;

public interface Dao<T> {
	
	public abstract void serialize(T object, String file);
	
	public abstract T deserialize(String file);
	
	public abstract void add(T object);
	
	public abstract T get(int id);
	
	public abstract T update(T object);
	
	public abstract void remove(T object);
	
}
