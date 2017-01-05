package com.pptv.designpattern.chapter13;

public class Director {

	public void Construct(Builder b){
		b.buildPartA();
		b.buildPartB();
	}
}
