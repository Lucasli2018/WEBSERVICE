package com.rl.cxf.client;

import com.rl.cxf.server.HelloService;
import com.rl.cxf.server.HelloServiceService;

public class Soap12Client {
	
	public static void main(String[] args) {
		HelloServiceService hss = new HelloServiceService();
		HelloService hs = hss.getHelloServicePort();
		String result = hs.sayHello("lisi");
		System.out.println(result);
	}

}
