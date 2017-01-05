package com.pptv.designpattern.chapter8;
import com.pptv.designpattern.chapter8.IFactory;
import com.pptv.designpattern.chapter8.Operate;
import com.pptv.designpattern.chapter8.OperateMultiply;


public class FactoryMultiply implements IFactory {

	@Override
	public Operate createOperate() {
		// TODO Auto-generated method stub
		return new OperateMultiply();
	}

}
