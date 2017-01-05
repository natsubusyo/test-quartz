package com.pptv.designpattern.chapter1;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operate op=SimpleFactory.getOperate("*");
		
		op.number1=1;
		op.number2=3;
		System.out.println(op.getResult());
	}

}
