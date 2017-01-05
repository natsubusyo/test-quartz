package com.pptv.designpattern.chapter19;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Composite root=new Composite("root");
		
		root.add(new Leaf("A"));
		root.add(new Leaf("B"));
		
		Composite comp=new Composite("Composite 1");
		
		comp.add(new Leaf("Composite 1A"));
		comp.add(new Leaf("Composite 1B"));
		root.add(comp);
		
		
		
		Composite comp2=new Composite("Composite 12");
		
		comp2.add(new Leaf("Composite 1A2"));
		comp2.add(new Leaf("Composite 1B2"));
		
		comp.add(comp2);
		Leaf l=new Leaf("C");
		Leaf l2=new Leaf("D");
		root.add(l2);
		root.add(l);
		root.remove(l);
		root.display(1);
	}

}
