package day06;
import java.util.Scanner;
public class Programe01 {

	public static void main(String[] args) { 
		// +-*/(Q)%(R)Numbers
        Scanner x=new Scanner(System.in);
		System.out.println("Enter int value of a:-");
		int a=x.nextInt();
		
		System.out.println("Enter int value of b:-");
		int b=x.nextInt();
		
		System.out.println("Enter Double valu of c:-");
		double c=x.nextDouble();
		x.close();
		//int()int--->int
		//int()Double/float--->Double/float
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		System.out.println(a*b);
		System.out.println(a*c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
		System.out.println(a%b);
		System.out.println(a%c);







	}

}
