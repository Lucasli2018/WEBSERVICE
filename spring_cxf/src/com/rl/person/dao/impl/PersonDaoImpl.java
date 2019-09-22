package com.rl.person.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.rl.model.Person;
import com.rl.person.dao.PersonDao;
@Repository
public class PersonDaoImpl implements PersonDao{

	List<Person> pList = new ArrayList<Person>();
	
	@Override
	public void add(Person person) {
		pList.add(person);
	}

	@Override
	public List<Person> getPersonAll() {
		return pList;
	}

}
