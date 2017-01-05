package com.pptv.designpattern.chapter28;

public class Failing implements Action {

	@Override
	public void GetManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		
		System.out.println("concreteElementA :Failing时，闷头喝酒，谁也不用劝。");
	}

	@Override
	public void GetWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println("concreteElementB :Failing时，眼泪汪汪，谁也劝不了。");
	}

}
