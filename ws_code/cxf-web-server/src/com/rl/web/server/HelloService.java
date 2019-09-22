package com.rl.web.server;

import javax.jws.WebService;



@WebService//所用的webservice服务类都要要加@webservice，接口的形式加在接口上
public class HelloService {
	public String sayHello(String name){
		return name + " hello";
	}
	


}
