package com.pptv.designpattern.chapter20;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate implements Aggregate {

	 private List<Object> items = new ArrayList<Object>();
	
	@Override
	public Iterator CreateIterator() {
		// TODO Auto-generated method stub
		return new ConcreteIterator(this);
	}

	public Object getItem(int index){
		return items.get(index);
	}
	public void setItem(int index,Object obj){
		 items.add(index, obj);;
	}
	public int getSize(){
		return items.size();
	}
}
