package de.integrata.oop.junit;

public interface Database {

	public <T> T findById(Class<T> clazz, String id);
	
	public void ping();
	
	
}
