package com.rl.client;

import com.rl.hello.HelloServer;
import com.rl.hello.HelloServerService;

public class TestPersonClient {
	
	public static void main(String[] args) {
		
		//����������ʵ㼯��
		HelloServerService hss = new HelloServerService();
		//���ݷ�����ʵ��ð󶨵���
		HelloServer server = hss.getHelloServerPort();
		//���þ���ҵ���߼�
		String result = server.sayHello("zhangsan");
		System.out.println(result);
	}

}
