package com.pptv.designpattern.chapter26;

public class ConcreteFlyweight implements Flyweight {

	@Override
	public void Operation(int extrinsicstate) {
		// TODO Auto-generated method stub
		System.out.println("具体Flyweight:" + extrinsicstate);
	}

}
