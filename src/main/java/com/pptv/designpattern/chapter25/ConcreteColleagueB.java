package com.pptv.designpattern.chapter25;

public class ConcreteColleagueB extends Colleague {

	public ConcreteColleagueB(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	public void send(String message){
		System.out.println("ConcreteColleagueB 发送消息："+message);
		mediator.send(message, this);
	}
	
	public void notification(String message){
		
		System.out.println("ConcreteColleagueB 得到消息："+message);
	}
	
}
