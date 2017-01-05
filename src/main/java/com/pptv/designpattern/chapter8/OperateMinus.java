package com.pptv.designpattern.chapter8;

public class OperateMinus extends Operate {

	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		if (number1 - number2 > 0) {
			return number1 - number2;
		} else {
			return 0.0;
		}
	}

}
