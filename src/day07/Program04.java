package day07;

public class Program04 {

	public static void main(String[] args) {
		int a=30;
		int b=25;
		int c=35;
		
		if(a>b && a>c)
		{
			System.out.println("a is greater...!");
		}
		else if(b>a && b>c)
		{
            System.out.println("b is greater...!");
	    }
		else if(c>a && c>b)
		{
			System.out.println("c is greater...!");
		}
		else if(a==b && a==c)
		{
			System.out.println("a&b&c are equal...!");
		}
		else if(a==c)
		{
			System.out.println("a&c are equal...!");
		}
		else if(c==b)
		{
			System.out.println("c&b are equal...!");
		}
		else if(a==b)
		{
			System.out.println("a&b are equal...!");
		}
	}

}
