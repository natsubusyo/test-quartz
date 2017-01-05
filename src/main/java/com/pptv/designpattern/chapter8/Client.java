package com.pptv.designpattern.chapter8;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IFactory factory=new FactoryMultiply();
		Operate op=factory.createOperate();
		op.number1=5;
		op.number2=4;
		System.out.println(op.getResult());
	}

}
