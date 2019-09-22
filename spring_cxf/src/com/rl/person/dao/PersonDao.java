package com.rl.person.dao;

import java.util.List;

import com.rl.model.Person;

public interface PersonDao {
	
	public void add(Person person);
	
	public List<Person> getPersonAll();

}
