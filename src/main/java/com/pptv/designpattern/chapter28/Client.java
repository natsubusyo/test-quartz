package com.pptv.designpattern.chapter28;

public class Client {

	public static void main(String[] args) {
		
		ObjectStructure o = new ObjectStructure();
        o.Attach(new Man());
        o.Attach(new Woman());

        Success v1 = new Success();
        o.Display(v1);

        Failing v2 = new Failing();
        o.Display(v2);
	}

}
