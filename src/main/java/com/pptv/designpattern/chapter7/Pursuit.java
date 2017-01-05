package com.pptv.designpattern.chapter7;

public class Pursuit implements GiveGift {

	SchoolGirl sg;
	
	
	public Pursuit(SchoolGirl sg) {
		super();
		this.sg = sg;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() +"送你玩具！");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() +"送你鲜花！");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(sg.getName() +"送你巧克力！");
	}

}
