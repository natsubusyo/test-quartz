package com.pptv.designpattern.chapter26;

public class Client {

	public static void main(String[] args) {
	
		int extrinsicstate = 22;
		
		FlyweightFactory factory=new FlyweightFactory();
		
		Flyweight fx=factory.GetFlyweight("X");
		fx.Operation(--extrinsicstate);
		
		Flyweight fy=factory.GetFlyweight("Y");
		fy.Operation(--extrinsicstate);
		
		Flyweight fz=factory.GetFlyweight("Z");
		fz.Operation(--extrinsicstate);
		
		UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();

        uf.Operation(--extrinsicstate);

	}

}
