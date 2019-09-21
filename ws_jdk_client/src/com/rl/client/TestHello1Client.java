package com.rl.client;

import liang.ren.hello.MyHelloServer;
import liang.ren.hello.MyHelloServerService;

public class TestHello1Client {
	
	public static void main(String[] args) {
		
		MyHelloServerService mss = new MyHelloServerService();
		
		MyHelloServer ms = mss.getMyHelloServer();
		
		System.out.println(ms.sayBye("lisi"));
	}

}
