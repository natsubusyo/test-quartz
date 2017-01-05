package com.pptv.designpattern.chapter21;

public class Singleton4 {

	private Singleton4() {
	}
	// 静态内部类
	private static class LazyHolder{
		private static final Singleton4 instance = new Singleton4();
	}
	public static Singleton4 getInstance() {
		return LazyHolder.instance;
	}

}
