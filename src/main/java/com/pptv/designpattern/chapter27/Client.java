package com.pptv.designpattern.chapter27;

public class Client {

	public static void main(String[] args) {
		
		 PlayContext context = new PlayContext();
         //音乐-上海滩
		 System.out.println("上海滩：");
         //context.演奏文本 = "T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 D 0.5 E 0.5 G 3 D 0.5 E 0.5 O 1 A 3 A 0.5 O 2 C 0.5 D 1.5 E 0.5 D 0.5 O 1 B 0.5 A 0.5 O 2 C 0.5 O 1 G 3 P 0.5 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 D 0.5 E 0.5 G 3 D 0.5 E 0.5 O 1 A 3 A 0.5 O 2 C 0.5 D 1.5 E 0.5 D 0.5 O 1 B 0.5 A 0.5 G 0.5 O 2 C 3 P 0.5 O 3 C 0.5 C 0.5 O 2 A 0.5 O 3 C 2 P 0.5 O 2 A 0.5 O 3 C 0.5 O 2 A 0.5 G 2.5 G 0.5 E 0.5 A 1.5 G 0.5 C 1 D 0.25 C 0.25 D 0.5 E 2.5 E 0.5 E 0.5 D 0.5 E 2.5 O 3 C 0.5 C 0.5 O 2 B 0.5 A 3 E 0.5 E 0.5 D 1.5 E 0.5 O 3 C 0.5 O 2 B 0.5 A 0.5 E 0.5 G 2 P 0.5 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 D 0.5 E 0.5 G 3 D 0.5 E 0.5 O 1 A 3 A 0.5 O 2 C 0.5 D 1.5 E 0.5 D 0.5 O 1 B 0.5 A 0.5 G 0.5 O 2 C 3 ";
         context.setText("T 500 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ") ;
         //音乐-隐形的翅膀
         //Console.WriteLine("隐形的翅膀："); 
         //context.演奏文本 = "T 1000 O 1 G 0.5 O 2 C 0.5 E 1.5 G 0.5 E 1 D 0.5 C 0.5 C 0.5 C 0.5 C 0.5 O 1 A 0.25 G 0.25 G 1 G 0.5 O 2 C 0.5 E 1.5 G 0.5 G 0.5 G 0.5 A 0.5 G 0.5 G 0.5 D 0.25 E 0.25 D 0.5 C 0.25 D 0.25 D 1 A 0.5 G 0.5 E 1.5 G 0.5 G 0.5 G 0.5 A 0.5 G 0.5 E 0.5 D 0.5 C 0.5 C 0.25 D 0.25 O 1 A 1 G 0.5 A 0.5 O 2 C 1.5 D 0.25 E 0.25 D 1 E 0.5 C 0.5 C 3 O 1 G 0.5 O 2 C 0.5 E 1.5 G 0.5 E 1 D 0.5 C 0.5 C 0.5 C 0.5 C 0.5 O 1 A 0.25 G 0.25 G 1 G 0.5 O 2 C 0.5 E 1.5 G 0.5 G 0.5 G 0.5 A 0.5 G 0.5 G 0.5 D 0.25 E 0.25 D 0.5 C 0.25 D 0.25 D 1 A 0.5 G 0.5 E 1.5 G 0.5 G 0.5 G 0.5 A 0.5 G 0.5 E 0.5 D 0.5 C 0.5 C 0.25 D 0.25 O 1 A 1 G 0.5 A 0.5 O 2 C 1.5 D 0.25 E 0.25 D 1 E 0.5 C 0.5 C 3 E 0.5 G 0.5 O 3 C 1.5 O 2 B 0.25 O 3 C 0.25 O 2 B 1 A 0.5 G 0.5 A 0.5 O 3 C 0.5 O 2 E 0.5 D 0.5 C 1 C 0.5 C 0.5 C 0.5 O 3 C 1 O 2 G 0.25 A 0.25 G 0.5 D 0.25 E 0.25 D 0.5 C 0.25 D 0.25 D 3 E 0.5 G 0.5 O 3 C 1.5 O 2 B 0.25 O 3 C 0.25 O 2 B 1 A 0.5 G 0.5 A 0.5 O 3 C 0.5 O 2 E 0.5 D 0.5 C 1 C 0.5 C 0.5 C 0.5 O 3 C 1 O 2 G 0.25 A 0.25 G 0.5 D 0.25 E 0.25 D 0.5 C 0.5 C 3 ";
         Expression expression = null;
         try
         {
             while (context.getText().length() > 0)
             {
                 String str = context.getText().substring(0, 1);
                 switch (str)
                 {
                     case "O":
                         expression = new Scale();
                         break;
                     case "T":
                         expression = new Speed();
                         break;
                     case "C":
                     case "D":
                     case "E":
                     case "F":
                     case "G":
                     case "A":
                     case "B":
                     case "P":
                         expression = new Note();
                         break;

                 }
                 expression.Interpret(context);

             }
         }
         catch (Exception ex)
         {
        	 ex.printStackTrace();
             System.out.println(ex.getMessage());
         }

	}

}
