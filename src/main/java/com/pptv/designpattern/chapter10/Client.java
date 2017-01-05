package com.pptv.designpattern.chapter10;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass ac;
		ac=new ConcreteClass1();
		ac.TemplateMethod();
		
		ac=new ConcreteClass2();
		ac.TemplateMethod();
		
	}

}
