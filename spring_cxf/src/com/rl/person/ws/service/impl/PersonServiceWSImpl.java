package com.rl.person.ws.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rl.constant.Constants;
import com.rl.model.Person;
import com.rl.person.dao.PersonDao;
import com.rl.person.ws.service.PersonServiceWS;
@Service
public class PersonServiceWSImpl implements PersonServiceWS {

	@Autowired
	PersonDao personDao;
	
	@Override
	public String add(Person person, String password) {
		String flag = "success";
		if(Constants.ws_pass.equals(password)){
			personDao.add(person);
		}else{
			flag = "pass_error";
		}
		return flag;
		
	}

	@Override
	public List<Person> getPersonAll() {
		return personDao.getPersonAll();
	}

}
