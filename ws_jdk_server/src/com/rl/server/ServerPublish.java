package com.rl.server;

import javax.xml.ws.Endpoint;

public class ServerPublish {
	
	public static void main(String[] args) {
		//jdk����webservice���� ��һ�����������ַ���ڶ����������������
		Endpoint.publish("http://127.0.0.1:8080/hello", new HelloServer());
	}

}
