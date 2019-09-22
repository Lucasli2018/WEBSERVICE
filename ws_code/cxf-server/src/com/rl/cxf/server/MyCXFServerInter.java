package com.rl.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.rl.cxf.inter.HI;
import com.rl.cxf.inter.HIImpl;

public class MyCXFServerInter {
	
	public static void main(String[] args) {
		//�������񹤳�����
		JaxWsServerFactoryBean sfb = new JaxWsServerFactoryBean();
		//�����������������
		sfb.getInInterceptors().add(new LoggingInInterceptor());
		sfb.getOutInterceptors().add(new LoggingOutInterceptor());
		//ָ�������ַ
		sfb.setAddress("http://127.0.0.1:9999/hi");
		//���ýӿ�
		sfb.setServiceClass(HI.class);
		//���ýӿ�ʵ����
		sfb.setServiceBean(new HIImpl());
		//��������
		sfb.create();
		System.out.println("server ready...");
	}

}
