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
	 * 1.需要方法权限是public
	 * 2.不能是final类型
	 * 3.方法不能是静态的
	 * 4.服务类至少有一个方法
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
