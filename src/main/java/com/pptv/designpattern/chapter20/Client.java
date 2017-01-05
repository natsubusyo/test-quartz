package com.pptv.designpattern.chapter20;

public class Client {

	public static void main(String[] args) {
		
		ConcreteAggregate a = new ConcreteAggregate();
        a.setItem(0, "大鸟");;
        a.setItem(1, "小菜"); 
        a.setItem(2, "行李"); 
        a.setItem(3, "老外"); 
        a.setItem(4, "公交内部员工"); 
        a.setItem(5, "小偷"); 

        Iterator i = new ConcreteIterator(a);
        //Iterator i = new ConcreteIteratorDesc(a);
        Object item = i.First();
        while (!i.IsDone())
        {
        	System.out.println(i.CurrentItem()+"  请买车票!" );
            i.Next();
        }

	}

}
