package com.pptv.designpattern.chapter16;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Context ctx=new Context(new ConcreteStateA());
		ctx.request();
		ctx.request();
		ctx.request();
		ctx.request();
		ctx.getState();
	}

}
