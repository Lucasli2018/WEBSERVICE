package com.rl.cxf.web.client;

import com.rl.web.server.HelloService;
import com.rl.web.server.HelloServiceService;

public class WebClient {

	public static void main(String[] args) {
		HelloServiceService hss = new HelloServiceService();
		HelloService hs = hss.getHelloServicePort();
		String result = hs.sayHello("����");
		System.out.println(result);
	}
}
