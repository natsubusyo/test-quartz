package com.pptv.designpattern.chapter24;

public class ConcreteHandleC extends Handle {

	@Override
	public void handleRequest(int request) {
		// TODO Auto-generated method stub
		if(request>=21&&request<=30){
			System.out.println("ConcreteHandleC 处理了请求："+request);
		}else if(next!=null){
			next.handleRequest(request);
		}
	}

}
