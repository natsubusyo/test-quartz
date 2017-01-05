package com.pptv.designpattern.chapter13;

public class ConcreteBuilder2 extends Builder {

	private Product p=new Product();
	
	@Override
	void buildPartA() {
		// TODO Auto-generated method stub
		p.addPart("部件X");
	}

	@Override
	void buildPartB() {
		// TODO Auto-generated method stub
		p.addPart("部件Y");
	}

	@Override
	Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}

}
