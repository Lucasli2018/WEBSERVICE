package com.rl.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MyCXFServer {
	
	public static void main(String[] args) {
		//创建服务工厂对象
		JaxWsServerFactoryBean sfb = new JaxWsServerFactoryBean();
		//加入输入输出拦截器
		sfb.getInInterceptors().add(new LoggingInInterceptor());
		sfb.getOutInterceptors().add(new LoggingOutInterceptor());
		//指定服务地址
		sfb.setAddress("http://127.0.0.1:5555/hello");
		//设置服务类
		sfb.setServiceClass(HelloService.class);
		//设置服务类的实例对象
		sfb.setServiceBean(new HelloService());
		//发布服务
		sfb.create();
		System.out.println("server ready...");
	}

}
