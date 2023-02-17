package day08;

public class Program02 {

	public static void main(String[] args) 
	{
		int a=90;
		int b=20;
		int c=100;
		int d=150;
		
		if(a>=b && a>=c && a>=d)
		{
			if(a==b && a==c && a==d)
			{
				System.out.println("a,b,c&d are equal");
			}
			else if(a==b && a==c && a>d)
			{
				System.out.println("a,b,c are equal and greater than d");
			}
			else if(a==c && a==d && a>b)
			{
				System.out.println("a,c,d are equal and greater than b");
			}
			else if(a==b && a==d && a>c)
			{
				System.out.println("a,b,d ate equal and greater than c");
			}
			else if(b==c && b==d)
			{
				System.out.println("a is greater than b,c,d which are equal");
			}
			else if(a==b && a>c && a>d)
			{
				if(c>d)
				{
					System.out.println("a&b are equal and greater than c and c is greater than d");
				}
				else
				{
					System.out.println("a&b are equal and greater than d and d is greater than c");	
				}
			}
			else if(a==c && a>b && a>d)
			{
			if(b>d)
			{
			System.out.println("a&c are equal and greater than b and b is greater than d");	
			}
			else
			{
				System.out.println("a&c are equal and greater than d and d is greater than b");
			}
			}
			else if(a==d && a>b && a>c)
			{
				if(b>c)
				{
					System.out.println("a&d are equal and greater than b and b is greater than c");
				}
				else
				{
					System.out.println("a&d are equal and greater than c and c is greater than b");
				}
			}
			else if(b>=c && b>=d)
			{
				if(b==c && b>d)
				{
				System.out.println("a is greater than b&c, which are equal and greater than d");	
				}
				else if(b==d && b>c)
				{
					System.out.println("a is greater than b&d,which are equal and greater than c");
				}
				else if(c==d)
				{
					System.out.println("a is greater than b and b is greater than c&d which are equal");
				}
				else if(c>d)
				{
					System.out.println("a is greater than b and b is greater than c and c is greater than d");
				}
				else
				{
					System.out.println("a is greater than b and b is greater than d and d is greater than c");
				}
				
			}
			else if(c>=b && c>=d)
			{
				if(c==d)
				{
					System.out.println("a is greater than c&d,which are equal and greater than b");
				}
				else if(b==d)
				{
					System.out.println("a is greater than c and c is greater than b&d which are equal");
				}
				else if(b>d)
				{
					System.out.println("a is greater than c and c is greater than b and b is greater than d");
				}
				else
				{
					System.out.println("a is greater than c and c is greater than d and d is greater than b");
				}
			}
			else {
				if(b==c)
				{
					System.out.println("a is greater than d and d is greater than b&c which are equal");
				}
				else if(b>c)
				{
					System.out.println("a is greater than d and d is greater than b and b is greater than c");
				}
				else 
				{
					System.out.println("a is greater than d and d is greater than c and c is greater than b");
				}
			}
		}
		else if(b>=a && b>=c && b>=d)
		{
			if(b==c && b==d)
			{
				System.out.println("b,c,d are equal and greater than a");
			}
			else if(a==c && a==d)
			{
				System.out.println("b is greater than a,c,d which are equal");
			}
			else if(b==c && b>a && b>d)
			{
				if(a>d)
				{
					System.out.println("b&c are equal and greater than a and a is greater than d");
				}
				else
				{
					System.out.println("b&c are equal and greater than d and d is greater than a");
				}
			}
			
			
		}
		

	}

}
