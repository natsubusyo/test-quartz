package com.pptv.designpattern.chapter23;

public class ConcreteCommand implements Command {

	private Receiver receiver;
	
	
	public ConcreteCommand(Receiver receiver) {
		super();
		this.receiver = receiver;
	}

	@Override
	public void excute() {
		// TODO Auto-generated method stub
		receiver.action();
	}

}
