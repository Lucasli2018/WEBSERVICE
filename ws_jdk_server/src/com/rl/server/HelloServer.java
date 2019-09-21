package com.rl.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(
		serviceName="MyHelloServerService",
		portName="MyHelloServer",
		name="MyHelloServer",
		targetNamespace="hello.ren.liang"
		)
public class HelloServer {
	/**
	 * 1.��Ҫ����Ȩ����public
	 * 2.������final����
	 * 3.���������Ǿ�̬��
	 * 4.������������һ������
	 * @param name
	 * @return
	 */
	@WebMethod(exclude=true)
	public String sayHello(String name){
		return name + " hello!";
	}
	
	@WebMethod(exclude=false)
	public @WebResult(name="byeResult") String sayBye(@WebParam(name="personName") String name){
		return name + " bye!";
	}
	
	
	
}
