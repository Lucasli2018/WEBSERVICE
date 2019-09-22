package com.rl.web.person;

import java.util.List;

import javax.jws.WebService;
@WebService
public interface PersonService {
	
	public void addPerson(Person p);
	
	public List<Person> getPersonAll();

}
