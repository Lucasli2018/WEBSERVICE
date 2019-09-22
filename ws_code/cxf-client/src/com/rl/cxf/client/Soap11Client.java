package com.rl.cxf.client;

import com.rl.soap11.HelloService;
import com.rl.soap11.HelloServiceService;


public class Soap11Client {
	
	public static void main(String[] args) {
		HelloServiceService hss = new HelloServiceService();
		HelloService hs = hss.getHelloServicePort();
		String result = hs.sayHello("lisi");
		System.out.println(result);
	}

}
