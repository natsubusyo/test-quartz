package com.pptv.designpattern.chapter28;

public interface Action {

	   //得到男人结论或反应
    public void GetManConclusion(Man concreteElementA);
    //得到女人结论或反应
    public void GetWomanConclusion(Woman concreteElementB);
}
