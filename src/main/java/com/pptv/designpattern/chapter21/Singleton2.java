package com.pptv.designpattern.chapter21;

public class Singleton2 {

	//懒汉式单例类.在第一次调用的时候实例化自己 
	private static Singleton2 instance=null;
	private Singleton2(){}
	
	//静态工厂方法  在getInstance方法上加同步
	public static synchronized Singleton2 getInstance(){
		
		if(instance==null){
			instance=new Singleton2();
		}
		return instance;
	}
	
}
