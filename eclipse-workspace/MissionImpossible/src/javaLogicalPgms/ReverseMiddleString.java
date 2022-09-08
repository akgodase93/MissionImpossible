package javaLogicalPgms;

public class ReverseMiddleString 
{	
	public static String reverseString(String inp)
	{
		String rev = "";
		for(int i=inp.length()-1; i>=0; i--)
		{
			char c=inp.charAt(i);
			rev=rev+c;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		String str="abc xyz abc1 xyz1";
		String ar[]=str.split(" ");
		for(int i=0; i<=ar.length-1; i++)
		{	
			if(i % 2 == 0)
			{
				String str1=ar[i];
				ar[i]=reverseString(str1);
			}
		}
		
		for(int i=0; i<=ar.length-1; i++)
		{
			System.out.print(ar[i]+" ");
		}
		
	}

}
