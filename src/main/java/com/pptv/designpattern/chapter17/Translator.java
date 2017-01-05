package com.pptv.designpattern.chapter17;

public class Translator implements Player {

	private ForeignCenter fc =new ForeignCenter(); 

	@Override
	public void offense() {
		// TODO Auto-generated method stub
		fc.进攻();
	}

	@Override
	public void defense() {
		// TODO Auto-generated method stub
		fc.防守();
	}

}
