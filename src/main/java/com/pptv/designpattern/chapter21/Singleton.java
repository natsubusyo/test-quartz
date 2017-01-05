package com.pptv.designpattern.chapter21;

public class Singleton {

	//懒汉式单例类.在第一次调用的时候实例化自己 
	private static Singleton instance=null;
	private Singleton(){}
	
	//静态工厂方法  
	public static Singleton getInstance(){
		
		if(instance==null){
			instance=new Singleton();
		}
		return instance;
	}
	
}
