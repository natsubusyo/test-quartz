package com.pptv.designpattern.chapter27;

public class Speed extends Expression {

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub

		String speed;
        if (value < 500)
            speed = "快速";
        else if (value >= 1000)
            speed = "慢速";
        else
            speed = "中速";
        
        System.out.println(speed);
	}

}
