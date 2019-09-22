package com.rl.cxf.client;

import com.rl.inter.HI;
import com.rl.inter.HIService;


public class HiInterClient {
	
	public static void main(String[] args) {
		HIService hiService = new HIService();
		//返回的服务的实现类使用接口接收
		HI hi = hiService.getHIPort();
		
		String result = hi.sayHi("王五");
		System.out.println(result);
	}

}
