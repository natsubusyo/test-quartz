package com.pptv.designpattern.chapter16;

public class ConcreteStateB extends State {

	@Override
	public void handle(Context ctx) {
		// TODO Auto-generated method stub
		System.out.println("ConcreteStateB");
		ctx.setState(new ConcreteStateA());
		
	}

}
