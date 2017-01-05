package com.pptv.designpattern.chapter26;

public class UnsharedConcreteFlyweight implements Flyweight {

	@Override
	public void Operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("不共享的具体Flyweight:" + extrinsicstate);
	}

}
