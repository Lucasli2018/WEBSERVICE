package com.rl.client;

import com.rl.stub.MobileCodeWS;
import com.rl.stub.MobileCodeWSSoap;

public class TestMobileCodeClient {
	
	public static void main(String[] args) {
		
		//创建服务访问点集合
		MobileCodeWS mc = new MobileCodeWS();
		//根据服务访问点获得绑定的类
		MobileCodeWSSoap serviceClass = mc.getMobileCodeWSSoap();
		//调用具体业务逻辑
		String result = serviceClass.getMobileCodeInfo("18621625149", null);
		System.out.println(result);
	}

}
