package com.pptv.designpattern.chapter6;

public abstract class Decorator implements Component {

	protected Component component;

    public void SetComponent(Component component)
    {
        this.component = component;
    }
	
}
