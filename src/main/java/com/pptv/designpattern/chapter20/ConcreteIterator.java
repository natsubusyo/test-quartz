package com.pptv.designpattern.chapter20;

public class ConcreteIterator implements Iterator {

	private ConcreteAggregate aggregate;
    private int current = 0;

    public ConcreteIterator(ConcreteAggregate aggregate)
    {
        this.aggregate = aggregate;
    }

	@Override
	public Object First() {
		// TODO Auto-generated method stub
		return aggregate.getItem(0);
	}

	@Override
	public Object Next() {
		// TODO Auto-generated method stub
		Object ret = null;
        current++;

        if (current < aggregate.getSize())
        {
            ret = aggregate.getItem(current);
        }

        return ret;
	}

	@Override
	public boolean IsDone() {
		// TODO Auto-generated method stub
		 return current >= aggregate.getSize() ? true : false;
	}

	@Override
	public Object CurrentItem() {
		// TODO Auto-generated method stub
		return aggregate.getItem(current);
	}

}
