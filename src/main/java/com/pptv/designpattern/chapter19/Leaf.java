package com.pptv.designpattern.chapter19;

public class Leaf extends Component {

	
	public Leaf(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		System.out.println("Can't add to a leaf");
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		System.out.println("Can't remove to a leaf");
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub
		System.out.println("-"+depth+" "+name);
	}

}
