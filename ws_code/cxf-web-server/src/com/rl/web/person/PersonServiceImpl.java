package com.rl.web.person;

import java.util.ArrayList;
import java.util.List;

public class PersonServiceImpl implements PersonService {

	//�洢Person�ļ���
	List<Person> pList = new ArrayList<Person>();
	
	
	@Override
	public void addPerson(Person p) {
		pList.add(p);
	}

	@Override
	public List<Person> getPersonAll() {
		return pList;
	}

}
