package com.pptv.designpattern.chapter14;

public class ConcreteObserve extends Observe {

	private String name;
	
	private String observeStatus;
	
	private ConcreteSubject cs;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getObserveStatus() {
		return observeStatus;
	}


	public void setObserveStatus(String observeStatus) {
		this.observeStatus = observeStatus;
	}


	public ConcreteSubject getCs() {
		return cs;
	}


	public void setCs(ConcreteSubject cs) {
		this.cs = cs;
	}


	public ConcreteObserve(String name,   ConcreteSubject cs) {
		super();
		this.name = name;
		this.cs = cs;
	}


	@Override
	void update() {
		// TODO Auto-generated method stub
		observeStatus=cs.getSubjectStatus();
		System.out.println("观察者"+name+"的状态 "+observeStatus );
	}

}
