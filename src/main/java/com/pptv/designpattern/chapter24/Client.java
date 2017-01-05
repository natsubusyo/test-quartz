package com.pptv.designpattern.chapter24;

public class Client {

	public static void main(String[] args) {
		
		Handle h1=new ConcreteHandleA();
		Handle h2=new ConcreteHandleB();
		Handle h3=new ConcreteHandleC();
		h1.setNext(h2);
		h2.setNext(h3);
		
		int [] tests=new int[]{5,15,25,35};
		
		for(int i:tests){
			System.out.println(i);
			h1.handleRequest(i);
		}
	}

}
