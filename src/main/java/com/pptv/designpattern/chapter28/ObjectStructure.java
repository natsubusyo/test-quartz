package com.pptv.designpattern.chapter28;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

	private List<Person> elements = new ArrayList<Person>();

    //增加
    public void Attach(Person element)
    {
        elements.add(element);
    }
    //移除
    public void Detach(Person element)
    {
        elements.remove(element);
    }
    //查看显示
    public void Display(Action visitor)
    {
        for (Person e : elements)
        {
            e.Accept(visitor);
        }
    }
}
