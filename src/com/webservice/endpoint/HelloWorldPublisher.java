package com.webservice.endpoint;

import javax.xml.ws.Endpoint;

import com.webservice.HelloWorldImpl;

public class HelloWorldPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/hello", new HelloWorldImpl());
	}

}
