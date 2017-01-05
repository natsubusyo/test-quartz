package com.pptv.designpattern.chapter25;

public class Client {

	public static void main(String[] args) {
		
		ConcreteMediator concreteMediator=new ConcreteMediator();
		
		ConcreteColleagueA concreteColleagueA=new ConcreteColleagueA(concreteMediator);
		ConcreteColleagueB concreteColleagueB=new ConcreteColleagueB(concreteMediator);
		
		concreteMediator.setConcreteColleagueA(concreteColleagueA);
		concreteMediator.setConcreteColleagueB(concreteColleagueB);
		
		concreteColleagueA.send("How are you!");
		concreteColleagueB.send("Find. Thank you ,and you.");
	}

}
