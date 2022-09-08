package javaLogicalPgms;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int num=5;
		int a=0,b=0;
		int c=1;
		
		int x=10,y=12;//value swapping without using third vairable
		System.out.print("X="+x);
		System.out.println(",Y="+y);
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.print("X="+x);
		System.out.println(",Y="+y);
		
		for(int i=0; i<=num; i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(c+", ");
		}
	}

}
