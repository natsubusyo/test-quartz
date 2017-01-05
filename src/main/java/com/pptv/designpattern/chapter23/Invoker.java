package com.pptv.designpattern.chapter23;

public class Invoker {

	private Command commend;

	public Command getCommend() {
		return commend;
	}

	public void setCommend(Command commend) {
		this.commend = commend;
	}
	
	public void excution(){
		commend.excute();
	}
}
