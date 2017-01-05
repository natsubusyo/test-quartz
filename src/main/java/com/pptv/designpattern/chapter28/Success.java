package com.pptv.designpattern.chapter28;

public class Success implements Action {

	@Override
	public void GetManConclusion(Man concreteElementA) {
		// TODO Auto-generated method stub
		
		System.out.println("concreteElementA :Success时，背后多半有一个伟大的女人。");
	}

	@Override
	public void GetWomanConclusion(Woman concreteElementB) {
		// TODO Auto-generated method stub
		System.out.println("concreteElementB :Success时，背后大多有一个不成功的男人。");
	}

}
