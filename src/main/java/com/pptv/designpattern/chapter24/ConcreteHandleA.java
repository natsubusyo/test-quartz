package com.pptv.designpattern.chapter24;

public class ConcreteHandleA extends Handle {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=0&&request<=10){
			System.out.println("ConcreteHandleA 处理了请求："+request);
		}else if(next!=null){
			next.handleRequest(request);
		}
	}

}
