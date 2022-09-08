package javaLogicalPgms;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		int num=27;
		int sum=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int reminder = i % 10;
			sum = sum+ (reminder * reminder * reminder);
		}
		System.out.println("Sum of decimal numbers cube: "+sum);
		
		if(num==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong number");
	}

}
