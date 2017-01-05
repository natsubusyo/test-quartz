package com.pptv.designpattern.chapter27;

public class Scale extends Expression {

	@Override
	public void Excute(String key, double value) {
		// TODO Auto-generated method stub
		String scale = "";
        switch (Integer.parseInt(String.valueOf(value).substring(0, String.valueOf(value).indexOf("."))))
        {
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;

        }
       System.out.println(scale);
	}

}
