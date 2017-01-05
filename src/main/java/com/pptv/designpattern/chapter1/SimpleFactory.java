package com.pptv.designpattern.chapter1;

public class SimpleFactory {

	public static Operate getOperate(String operate){
		
		Operate oper = null;
          switch (operate)
          {
              case "+":
                  {
                      oper = new OperatePlus();
                      break;
                  }
              case "-":
                  {
                      oper = new OperateMinus();
                      break;
                  }
              case "*":
                  {
                      oper = new OperateMultiply();
                      break;
                  }
          }

          return oper;
		
	}
	
}
