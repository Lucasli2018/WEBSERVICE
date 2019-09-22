package com.rl.cxf.server;

import javax.jws.WebService;
import javax.xml.ws.BindingType;

@WebService
@BindingType(value=javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_BINDING)
public class HelloService {
	
	public String sayHello(String name){
		return name + " hello";
	}

}
