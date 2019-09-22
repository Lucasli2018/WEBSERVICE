package com.rl.cxf.server;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.rl.cxf.inter.HI;
import com.rl.cxf.inter.HIImpl;

public class MyCXFServerInter {
	
	public static void main(String[] args) {
		//创建服务工厂对象
		JaxWsServerFactoryBean sfb = new JaxWsServerFactoryBean();
		//加入输入输出拦截器
		sfb.getInInterceptors().add(new LoggingInInterceptor());
		sfb.getOutInterceptors().add(new LoggingOutInterceptor());
		//指定服务地址
		sfb.setAddress("http://127.0.0.1:9999/hi");
		//设置接口
		sfb.setServiceClass(HI.class);
		//设置接口实现类
		sfb.setServiceBean(new HIImpl());
		//发布服务
		sfb.create();
		System.out.println("server ready...");
	}

}
