package com.rl.cxf.client;

import com.rl.inter.HI;
import com.rl.inter.HIService;


public class HiInterClient {
	
	public static void main(String[] args) {
		HIService hiService = new HIService();
		//���صķ����ʵ����ʹ�ýӿڽ���
		HI hi = hiService.getHIPort();
		
		String result = hi.sayHi("����");
		System.out.println(result);
	}

}
