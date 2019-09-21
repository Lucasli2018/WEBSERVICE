<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript">
	var xhr;
	
	function invoke(){
		//创建ajax对象
		xhr = new ActiveXObject("Microsoft.XMLHTTP");
		//指定要访问的地址，就是我们WSDL地址，说明书
		var url = "http://127.0.0.1:8080/hello?wsdl";
		//打开连接，参数1.请求方式， 2,url地址. 3.是否同步，true异步，false同步
		xhr.open("POST", url, true);
		//指定发送的数据类型
		xhr.setRequestHeader("Content-Type", "text/xml;charset=UTF-8");
		//设置回调函数
		xhr.onreadystatechange = _back;
		var mytext = document.getElementById("mytext").value;
		//定义消息体
		var data = '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" xmlns:q0="http://server.rl.com/" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">'
		+'<soapenv:Body>'
		+' <q0:sayBye>'
		+'	<arg0>'+mytext+'</arg0>' 
		+' </q0:sayBye>'
		+' </soapenv:Body>'
		+'</soapenv:Envelope>';
		
		//发送消息体
		xhr.send(data);
	}
	//回调函数
	function _back(){
		//判断成功状态
		if(xhr.readyState == 4 && xhr.status == 200){
			//以文本形式
			var result = xhr.responseText;
			//以xml文档对象
			var obj = xhr.responseXML;
			//解析文档
			var returns = obj.getElementsByTagName("return");
			alert(returns[0].text);
		}
	}
</script>
</head>
<body>
<input type="text" id="mytext">
<input type="button" value="click" onclick="invoke();">
</body>
</html>