package javaLogicalPgms;

public class NumberPalindrome {

	public static void main(String[] args) 
	{
		int num=101;
		int revNum = 0;
		
		for(int i=num; i>0; i=i/10)
		{
			int reminder= i % 10;
			revNum=revNum * 10 + reminder;
		}
		System.out.println("Oringnal Number: "+num);
		System.out.println("Reversed Number: "+revNum);
		
		if(num==revNum)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}

}
