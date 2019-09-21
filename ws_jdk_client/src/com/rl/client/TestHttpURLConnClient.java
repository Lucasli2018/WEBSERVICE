package com.rl.client;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;


public class TestHttpURLConnClient {
	
	public static void main(String[] args) throws Exception {
		//����webservice��URL
		URL url = new URL("http://127.0.0.1:8080/hello?wsdl");
		//�����ӻ��URLConnection
		URLConnection uc = url.openConnection();
		//ǿת��HttpURLConnection
		HttpURLConnection httpuc = (HttpURLConnection)uc;
		//����������Ŀ���
		httpuc.setDoInput(true);
		httpuc.setDoOutput(true);
		//��������ʽ
		httpuc.setRequestMethod("POST");
		//����content-type  text/xml;charset=UTF-8
		httpuc.setRequestProperty("Content-Type", "text/xml;charset=UTF-8");
		//��װ��Ϣ��
		String data = "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:q0=\"http://server.rl.com/\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\">"
				+"<soapenv:Body>"
				+" <q0:sayBye>"
				+"	<arg0>wangwu</arg0>" 
				+" </q0:sayBye>"
				+" </soapenv:Body>"
				+"</soapenv:Envelope>";
		//����HttpURLConnection��������
		OutputStream out = httpuc.getOutputStream();
		//�����������Ϣ���͵������
		out.write(data.getBytes());
		//�������ɹ�
		if(httpuc.getResponseCode() == 200){
			//���������
			InputStream in = httpuc.getInputStream();
			//ʹ�����뻺����
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			//��ȡ��Ӧ����Ϣ
			StringBuffer sb = new StringBuffer();
			String line = null;
			while((line = br.readLine()) != null){
				sb.append(line);
			}
			//������Ϣ������SAXReader����
			SAXReader  reader = new SAXReader();
			//����ĵ�����
			Document doc = reader.read(new StringReader(sb.toString()));
			//ʹ��XPath�ķ�ʽ��õ�return���Ԫ�صļ���
			List<Element> eList = doc.selectNodes("//return");
			//����Ԫ�ؼ���
			for(Element ele : eList){
				System.out.println(ele.getText());
			}
			
			
		}
		
	}

}
