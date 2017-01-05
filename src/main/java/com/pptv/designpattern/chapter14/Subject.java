package com.pptv.designpattern.chapter14;

import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

	private List<Observe> observers=new ArrayList<Observe>();
	
	public void attach(Observe o){
		observers.add(o);
	}
	
	public void dttach(Observe o){
		observers.remove(o);
	}
	
	public void notification(){
		for(Observe o:observers){
			o.update();;
		}
	}
	
}
