package com.pptv.designpattern.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private List<String> parts=new ArrayList<String>();
	
	public void addPart(String s){
		parts.add(s);
	}
	
	public void show(){
		for(String s:parts){
			System.out.println(s);
		}
	}
	
}
