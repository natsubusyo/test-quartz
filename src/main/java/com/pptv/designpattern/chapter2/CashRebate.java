package com.pptv.designpattern.chapter2;

public class CashRebate extends SuperCash {

	private double moneyRebate = 1d;
    //初始化时，必需要输入折扣率,如八折，就是0.8
    public CashRebate(String moneyRebate)
    {
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }
	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return moneyRebate*money;
	}

}
