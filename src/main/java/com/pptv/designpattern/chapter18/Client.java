package com.pptv.designpattern.chapter18;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Originator o=new Originator();
		o.setState("ON");
		o.show();
		
		Caretaker c=new Caretaker();
		c.setMemento(o.createMemento());
		
		o.setState("OFF");
		o.show();
		
		o.setMemento(c.getMemento());
		o.show();
		
	}

}
