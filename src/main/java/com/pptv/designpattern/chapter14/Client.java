package com.pptv.designpattern.chapter14;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcreteSubject  cs=new ConcreteSubject();
		
		cs.attach(new ConcreteObserve("xwx", cs));
		cs.attach(new ConcreteObserve("xwx2", cs));
		
		cs.setSubjectStatus("go");
		
		cs.notification();
	}

}
