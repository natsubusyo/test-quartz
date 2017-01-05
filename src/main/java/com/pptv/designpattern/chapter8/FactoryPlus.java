package com.pptv.designpattern.chapter8;

public class FactoryPlus implements IFactory {

	@Override
	public Operate createOperate() {
		// TODO Auto-generated method stub
		return new OperatePlus();
	}

}
