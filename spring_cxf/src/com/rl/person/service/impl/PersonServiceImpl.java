package com.rl.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.rl.model.Person;
import com.rl.person.dao.PersonDao;
import com.rl.person.service.PersonService;
@Service
//@Component适合于无法分层的类或接口
public class PersonServiceImpl implements PersonService {

	@Autowired
	//@Qualifier(value="")
	PersonDao personDao;
	
	@Override
	public void add(Person person) {
		personDao.add(person);
	}

}
