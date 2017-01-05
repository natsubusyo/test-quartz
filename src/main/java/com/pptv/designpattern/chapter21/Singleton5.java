package com.pptv.designpattern.chapter21;

public class Singleton5 {
	// 饿汉式单例类.在类初始化时，已经自行实例化   
	private static final Singleton5 instance = new Singleton5();
	private Singleton5() {
	}
	// 静态工厂方法 
	public static Singleton5 getInstance() {
		return instance;
	}

}
