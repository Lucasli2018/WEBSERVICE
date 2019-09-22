package com.rl.person.ws.service;

import java.util.List;

import javax.jws.WebService;

import com.rl.model.Person;

@WebService
public interface PersonServiceWS {
	
	public String add(Person person, String password);
	
	public List<Person> getPersonAll();
}
