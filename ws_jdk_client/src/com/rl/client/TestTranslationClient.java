package com.rl.client;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import com.rl.trans.ArrayOfString;
import com.rl.trans.EnglishChinese;
import com.rl.trans.EnglishChineseSoap;


public class TestTranslationClient {
	
	public static void main(String[] args) throws Exception {
		//创建服务访问点集合
		EnglishChinese ec = new EnglishChinese();
		//获得服务类
		EnglishChineseSoap serviceClass = ec.getEnglishChineseSoap();
		//调用服务方法
		ArrayOfString aos = serviceClass.translatorString("hello");
		
		List<String> strList = aos.getString();
		for(String result : strList){
			System.out.println(result);
		}
		//调用服务方法
		byte[] mp3 = serviceClass.getMp3("1059.mp3");
		OutputStream out = new FileOutputStream(new File("d:/wsCode/hello.mp3"));
		out.write(mp3);
		out.flush();
		out.close();
	}

}
