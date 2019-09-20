package com.rl.socket;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocketServer {
	
	public static void main(String[] args) throws Exception {
		
		//创建服务接口
		ServerSocket ss = new ServerSocket(8888);
		//接收请求
		Socket s = ss.accept();
		//调用服务端的业务逻辑
		String result = new PersonService().sayHello();
		//获得输出流
		OutputStream out = s.getOutputStream();
		//发送数据
		out.write(result.getBytes());
		//关闭资源
		out.close();
		s.close();
		ss.close();
		
	}

}
