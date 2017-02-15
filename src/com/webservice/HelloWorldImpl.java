package com.webservice;

import javax.jws.WebService;

import com.webservice.HelloWorld;

@WebService(endpointInterface="com.webservice.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World from JAX Web Service: " + name;
	}

}
