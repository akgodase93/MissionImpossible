package javaLogicalPgms;

public class MultiplicationWithoutUsingOperator {

	public static void main(String[] args) 
	{
		int num1=5;
		int num2=4;
		
		int sum=0;
		for(int i=num2; i>0; i--)
		{
			sum=num1+sum;
		}
		System.out.println(num1+"*"+num2+"="+sum);
		sum=0;
		for(int i=0; i<=num2;i++)
		{
			sum=sum+num2;
		}
		System.out.println(num1+"*"+num2+"="+sum);
	}

}
