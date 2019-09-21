package com.rl.server;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import com.rl.model.Person;
@WebService

public class PersonServer {
	
	List<Person> pList = new ArrayList<Person>();
	
	/**
	 * �����
	 * @param person
	 */
	public void addPerson(Person person){
		pList.add(person);
	}
	/**
	 * ������е���
	 * @return
	 */
	public List<Person> getPersonAll(){
		return pList;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://127.0.0.1:6060/person", new PersonServer());
	}

}
