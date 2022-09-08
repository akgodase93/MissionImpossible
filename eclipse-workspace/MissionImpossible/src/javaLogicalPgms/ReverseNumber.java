package javaLogicalPgms;

public class ReverseNumber {

	public static void main(String[] args) 
	{
		int num=100;
		int reverseNumber = 0;
		
		for(int i=num; i>0;i= i / 10)
		{
			int reminder=i % 10;
			reverseNumber=reverseNumber * 10 + reminder;
		}
		System.out.println("Reverse Number"+reverseNumber);
		
	}

}
