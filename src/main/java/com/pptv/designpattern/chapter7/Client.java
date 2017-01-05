package com.pptv.designpattern.chapter7;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SchoolGirl sg=new SchoolGirl("yanmei");
		Proxy proxy=new Proxy(sg);
		proxy.giveChocolate();
	}

}
