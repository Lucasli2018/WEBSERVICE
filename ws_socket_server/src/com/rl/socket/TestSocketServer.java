package com.rl.socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocketServer {
	
	public static void main(String[] args) throws Exception {
		
		//��������ӿ�
		ServerSocket ss = new ServerSocket(8888);
		//��������
		Socket s = ss.accept();
		//���÷���˵�ҵ���߼�
		String result = new PersonService().sayHello();
		//��������
		OutputStream out = s.getOutputStream();
		//��������
		out.write(result.getBytes());
		//�ر���Դ
		out.close();
		s.close();
		ss.close();
		
	}

}
