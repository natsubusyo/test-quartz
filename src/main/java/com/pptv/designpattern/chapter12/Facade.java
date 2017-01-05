package com.pptv.designpattern.chapter12;

public class Facade {

	private SubSystemOne s1;
	private SubSystemTwo s2;
	private SubSystemThree s3;
	private SubSystemFour s4;
	
	public Facade() {
		super();
		this.s1 = new SubSystemOne();
		this.s2 = new SubSystemTwo();
		this.s3 = new SubSystemThree();
		this.s4 = new SubSystemFour();
	}
	
	public void method1(){
		s1.methodOne();
		s3.methodThree();
	}
	public void method2(){
		s2.methodTwo();
		s3.methodThree();
		
	}
}
