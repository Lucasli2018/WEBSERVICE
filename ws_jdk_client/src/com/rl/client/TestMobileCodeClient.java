package com.rl.client;

import com.rl.stub.MobileCodeWS;
import com.rl.stub.MobileCodeWSSoap;

public class TestMobileCodeClient {
	
	public static void main(String[] args) {
		
		//����������ʵ㼯��
		MobileCodeWS mc = new MobileCodeWS();
		//���ݷ�����ʵ��ð󶨵���
		MobileCodeWSSoap serviceClass = mc.getMobileCodeWSSoap();
		//���þ���ҵ���߼�
		String result = serviceClass.getMobileCodeInfo("18621625149", null);
		System.out.println(result);
	}

}
