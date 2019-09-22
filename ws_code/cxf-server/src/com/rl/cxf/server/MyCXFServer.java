package com.rl.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class MyCXFServer {
	
	public static void main(String[] args) {
		//�������񹤳�����
		JaxWsServerFactoryBean sfb = new JaxWsServerFactoryBean();
		//�����������������
		sfb.getInInterceptors().add(new LoggingInInterceptor());
		sfb.getOutInterceptors().add(new LoggingOutInterceptor());
		//ָ�������ַ
		sfb.setAddress("http://127.0.0.1:5555/hello");
		//���÷�����
		sfb.setServiceClass(HelloService.class);
		//���÷������ʵ������
		sfb.setServiceBean(new HelloService());
		//��������
		sfb.create();
		System.out.println("server ready...");
	}

}
