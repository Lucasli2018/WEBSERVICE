package com.rl.cxf.web.client;

import java.util.List;

import com.rl.spring.Person;
import com.rl.spring.PersonServiceWS;
import com.rl.spring.PersonServiceWSService;


public class WebSpringClient {

	public static void main(String[] args) {
		PersonServiceWSService psws = new PersonServiceWSService();
		PersonServiceWS personService = psws.getPersonServiceWSPort();
		Person person = new Person();
		person.setName("�˽�");
		person.setGender("��");
		person.setAddress("����ׯ");
		String result = personService.add(person, "123456");
		System.out.println(result);
		List<Person> pList = personService.getPersonAll();
		for(Person p : pList){
			System.out.println("������"+ p.getName()+ " �Ա�"+ p.getGender() + " ��ַ��"+p.getAddress());
		}
	}
}
