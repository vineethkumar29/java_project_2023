package day05;

public class Programe03 extends
Programe02{

	public static void main(String[] args) {
		Programe03 x=new Programe03();
		x.add(10,20);

	}
    @Override
    public void add(int a,int b)
    {
    	System.out.println((a*a)+(b*b));
    }
}
