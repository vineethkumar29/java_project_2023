package day11;

import java.util.Scanner;

public class Program07 {

	public static void main(String[] args) {
	 Scanner x=new Scanner(System.in);
	 System.out.println("Enter the Mobile Name:-");
	 String mobile=x.next();
	 
	 if("oppo".equals(mobile)||
		"one+".equals(mobile)||
		"mi".equals(mobile))
	 {
		 System.out.println("Enter the Mobile Price:-");
		 int price=x.nextInt();
		 if(("oppo".equals(mobile)&&(price>=15000&&price<=30000))||("one+".equals(mobile)&&(price>=25000&&price<=40000))||("mi".equals(mobile)&&(price>=10000&&price<=20000)))
		 {
			 System.out.println("Enter the Mobile Colour:-");
			 String colour=x.next();
			 if(("oppo".equals(mobile)&&(colour.equals("red")||colour.equals("black")))||("one+".equals(mobile)&&(colour.equals("blue")||colour.equals("black")))||("mi".equals(mobile)&&(colour.equals("white")||colour.equals("red"))))
         {
        	 System.out.println("Requested Mobile is available for your given Price and colour");
         }
         else
         {
        	 System.out.println("Requested Mobile is not avilable for given colour");
         }
	
}
		 else
		 {
			 System.out.println("Requested Mobile is not available for given price");
	  }
	 }
	 
	else
	{
		 System.out.println("Requested Mobile is not available ");	
	 }
        x.close();
	}

}
