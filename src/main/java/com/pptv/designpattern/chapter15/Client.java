package com.pptv.designpattern.chapter15;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractFactory factory =new ConcreteFactoryA();
		AbstractProductA apa=factory.createProductA();
		AbstractProductB abb=factory.createProductB();
		apa.whatProduct();
		abb.whenProduct();
		factory =new ConcreteFactoryB();
		apa=factory.createProductA();
		abb=factory.createProductB();
		apa.whatProduct();
		abb.whenProduct();
	}

}
