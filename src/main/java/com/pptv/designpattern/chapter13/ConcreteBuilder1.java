package com.pptv.designpattern.chapter13;

public class ConcreteBuilder1 extends Builder {

	private Product p=new Product();
	
	@Override
	void buildPartA() {
		// TODO Auto-generated method stub
		p.addPart("部件A");
	}

	@Override
	void buildPartB() {
		// TODO Auto-generated method stub
		p.addPart("部件B");
	}

	@Override
	Product getProduct() {
		// TODO Auto-generated method stub
		return p;
	}

}
