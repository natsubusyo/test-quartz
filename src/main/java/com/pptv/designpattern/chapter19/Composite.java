package com.pptv.designpattern.chapter19;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

	private List<Component> chlidren=new ArrayList<Component>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		// TODO Auto-generated method stub
		chlidren.add(component);
		
	}

	@Override
	public void remove(Component component) {
		// TODO Auto-generated method stub
		chlidren.remove(component);
	}

	@Override
	public void display(int depth) {
		// TODO Auto-generated method stub

		System.out.println("-"+depth+" "+name);
		for(Component component:chlidren){
			component.display(depth+1);
		}
	}

}
