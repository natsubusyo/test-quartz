package com.pptv.designpattern.chapter26;

import java.util.Hashtable;

public class FlyweightFactory {

	private Hashtable<String, Flyweight> flyweights = new Hashtable<String, Flyweight>();

    public FlyweightFactory()
    {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());

    }

    public Flyweight GetFlyweight(String key)
    {
        return ((Flyweight)flyweights.get(key));
    }
	
}
