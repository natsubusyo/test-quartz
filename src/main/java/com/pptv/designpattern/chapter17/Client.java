package com.pptv.designpattern.chapter17;

public class Client {

	public static void main(String[] args) {
		
		Player p=new Translator();
		p.offense();
		p.defense();
	}

}
