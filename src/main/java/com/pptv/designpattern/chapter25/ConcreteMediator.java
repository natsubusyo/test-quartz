package com.pptv.designpattern.chapter25;

public class ConcreteMediator implements Mediator {

	private ConcreteColleagueA concreteColleagueA;
	private ConcreteColleagueB concreteColleagueB;
	
	public ConcreteColleagueA getConcreteColleagueA() {
		return concreteColleagueA;
	}

	public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
		this.concreteColleagueA = concreteColleagueA;
	}

	public ConcreteColleagueB getConcreteColleagueB() {
		return concreteColleagueB;
	}

	public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
		this.concreteColleagueB = concreteColleagueB;
	}

	@Override
	public void send(String message, Colleague colleague) {
		// TODO Auto-generated method stub
		if(colleague==concreteColleagueA){
			concreteColleagueB.notification(message);
		}else{
			concreteColleagueA.notification(message);
		}
	}

}
