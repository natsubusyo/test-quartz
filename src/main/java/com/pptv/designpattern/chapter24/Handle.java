package com.pptv.designpattern.chapter24;

public abstract class Handle {

	protected Handle next;

	public void setNext(Handle next) {
		this.next = next;
	}
	
	public abstract void handleRequest(int request);
}
