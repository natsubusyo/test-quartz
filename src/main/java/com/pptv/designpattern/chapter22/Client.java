package com.pptv.designpattern.chapter22;

public class Client {

	public static void main(String[] args) {
		
		Abstraction ra=new RefinedAbstraction();
		
		ra.setImplementor(new ConcreteImplementorA());
		ra.Operation();
		ra.setImplementor(new ConcreteImplementorB());
		ra.Operation();
	}

}
