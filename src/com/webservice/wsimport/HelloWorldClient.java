package com.webservice.wsimport;

import java.net.MalformedURLException;

public class HelloWorldClient {

	public static void main(String[] args) throws MalformedURLException {
		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();
		
		System.out.println(hello.getHelloWorldAsString("Asia"));
	}

}
