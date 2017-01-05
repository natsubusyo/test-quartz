package com.pptv.designpattern.chapter10;

public abstract class AbstractClass {

	
	public abstract void primitiveOperate1();
	public abstract void primitiveOperate2();
	
	public void TemplateMethod(){
		primitiveOperate1();
		primitiveOperate2();
		System.out.println("-------");
	}
}
