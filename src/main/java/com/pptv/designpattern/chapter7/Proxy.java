package com.pptv.designpattern.chapter7;

public class Proxy implements GiveGift {

	Pursuit proxy;
	
	public Proxy(SchoolGirl sg) {
		super();
		this.proxy = new Pursuit(sg);
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		proxy.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		proxy.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		proxy.giveChocolate();
	}

}
