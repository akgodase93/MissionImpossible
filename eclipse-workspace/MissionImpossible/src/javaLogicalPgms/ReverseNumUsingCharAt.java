package javaLogicalPgms;

public class ReverseNumUsingCharAt {

	public static void main(String[] args) 
	{
		int num=102;
		
		String str=Integer.toString(num);
		String revNum="";
		for(int i=str.length()-1; i>=0; i--)
		{
		
			revNum=revNum+str.charAt(i);
		}
		System.out.println(revNum);
	}

}
