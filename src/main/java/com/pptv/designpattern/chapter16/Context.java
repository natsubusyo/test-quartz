package com.pptv.designpattern.chapter16;

public class Context {

	public Context(State state) {
		super();
		this.state = state;
	}

	private State state;

	public State getState() {
		
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void request(){
		
		state.handle(this);
	}
}
