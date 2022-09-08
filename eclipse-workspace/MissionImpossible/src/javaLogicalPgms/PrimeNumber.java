package javaLogicalPgms;

public class PrimeNumber {

	public static void main(String[] args)
	{
		int num=4;
		int count=0;
		for(int i=2; i<num; i++)
		{
			if(num % i == 0)
			{
				count ++ ;
				break;
			}
		
		}
		
		if(count == 1)
		{
			System.out.println("Not a Prime Number:"+num);
		}
		else
		{
			System.out.println("Prime Number:"+num);
		}
		
	}

}
