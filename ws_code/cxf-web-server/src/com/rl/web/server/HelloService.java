package com.rl.web.server;

import javax.jws.WebService;



@WebService//���õ�webservice�����඼ҪҪ��@webservice���ӿڵ���ʽ���ڽӿ���
public class HelloService {
	public String sayHello(String name){
		return name + " hello";
	}
	


}
