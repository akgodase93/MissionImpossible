package javaLogicalPgms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be checked:");
		int num=s.nextInt();
		if(num %2 == 0)
		{
			System.out.println("Even Number: "+num);
		}
		else
		{
			System.out.println("Odd Number: "+num);
		}
	}

}
