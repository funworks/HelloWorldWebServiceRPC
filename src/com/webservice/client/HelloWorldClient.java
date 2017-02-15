package com.webservice.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.webservice.HelloWorld;

public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9999/ws/hello?wsdl");
		
		QName qname = new QName("http://webservice.com/", "HelloWorldImplService");
		
		Service service = Service.create(url, qname);
		
		HelloWorld hello = service.getPort(HelloWorld.class);
		
		System.out.println(hello.getHelloWorldAsString("India"));
	}

}
