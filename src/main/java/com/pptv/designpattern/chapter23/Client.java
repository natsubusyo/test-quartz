package com.pptv.designpattern.chapter23;

import com.pptv.designpattern.chapter23.Command;
import com.pptv.designpattern.chapter23.ConcreteCommand;
import com.pptv.designpattern.chapter23.Invoker;
import com.pptv.designpattern.chapter23.Receiver;

public class Client {

	public static void main(String[] args) {

		Receiver r=new Receiver();
		Invoker i=new Invoker();
		Command c=new ConcreteCommand(r);
		
		i.setCommend(c);
		i.excution();
		
	}

}
