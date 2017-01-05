package com.pptv.designpattern.chapter24;

public class ConcreteHandleB extends Handle {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=11&&request<=20){
			System.out.println("ConcreteHandleB 处理了请求："+request);
		}else if(next!=null){
			next.handleRequest(request);
		}
	}

}
