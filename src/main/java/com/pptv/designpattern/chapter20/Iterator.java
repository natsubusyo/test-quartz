package com.pptv.designpattern.chapter20;

public interface Iterator {
	 public  Object First();
     public  Object Next();
     public  boolean IsDone();
     public  Object CurrentItem();
}
