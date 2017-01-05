package com.pptv.designpattern.chapter21;

public class Singleton3 {

	// 懒汉式单例类.在第一次调用的时候实例化自己
	private volatile static Singleton3 instance = null;

	private Singleton3() {
	}

	// 静态工厂方法 双重校验锁
	public static synchronized Singleton3 getInstance() {
		if (instance == null) {

			synchronized (Singleton3.class) {
				if (instance == null) {
					instance = new Singleton3();
				}
			}
		}
		return instance;
	}

}
