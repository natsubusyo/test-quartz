package com.pptv.designpattern.chapter13;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Builder b1=new ConcreteBuilder1();
		Builder b2=new ConcreteBuilder2();
		Director d=new Director();
	
		d.Construct(b1);
		Product p=b1.getProduct();
		p.show();
		
		d.Construct(b2);
		Product p2=b2.getProduct();
		p2.show();
	}

}
