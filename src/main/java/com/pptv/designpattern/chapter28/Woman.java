package com.pptv.designpattern.chapter28;

public class Woman implements Person {

	@Override
	public void Accept(Action visitor) {
		// TODO Auto-generated method stub

		visitor.GetWomanConclusion(this);
	}

}
