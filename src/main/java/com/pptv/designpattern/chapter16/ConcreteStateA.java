package com.pptv.designpattern.chapter16;

public class ConcreteStateA extends State {

	@Override
	public void handle(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteStateA");
		ctx.setState(new ConcreteStateB());
		
	}

}
