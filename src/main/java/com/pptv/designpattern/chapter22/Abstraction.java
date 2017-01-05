package com.pptv.designpattern.chapter22;

public abstract class Abstraction {

	protected Implementor implementor;

	public Implementor getImplementor() {
		return implementor;
	}

	public void setImplementor(Implementor implementor) {
		this.implementor = implementor;
	}
	
	public abstract void Operation();
}
