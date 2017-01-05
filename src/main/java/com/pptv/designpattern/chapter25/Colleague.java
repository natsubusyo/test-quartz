package com.pptv.designpattern.chapter25;

public abstract class Colleague {

	protected Mediator mediator;

	public Colleague(Mediator mediator) {
		super();
		this.mediator = mediator;
	}
	
	
}
