package com.rl.cxf.web.client;

import com.rl.web.inter.ByeInter;
import com.rl.web.inter.ByeInterService;


public class WebInterClient {

	public static void main(String[] args) {
		ByeInterService bs = new ByeInterService();
		ByeInter bi = bs.getByeInterPort();
		String result = bi.sayBye("°Ë½ä");
		System.out.println(result);
	}
}
