package com.pptv.designpattern.chapter28;

public class Man implements Person {

	@Override
	public void Accept(Action visitor) {
		// TODO Auto-generated method stub

		visitor.GetManConclusion(this);
	}

}
